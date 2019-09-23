import com.vainglory.bean.TextEditor;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWried {
    private static ApplicationContext applicationContext;

    @BeforeClass
    public static void testInit(){
        applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void test01(){
        TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor3");
        textEditor.spellCheck();
    }
}
