package C02ClassBasic;

public class C0202Class {
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(10, 20));

//        A부서의 매출
//        20원의 매출
//        MyCalculator.sumAcc(20);
//        System.out.println(MyCalculator.total);
////        30원의 매출
//        MyCalculator.sumAcc(30);
//        System.out.println(MyCalculator.total);
////        40원의 매출
//        MyCalculator.sumAcc(40);
//        System.out.println(MyCalculator.total);
//
////        B부서의 매출
////        10원 매출
//        MyCalculator.total = 0;
//        MyCalculator.sumAcc(10);
//        System.out.println(MyCalculator.total);
////        20원 매출
//        MyCalculator.sumAcc(20);
//        System.out.println(MyCalculator.total);

//        객체를 사용한 회계프로그램 : 객체 고유의 메모리 공간 할당
        MyCalculatorInstnace m1 = new MyCalculatorInstnace();
        m1.sumAcc(10);
        m1.sumAcc(20);
        System.out.println(m1.total);
        MyCalculatorInstnace m2 = new MyCalculatorInstnace();
        MyCalculatorInstnace.total_count += 1;
        m2.sumAcc(30);
        m2.sumAcc(40);
        System.out.println(m2.total);

//        이름세팅, eating()메서드 호출 (C0203Person에서)
        C0202Person p1 = new C0202Person();
        p1.setName("hongildong");
        p1.setAge(29);
        p1.setEmail("hong@naver.com");

        p1.eating();
        System.out.println(p1.whoIs());

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getEmail());




    }

}



class MyCalculator{
    static int total = 0;

    static int sum(int a, int b){
        return a+b;
    }
    static void sumAcc(int a){
        total += a;
    }
}

class MyCalculatorInstnace{

    static int total_count  = 0;
    int total = 0;
    void sumAcc(int a){
//        this는 객체 그 자신을 의미
//        예를들어 m1객체일 경우 m1.total, m2 객체일경우 m2.total
//        일반적으로, 매개변수와 객체변수를 구분짓기 위해 사용해야함. (생략가능 - 매개변수와 이름이 같지 않을경우)
        total += a;
    }
}