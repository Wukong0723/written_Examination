package Companies.ShangHaiShaShaSha.Xuanze;

public abstract class Car {
    protected BrakeBehavior wheel;
    public void brake(){
        wheel.stop();
    }
}
