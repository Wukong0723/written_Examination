package Companies.ShangHaiShaShaSha.XuanZe2;

public class ConcreteBuilder1 implements Builder {

    private  Product product;
    public ConcreteBuilder1(){product = new Product();}
    @Override
    public void buildPartA() {
       product.setPartA("Component A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("Component B");
    }
    @Override
    public Product getResult(){return product;}
}
