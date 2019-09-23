import com.vainglory.bean.User;
import com.vainglory.bean.VipUser;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class TestBeans {

    /*加载bean的配置文件，获取bean*/
    private static ApplicationContext applicationContext;//推荐
    private static XmlBeanFactory xmlBeanFactory;//过时

    @BeforeClass
    public static void testInit(){
        xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        //applicationContext = new ClassPathXmlApplicationContext("beans.xml");//正确配置classpath环境变量

        //ApplicationContext的其他实现
        applicationContext = new FileSystemXmlApplicationContext("/src/main/resources/beans.xml");//完整路径

       /* XmlWebApplicationContext xmlWebApplicationContext = new XmlWebApplicationContext();
        xmlWebApplicationContext.setConfigLocations(new String[] {"/WEB-INF/ applicationContext.xml"});*/

    }

    /**
     * Bean的获取
     */
    @Test
    public void test01(){
        //xmlBeanFactory
        /*User user = (User) xmlBeanFactory.getBean("user");
        System.out.println(user.toString());*/

        //applicationContext
        User user1 = (User) applicationContext.getBean("user");
        System.out.println(user1.toString());
    }

    /**
     * Bean的作用域
     */
    @Test
    public void test02(){
        User user1 = (User) applicationContext.getBean("user");
        User user2 = (User) applicationContext.getBean("user");
        /*
        作用域：singleton 输出：user1:245475541 user2:245475541，初始化方法执行一次
        作用域：prototype 输出：user1:410495873 user2:811587677，初始化方法执行两次
         */
        System.out.println("user1:"+user1.hashCode());
        System.out.println("user2:"+user2.hashCode());
    }

    /**
     * bean的生命周期
     */
    @Test
    public void test03(){
        AbstractApplicationContext aac = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) aac.getBean("user");
        User user1 = aac.getBean("user", User.class);//重载方方法，不需要强转

        System.out.println(user.toString());
        //销毁bean
        aac.registerShutdownHook();
    }

    /**
     * Bean定义的继承
     */
    @Test
    public void test04(){
        VipUser vipuser = (VipUser) applicationContext.getBean("vipUser");
        System.out.println(vipuser.toString());
    }
}
