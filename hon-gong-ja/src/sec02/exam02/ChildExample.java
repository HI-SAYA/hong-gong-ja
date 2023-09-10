package sec02.exam02;

public class ChildExample{
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child; // 자동 타입 변환
        // 자식 타입을 부모 타입으로 변환 -> 다형성 구현을 위해
        // 필드의 타입을 부모 타입으로 선언하면 다양한 자식 객체들이 저장될 수 있기 때문에 필드 사용 결과가 달라질 수 있습니다.
        // 이것이 필드의 다형성
        parent.method1();
        parent.method2(); // 재정의된 메소드가 호출됨
       // parent.method3(); // 호출 불가능
    }
}
