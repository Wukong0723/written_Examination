package Others.ProxyTest;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

public class WorkInvocationHandlerTest {

    @Test
    public void invoke() {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Leader.class);
        enhancer.setCallback(new LeaderMethodInterceptor());
        Leader proxy = (Leader) enhancer.create();
        proxy.meeting();
        proxy.evaluate("Joy");
        proxy.evaluate("james");

    }
}