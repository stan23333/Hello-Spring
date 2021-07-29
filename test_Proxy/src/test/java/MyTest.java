import com.test_spring.dynamic.service.UserService;
import com.test_spring.dynamic.service.impl.UserServiceImpl;
import com.test_spring.dynamic.utils.ProxyInvocationHandler;
import com.test_spring.statis.proxy.UserServiceProxy;

public class MyTest {
    public static void main(String[] args) {
/*
        //静态代理
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.delete();
  */

        //静态代理
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //使用动态代理生成类，生成代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要代理的真实角色
        pih.setTarget(userService);
        //生成代理角色，强转为代理的接口
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
