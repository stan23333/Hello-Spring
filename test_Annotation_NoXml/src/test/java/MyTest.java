import com.test_spring.contextconfig.BeansConfig;
import com.test_spring.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        user.getCat().shout();
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        user.getDog().shout();
    }
}
