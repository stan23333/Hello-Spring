import com.test_spring_mybatis.mapper.UserMapper;
import com.test_spring_mybatis.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MyTest {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");


        UserMapper userMapper = context.getBean("userMapper02", UserMapper.class);
        for (User user : userMapper.seletAllUser()) {
            System.out.println(user);
        }

    }
}
