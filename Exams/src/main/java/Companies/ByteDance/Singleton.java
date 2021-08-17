package Companies.ByteDance;

import java.security.Signature;

public class Singleton {

    //1,普通型，构造函数和单例private，不让调用构造函数
    //缺点，不能多线程，没锁
//    private static Singleton instance = new Singleton();
//    private Singleton(){}
//
//    public Singleton getInstance(){
//        return instance;
//    }
//    public void show(){
//        System.out.println("sb");
//    }


    //2，懒汉式，不勤奋，用到了再实例化，加锁
    //缺点：慢
//    private static Singleton instance;
//    private Singleton(){}
//
//    public static synchronized Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //饿汉式，天生线程安全，因为只有这一个对象
//    private static Singleton instance = new Singleton();
//    private Singleton(){ }
//
//    public static Singleton getInstance(){
//        return  instance;
//    }

    //双重检验锁
    private volatile static Singleton instance;
    private Singleton(){}

    public  static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }

            }
        }
        return instance;
    }




}
