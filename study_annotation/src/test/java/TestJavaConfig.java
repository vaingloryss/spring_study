import com.vainglory.config.BeanConfig;
import com.vainglory.domain.SpellChecker;
import com.vainglory.domain.Student;
import com.vainglory.domain.TextEditor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

//@Import(Student.class)


public class TestJavaConfig {

    //@Import注解直接将一个Bean导入spring容器,SpringBoot环境
    /*public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println(context.getBean(Student.class));
        context.close();
    }*/


    //测试Java配置
    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Student student3 = (Student) applicationContext.getBean("student3");
        //Student student4 = applicationContext.getBean("student3",Student.class);
        System.out.println(student3.toString());

    }

    //测试@Import注解,
    @Test
    public void test03(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        SpellChecker spellChecker = applicationContext.getBean("spellChecker", SpellChecker.class);
        spellChecker.checkSpelling();
    }
}
