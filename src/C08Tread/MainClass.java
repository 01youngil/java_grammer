package C08Tread;

public class MainClass {
    public static void main(String[] args) {
////        스레드생성방법2가지
////        방법1. 스레드 클래스 상속방식
//        Thread t1 = new MyClass1();
////        Thread클래스 안에 start메서드가 내장도디어 있으므로, 해당 메서드로 스레드 생성
////        start메서드는 내부적으로 run메서드를 호출
//
////        방법2. Runnable을 구현한 객체를 Thread클래스 생성자에 주입하는 방식
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("스레드 실행(runnable객체 구현)");
//            }
//        });
//
//        Thread t3 = new Thread(()-> System.out.println("스레드 실행(Runnable 람다 구현)"));
//        t1.start();
//        t2.start();
//        t3.start(); // 순서 x

////        멀티스레드 동시성 이슈 테스트
////        1.단일스레드 테스트
//        for(int i=0;i<1000;i++){
//            Library.borrow();
//        }
//        System.out.println(Library.bookCount);

//        2.멀티스레드 테스트
        for(int i=0;i<1000;i++){
            Thread t1 = new Thread(()->Library.borrow());
//            스레드 생성 후 borrow 실행은 for문에서 이를 기다리지 않고, 그다음 스레드 생성 및 실행으로 이어짐.
//            여러 스레드가 동시에 실행되므로, 대략적으로 300ms 안에 모든 요청이 처리됨.
            t1.start();
//            join()메서드를 통해 다른 스레드의 완료전까지 새로운 스레드가 생성 안되도록 설정.
            try {
                t1.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Library.bookCount);

    }
}
