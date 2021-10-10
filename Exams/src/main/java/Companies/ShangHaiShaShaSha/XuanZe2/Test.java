package Companies.ShangHaiShaShaSha.XuanZe2;

public class Test {
    public static void main(String[] args) {
        Director director1 = new Director(new ConcreteBuilder1());
        director1.construct();
    }
}
