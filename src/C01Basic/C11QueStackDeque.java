package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {
////        Queue 인터페이스를 LinkedList가 구현한 방식을 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////        myQue에 데이터를 삭제하면서, 가장 앞의 데이터를 반환
//        System.out.println(myQue.poll()); // 10
//        System.out.println(myQue); // [20, 30]
////        myQue에 데이터를 삭제하지는 않고, 가장 앞의 데이터를 반환
//        System.out.println(myQue.peek()); // 20
//        System.out.println(myQue); // [20, 30]
//
////        LinkedList와 ArrayLsit 성능비교
////        중간위치에 데이터 add테스트
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long strartTime = System.currentTimeMillis();
//        for(int i =0;i<100000;i++) {
//            list1.add(0, 10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedList 삽입속도 : " + (endTime-strartTime));
//
//        ArrayList<Integer>list2 = new ArrayList<>();
//        long strartTime2 = System.currentTimeMillis();
//        for(int i =0;i<100000;i++) {
//            list2.add(0, 10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList 삽입속도 : " + (endTime2-strartTime2));
//
////        조회속도 비교
////        linkedList 조회속도
//        long strartTime3 = System.currentTimeMillis();
//        for(int i=0;i<100000;i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("linkedList 조회속도 : " + (endTime3-strartTime3));
//
////        ArrayList 조회속도
//        long strartTime4 = System.currentTimeMillis();
//        for(int i=0;i<100000;i++){
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("ArrayList 조회속도 : " + (endTime4-strartTime4));


        Queue<String> myQue = new LinkedList<>();
        myQue.add("문서1");
        myQue.add("문서2");
        myQue.add("문서3");
        while(!myQue.isEmpty()){
            System.out.println(myQue.poll());
        }

//        길이제한큐 : ArrayBlockingQueue
        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        blockingQueue.add("문서4");

//        큐에 여유공간이 있을때만 add
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");
//        System.out.println(blockingQueue);

//        우선순위큐 : 데이터를 꺼낼때 정렬된 데이터 poll
//        전체정렬이 아닌, poll할때마다 최소값을 보장
        Queue<Integer>pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(50);
        System.out.println(pq); // [10,30,20,40,50] 정렬x
        System.out.println(pq.poll());  // 10
        System.out.println(pq.poll());  // 20
        System.out.println(pq.poll());  // 30 오름차순 정렬하면서 데이터 poll

//        문제) 최소힙 - 백준

//        최대힙인경우
        Queue<Integer>maxPq = new PriorityQueue<>(Comparator.reverseOrder());
        maxPq.add(30);
        maxPq.add(20);
        maxPq.add(10);
        System.out.println(maxPq.poll());





    }
}
