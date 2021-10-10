package Others.Strategy;

public class Dec implements Operator {
    @Override
    public int operate(int a, int b) {
        return a-b;
    }

    public static void main(String[] args) {
        Operator operator = new Dec();
        System.out.println(operator.operate(2,1));
        operator = new Add();
        System.out.println(operator.operate(2,1));
    }
}
