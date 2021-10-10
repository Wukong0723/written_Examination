package Others.MultyThread;

public class Synchronized {
   private static Object clock = new Object();

    static class ThreadA implements Runnable{
        @Override
        public void run() {
            synchronized (clock){
                for(int i =0;i<10;i++){
                    try{
                        clock.notify();
                        System.out.println(i+"+A");
                        clock.wait();

                    }catch (Exception e){

                    }
                }
            }
        }
    }
    static class ThreadB extends Thread{
        @Override
        public void run() {
            synchronized (clock){
                for(int i =0;i<10;i++){
                    try{
                        clock.notify();
                        System.out.println(i+"+B");
                        clock.wait();
                    }catch (Exception e){

                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new ThreadA()).start();
         new ThreadB().start();

    }

}
