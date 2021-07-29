import com.test_spring.pojo.People;
import com.test_spring.pojo.People_Anno;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAW {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People_Anno anno_people = context.getBean("anno_people", People_Anno.class);
        System.out.println(anno_people.getName());
        System.out.println(anno_people.getCat().getName());
        anno_people.getCat().shout();
        anno_people.getDog().shout();


    }
}

