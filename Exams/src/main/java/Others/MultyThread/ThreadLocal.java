package Others.MultyThread;

import java.util.*;

public class ThreadLocal {
    static class ThreadA implements Runnable {
        private java.lang.ThreadLocal<String> threadLocal;

        public ThreadA(java.lang.ThreadLocal<String> threadLocal) {
            this.threadLocal = threadLocal;
        }

        @Override
        public void run() {
            threadLocal.set("A");
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            System.out.println("A线程"+"+"+threadLocal.get());
        }
    }
    static class ThreadB implements Runnable {
        private java.lang.ThreadLocal<String> threadLocal;

        public ThreadB(java.lang.ThreadLocal<String> threadLocal) {
            this.threadLocal = threadLocal;
        }

        @Override
        public void run() {
            threadLocal.set("B");
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            System.out.println("B线程"+"+"+threadLocal.get());
        }
    }

    public static void main(String[] args) {
        new Thread(new ThreadA(new java.lang.ThreadLocal<>())).start();
        new Thread(new ThreadB(new java.lang.ThreadLocal<>())).start();
    }
}
