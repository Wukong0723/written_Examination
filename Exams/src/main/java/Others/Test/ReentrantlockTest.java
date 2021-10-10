package Others.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantlockTest {
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
       Thread thread1 =  new Thread(new ThreadDemo(lock1,lock2));
       Thread thread2 =  new Thread(new ThreadDemo(lock2,lock1));
        thread1.start();
        thread2.start();
        thread1.interrupt();
    }

    static class ThreadDemo implements Runnable{
        Lock firstLock;
        Lock secondLock;
        public ThreadDemo(Lock firstLock,Lock secondLock){
            this.firstLock = firstLock;
            this.secondLock = secondLock;
        }
        @Override
        public void run() {
            try{
                firstLock.lockInterruptibly();
                TimeUnit.MILLISECONDS.sleep(50);
                secondLock.lockInterruptibly();
            }catch (InterruptedException e ){
                e.printStackTrace();
            }finally {
                firstLock.unlock();
                secondLock.unlock();
                System.out.println(Thread.currentThread().getName()+"正常获取资源");
            }
        }
    }

}
