package C01Basic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C10Set {
    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        mySet.add("h");
        mySet.add("h");
        mySet.add("e");
        mySet.add("l");
        mySet.add("l");
        mySet.add("o");
        System.out.println(mySet);
//        순서보장x, 중복제거
//        출력시 index로 접근 불가
        for(String a : mySet){
            System.out.println(a);
        }

//        문제) 폰켓몬 : 프로그래머스

//        LinkedHashSet
//        Set<Integer> linkedSet = new LinkedHashSet<>();
//        linkedSet.add(1);
//        linkedSet.add(1);
//        linkedSet.add(0);
//        linkedSet.add(3);
//        linkedSet.add(1);
//        System.out.println(linkedSet); // [1, 0, 3]
//
////        TreeSet : 중복제거, 정렬(복잡도 ↑)
//        Set<Integer> treeSet = new TreeSet<>();
//        treeSet.add(1);
//        treeSet.add(1);
//        treeSet.add(0);
//        treeSet.add(3);
//        treeSet.add(1);
//        System.out.println(treeSet); // [0, 1, 3]

//        집합관련함수 : 교집합(retainAll), 합집합(addAll), 차집합(removeAll)
        Set<String> set1 = new HashSet<>();
        set1.add("java");
        set1.add("python");
        set1.add("javascript");
        Set<String> set2 = new HashSet<>();
        set2.add("java");
        set2.add("html");
        set2.add("css");

//        set1.retainAll(set2); // 교집합
//        set1.addAll(set2); // 합집합
        set1.removeAll(set2); // 차집합
        System.out.println(set1);


    }
}
