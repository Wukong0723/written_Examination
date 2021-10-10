package Others.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WorkInvocationHandler implements InvocationHandler {
    private Object object;

    public WorkInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("object" + object.getClass().getSimpleName());
        System.out.println("proxy" + proxy.getClass().getSimpleName());
        if ("meeting".equals(method.getName())) {
            System.out.println("先准备材料");
            return method.invoke(object, args);
        } else if ("evaluate".equals(method.getName())) {
            if (args[0] instanceof String) {
                if ("james".equals(args[0])) {
                    System.out.println("James犯错");
                    return 70;
                }
            }
            return method.invoke(object, args);
        }
        return null;
    }
}
