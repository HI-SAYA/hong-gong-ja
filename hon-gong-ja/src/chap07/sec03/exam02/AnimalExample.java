package chap07.sec03.exam02;

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();        // 1. 변수로 호출
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        System.out.println("----------");

        Animal animal = null;   // 2. Animal 변수로 타입 변환해서 sound() 메소드 호출
        animal = new Dog();     // 자식은 부모 타입으로 자동 타입 변환이 될 수 있고, 메소드가 재정의되어 있을 경우
        animal.sound();         // 재정의된 자식 메소드가 호출되는 다형성의 특징이 적용
        animal = new Cat();
        animal.sound();
        System.out.println("----------");

        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound( Animal animal ) {
        // animalSound에 new Dog(), new Cat()에 객체가 들어갔기 때문에 멍멍 야옹으로 반환된다. = 메소드의 재정의
        animal.sound();
        // 부모 타입의 매개 변수에 자식 객체를 대입해서 메소드의 다형성을 적용했다. 이것은 2번과 같은 원리로 자식 객체가
        // 부모 타입으로 자동 타입 변환되어 재정의된 sound() 메소드가 호출된다.
    }
}
