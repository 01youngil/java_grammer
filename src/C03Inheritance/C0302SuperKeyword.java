package C03Inheritance;


//부모클래스(SuperParents)에 변수 a선언 10할당
//부모클래스에 객체매서드 display선언하고 부모클래스입니다. 출력
//자식클래스에서 상속받고 부모클래스의 변수a출력, 부모클래스의 display호출
public class C0302SuperKeyword extends SuperParents{

    C0302SuperKeyword(){
//        super() : 부모클래스의 생성자를 의미
        super(10);
        a = 20;
    }

    public static void main(String[] args) {

        C0302SuperKeyword c1 = new C0302SuperKeyword();

//        c1.display();
//        System.out.println(c1.a);
        c1.display2();
    }

    void display2(){
        System.out.println(a);
        System.out.println(super.a);
    }
}

class SuperParents{
    int a;

    SuperParents(int a){
        this.a = a;
    }
    SuperParents(){

    }
    void display(){
        System.out.println("부모클래스입니다.");
        System.out.println(this.a);
    }
}
