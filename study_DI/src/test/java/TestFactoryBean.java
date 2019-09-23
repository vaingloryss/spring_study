import com.vainglory.bean.User;
import com.vainglory.dao.IUserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestFactoryBean {

    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryBean.xml");
        SqlSessionFactory sqlSessionFactory = applicationContext.getBean("sqlSessionFactory", SqlSessionFactory.class);
        if (sqlSessionFactory!=null){
            SqlSession sqlSession = sqlSessionFactory.openSession();
            IUserDao userDao = sqlSession.getMapper(IUserDao.class);
            User user1 = userDao.findById(1);
            System.out.println(user1.toString());
        }else {
            System.out.println("sqlSessionFactory id null");
        }

    }
}
