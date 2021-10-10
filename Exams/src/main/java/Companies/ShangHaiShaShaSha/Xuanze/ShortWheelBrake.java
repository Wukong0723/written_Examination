package Companies.ShangHaiShaShaSha.Xuanze;

public class ShortWheelBrake implements BrakeBehavior{
    @Override
    public void stop() {
        System.out.println("Short");
    }
}
