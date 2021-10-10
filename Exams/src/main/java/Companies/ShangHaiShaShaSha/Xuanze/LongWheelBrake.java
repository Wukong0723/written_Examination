package Companies.ShangHaiShaShaSha.Xuanze;

public class LongWheelBrake implements BrakeBehavior{
    @Override
    public void stop() {
        System.out.println("long");
    }
}
