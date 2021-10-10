package Others.ProxyTest;

import java.util.Random;

public class Leader implements IWork {
    @Override
    public void meeting() {
        System.out.println("组织会议");
    }

    @Override
    public int evaluate(String name) {
        int score = new Random(System.currentTimeMillis()).nextInt(20) + 80;
        System.out.println("多少分"+" "+name+" "+score);

        return score;
    }
}
