package Companies.ShangHaiShaShaSha.Xuanze;

public class Test {
    public static void main(String[] args) {
        BrakeBehavior brake = new ShortWheelBrake();
        ShortWheelCar car1 = new ShortWheelCar(brake);
        car1.brake();
    }
}
