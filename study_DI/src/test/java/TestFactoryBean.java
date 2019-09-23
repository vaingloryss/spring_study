import com.vainglory.bean.User;
import com.vainglory.dao.IUserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestFactoryBean {

    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryBean.xml");
        //使用FactoryBean生成SqlSessionFactory对象
        //SqlSessionFactory sqlSessionFactory = applicationContext.getBean("sqlSessionFactory", SqlSessionFactory.class);
        //使用静态工厂方法，生成SqlSessionFactory对象
        //SqlSessionFactory sqlSessionFactory1 = applicationContext.getBean("sqlSessionFactory1", SqlSessionFactory.class);
        //使用工厂方法，生成SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory2 = applicationContext.getBean("sqlSessionFactory2", SqlSessionFactory.class);

        if (sqlSessionFactory2!=null){
            SqlSession sqlSession = sqlSessionFactory2.openSession();
            IUserDao userDao = sqlSession.getMapper(IUserDao.class);
            User user1 = userDao.findById(1);
            System.out.println(user1.toString());
        }else {
            System.out.println("sqlSessionFactory id null");
        }
    }
}
