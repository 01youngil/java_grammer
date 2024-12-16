package C03Inheritance;

import java.util.List;

//finalk 클래스는 상속불가
//public class C0305Others Extends FinalParents{
public class C0305Others {
    public static void main(String[] args) {
        AbstractDog d1 = new AbstractDog();
        d1.makeSound1();
        d1.makeSound2();

//        추상클래스와 인터페이스는 별도의 구현없이는 객체생성 불가
//        AbstractAnimal a1 = new AbstractAnimal();
//        List<Integer> list1 = new List<Integer>();  //Arraylist는 구현체가 있으므로 사용
    }

}
//abstract메서드가 하나라도 있으면 반드시 클래스에도 abstract 키워드가 붙어야됨
abstract class AbstractAnimal{
    void makeSound1(){
        System.out.println("동물소리를 냅니다.");
    }

    //    리턴타입과 매개변수만 있는 메서드 선언만 존재
    abstract void makeSound2();
}

class AbstractDog extends AbstractAnimal{

//    abstract 클래스를 상속받을때에는 overriding이 강제됨
    @Override
    void makeSound2() {

    }
}



final class FinalParents{

}