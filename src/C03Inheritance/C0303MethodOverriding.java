package C03Inheritance;

public class C0303MethodOverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        d1.sound2();

//        상속관계자일때 부모클래스의 타입을 자식클래스객체의 탑입으로 지정가능
//        animal 클래스에 정의된 매서드만 사용가능하도록 타입의 제약발생
        Animal d2 = new Dog();
        d2.sound();
//        d2.sound() 사용불가
    }
}

class Animal{
    void sound(){
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("멍멍");
    }
    void sound2(){
        System.out.println("멍멍멍");
    }
}

class Cat extends Animal{

}
