package $_proxy.DynamicProxy;

// 委托类
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String userName) {
        System.out.println(userName + " hello");
        return userName + " hello";
    }

    @Override
    public String sayByeBye(String userName) {
        System.out.println(userName + " ByeBye");
        return userName + " ByeBye";
    }
}
