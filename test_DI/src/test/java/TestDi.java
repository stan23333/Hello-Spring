import com.test_Spring.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student01 = context.getBean("student", Student.class);
        System.out.println(student01);
        System.out.println("++++++++++++++++++++++++++++");
        Student student02 = context.getBean("student_me", Student.class);
        System.out.println(student02);
        System.out.println("++++++++++++++++++++++++++++");
        Student student03 = context.getBean("student_p", Student.class);
        System.out.println(student03);
        Student student04 = context.getBean("student_c", Student.class);
        System.out.println(student04);
    }
}
