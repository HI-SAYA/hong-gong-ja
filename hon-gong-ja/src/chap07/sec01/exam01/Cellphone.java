package chap07.sec01.exam01;

public class Cellphone {
    String model;
    String color;

    public Cellphone() {
    }

    public Cellphone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void powerOn() {
        System.out.println("전원을 켭니다. ");
    }
    void powerOff() {
        System.out.println("전원을 끕니다. ");
    }
    void bell() {
        System.out.println("벨이 울립니다.");
    }
    void sendVoice() {
        System.out.println("자기: " + message);
    }
    void receiveVoice() {
        System.out.println("상대방:" + message);
    }
    void hangUp() {
        System.out.println("전화를 끊습니다.");
    }

    String message = " ";
}
