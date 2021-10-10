package Others.Pinduoduo;

public class Singleton {
    static private volatile Singleton instance;
     private Singleton(){}

    public static Singleton getInstance() {
        if(instance ==null){
            synchronized(Singleton.class){
                if(instance ==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
