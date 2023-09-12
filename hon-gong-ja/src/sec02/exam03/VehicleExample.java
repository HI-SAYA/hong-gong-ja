package sec02.exam03;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare(); <- (x) Vehicle 인터페이스에는 checkFare() 메소드가 없기 때문에 불가능.

        Bus bus = (Bus) vehicle; //  <- 강제 타입 변환, 다운캐스팅?

        bus.run();
        bus.checkFare();
    }
}
