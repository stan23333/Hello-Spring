import com.spring_study.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
    public static void main(String[] args) {
        //获取Spring上下文对象


        //拿到Spring容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("hello01");
        System.out.println(hello.getStr());

    }
}
