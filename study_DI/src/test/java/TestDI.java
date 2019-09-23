import com.vainglory.bean.TextEditor;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
    private static ApplicationContext applicationContext;

    @BeforeClass
    public static void testInit(){
        applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    }

    /**
     * 依赖注入
     */
    @Test
    public void test01(){
        //构造器依赖注入
        /*TextEditor  editor1 = (TextEditor) applicationContext.getBean("editor1");
        editor1.spellCheck();*/

        //setter依赖注入
        /*TextEditor  editor2 = (TextEditor) applicationContext.getBean("editor2");
        editor2.spellCheck();*/

        //p命名空间
        TextEditor  editor3 = (TextEditor) applicationContext.getBean("editor3");
        editor3.spellCheck();

    }
}
