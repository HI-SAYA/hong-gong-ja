package chap07.sec03.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        // Phone phone = new Phone();
        // Phone은 추상클래스로 new 연산자로 객체 생성을 할 수 없다.

        SmartPhone smartPhone = new SmartPhone("손흥민");

        smartPhone.turn0n();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
