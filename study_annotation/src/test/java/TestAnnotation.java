import com.vainglory.BeanConfig;
import com.vainglory.domain.Student;
import com.vainglory.domain.TextEditor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    //@Required
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student1 = (Student) applicationContext.getBean("student1");
        System.out.println(student1.toString());
    }

    //@Autowired
    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor textEditor1 = applicationContext.getBean("textEditor1", TextEditor.class);
        textEditor1.spellCheck();
    }

    //@Autowired
    @Test
    public void test03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student2 = (Student) applicationContext.getBean("student2");
        System.out.println(student2.toString());
    }

    //@Autowired
    //@Qualifier("textEditor1")
    @Test
    public void test04(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor textEditor1 = applicationContext.getBean("textEditor1", TextEditor.class);
        System.out.print("textEditor1:");
        textEditor1.spellCheck();


        /*TextEditor textEditor2 = applicationContext.getBean("textEditor2", TextEditor.class);
        System.out.print("textEditor2:");*/
        //@Qualifier("textEditor1")
        //此时，只有textEditor1被注入了SpellChecker，所以该句会出现异常，因为spellChecker属性为空。
        //textEditor2.spellCheck();
    }

    //测试Java配置
    @Test
    public void test05(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Student student3 = (Student) applicationContext.getBean("student3");
        //Student student4 = applicationContext.getBean("student3",Student.class);
        System.out.println(student3.toString());

    }
}
