package Others.Test;

import java.util.Scanner;

public class ThreadInterrupt extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("开始运行");
            sleep(10000);
            System.out.println("结束运行");

        }catch (InterruptedException e){
            System.out.println("打断");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreadInterrupt thread = new ThreadInterrupt();
        thread.start();
        if(sc.nextInt() == 1){
            thread.interrupt();
        }
        System.out.println("main 结束");
        try {
            thread.join();
        }catch (Exception e ){

        }


    }
}
