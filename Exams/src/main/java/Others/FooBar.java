package Others;


import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class FooBar {
    final Object obj = new Object();
    private int n;
    volatile boolean flag = true;
    ThreadLocal<String> cnt = new ThreadLocal<>();

    public FooBar(int n) {
        this.n = n;
    }

     void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printFoo.run() outputs "foo". Do not change or remove this line.

                while (!flag){

                }
                printFoo.run();
                flag = false;

        }
    }

     private void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printBar.run() outputs "bar". Do not change or remove this line.
                while (flag) {
                }
                printBar.run();
                flag = true;


        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(8,
                256,60L, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(200));
//        new Thread(()->{
//            System.out.println("123");
//        }).start();

        FooBar fooBar = new FooBar(3);


        Thread thread1 = new Thread(() -> {
            try {
                fooBar.foo(() -> {
                    System.out.println("Foo");
                });
            }catch (InterruptedException e){

            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                fooBar.bar(() -> {
                    System.out.println("Bar");
                });
            }catch (Exception e){

            }
        });
        thread1.start();
        thread1.interrupt();

        try {
            thread1.join();
        }catch (Exception e){

        }


    }
}