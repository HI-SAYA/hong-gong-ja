package chap07.sec03.exam01;

public abstract class Phone {
    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turn0n() {
        System.out.println("폰 전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
