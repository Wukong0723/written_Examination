package Others.Strategy;

public class Add implements Operator {
    @Override
    public int operate(int a, int b) {
        return a+b;
    }
}
