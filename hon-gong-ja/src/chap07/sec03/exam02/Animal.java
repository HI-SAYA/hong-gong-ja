package chap07.sec03.exam02;

public abstract class Animal {
    public String kind;

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();
    // 추상 메소드. 실행 내용인 {}가 없는 메소드
}
