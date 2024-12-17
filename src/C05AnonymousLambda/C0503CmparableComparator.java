package C05AnonymousLambda;

import java.util.*;

public class C0503CmparableComparator {
    public static void main(String[] args) {
////        자바에서는 비교를 위한 인터페이스 대표적으로 2개를 제공
////        Comparable 인터페이스는 compareTo 메서드 선언.
////        Comparator 인터페이스는 compare메서드 선언.
//
////        String 클래스 안에 compareTo 메서드 내장
////        String 클래스외에 java의 많은 클래스에서 compareTo를 구현(Comparable 인터페이스 구현)
//        String a = "hello";
//        String b = "world";
////        두 문자열의 각 자리를 순차적으로 비교. 비교결과는 유니코드값의 차이를 반환
//        System.out.println( a.compareTo(b));
//
//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javascript");
//
//        Collections.sort(myList);
//        myList.sort(Comparator.naturalOrder());

//        List<Student> myList = new ArrayList<>();
//        myList.add(new Student("kim", 24));
//        myList.add(new Student("lee", 21));
//        myList.add(new Student("park", 35));
//        myList.add(new Student("choi", 15));
//        myList.add(new Student("kim", 30));

//        방법1. Student객체에서 Comparable을 구현한 방식.
//        myList 요소인 Student 객체 안에 comparable 인터페이스를 구현한 comparTo메서드가 있어야함.
//        Collections.sort(myList);
//        System.out.println(myList);

//        방법2. Comparator를 구현한 익명객체를 sort에 매개변수로 주입
//        myList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                return o1.getAge() - o2.getAge(); // 나이를 기준으로 오름차순정렬
////                return o2.getAge() - o1.getAge(); // 나이를 기준으로 내림차순정렬
//                return o1.getName().compareTo(o2.getName()); // 이름를 기준으로 오름차순정렬
//            }
//        });

////        Coparator를 람다함수 활용하여 myList 정렬 : 이름을 기준으로 내림차순
//        myList.sort((a,b) -> {
//            if(a.getName().compareTo(b.getName())==0){
//                return a.getAge() - b.getAge();
//            }else{
//                return b.getName().compareTo(a.getName());
//            }
//        });
//
//        System.out.println(myList);

//        String[] stArr = {"hello", "java", "C++", "world2"};
//        Arrays.sort(stArr); // 내림차순
//        Arrays.sort(stArr,Comparator.reverseOrder()); // 오름차순
//        System.out.println(Arrays.toString(stArr));

//        글자길이를 기준으로 내림차순 정렬해라.
//        Arrays.sort(stArr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        });
//        System.out.println(Arrays.toString(stArr));
//
//        Queue<String> pq = new PriorityQueue<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        });
//
//        for(String a : stArr){
//            pq.add(a);
//        }
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }
//
////        문제) 절대값 힙 - 백준
////        절대값함수 : Math.abs(수);
//        int a = -1;
//        System.out.println(Math.abs(a));

//        [4,5], [1,2], [5,0], [3,1]
        List<int[]> myList = new ArrayList<>();
        myList.add(new int[]{4,5});
        myList.add(new int[]{1,2});
        myList.add(new int[]{5,0});
        myList.add(new int[]{3,1});
//        정렬조건 : 리스트안의 배열에 index 1번째 값을 기준으로 오름차순
        myList.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for(int[] m : myList){
            System.out.println(Arrays.toString(m));
        }



    }
}

//class Student implements Comparable<Student>{
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

////    정렬은 결국 2개의 값을 비교하는 것이므로, A와 B 대상 2개만 있으면 충분.
////    두 수(또는 문자) 비교의 경우 음수, 0, 양수 세 값 중에 하나만 return되고, 이를 통해 정렬이 이루어짐.
////    기준이 되는 A(this)가 앞에 있을땐 오름차순, 뒤에 있으면 내림차순으로 내부적으로 정렬로직이 동작
//    @Override
//    public int compareTo(Student o) {
////        문자 내림차순
//        return o.getName().compareTo(this.getName());
////        문자 오름차순
////        return this.getName().compareTo(o.getName());
////        숫자 내림차순
////        return o.getAge() - this.getAge();
////        숫자 오름차순
////        return this.getAge() - o.getAge();
//
//    }

//    객체 호출시에 자동으로 메모리주소가 아닌 내용이 출력되게 하려면 toString메서드를 구현
//    java의 모든 클래스는 조상클래스인 Object클래스를 상속하고 있고, 아래의 override는 Object클래스의 toString메서드를 구현한것
    @Override
    public String toString(){
        return "이름은 " + this.name + " 나이는 " + this.age;
    }


}
