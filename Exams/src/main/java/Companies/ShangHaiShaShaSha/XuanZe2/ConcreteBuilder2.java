package Companies.ShangHaiShaShaSha.XuanZe2;

public class ConcreteBuilder2 implements Builder {

    private  Product product;
    public ConcreteBuilder2(){product = new Product();}
    @Override
    public void buildPartA() {
        System.out.println("Component A2");
    }

    @Override
    public void buildPartB() {
        System.out.println("Component B2");
    }
    @Override
    public Product getResult(){return product;}
}
