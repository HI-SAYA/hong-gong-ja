package chap07.sec02.exam05;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

//        parent.field2 = "data2";
//        parent.method3();
// 자식 클래스가 부모 클래스로 자동 타입 변환을 했기 때문에 자식 클래스의 필드와 메소드를 사용할 수 없다.

        Child child = (Child) parent;   // 강제 타입 변환 부모로 타입 변환한 Child를 다시 자식으로 강제 타입변환 한다.
        child.field2 = "data2"; // 자식의 필드와 메소드를 사용할 수 있다.
        child.method3();
        child.field1 = "data3";
        child.method2();    // 부모의 필드와 메소드도 사용할 수 있다.
    }
}
