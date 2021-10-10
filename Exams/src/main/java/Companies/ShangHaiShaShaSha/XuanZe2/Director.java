package Companies.ShangHaiShaShaSha.XuanZe2;

public class Director {
    private Builder builder;
    public Director(Builder builder){this.builder = builder;}
    public void construct(){
        Product product= builder.getResult();

    }

}
