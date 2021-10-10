package Others.ClassLoaderTest;
import java.util.concurrent.TimeUnit;

public class TestClassLoading{
    public static class A{
        static {
            System.out.println("class A init");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new B();
        }

        public static void test() {
            System.out.println("aaa");
        }
    }

    public static class B{
        static {
            System.out.println("class B init");
            new A();
        }

        public static void test() {
            System.out.println("bbb");
        }
    }
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Others.ClassLoaderTest.TestClassLoading.A");
        Class.forName("Others.ClassLoaderTest.TestClassLoading.B");
        Thread thread1 = new Thread(() -> A.test(),"thread-1");
        Thread thread2 = new Thread(() -> B.test(),"thread-2");
        thread1.start();
        thread2.start();

//        thread1.interrupt();

    }
}

//F:\Projects\written_Examination\Exams\src\main\java\Others\ClassLoaderTest\TestClassLoading.java