package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {

//        map은 index요소가 없으므로, 순서가 무의미
//        key값은 중복되지 않고, 만약에 동일한 key값으로 다른 value를 넣으면 덮어쓰기함
//        Map<String, String> sports = new HashMap<>();
//        sports.put("basketball", "농구");
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("baseball", "공놀이");
//        System.out.println(sports);
//
////        map은 key를 통해 value를 get
////        map에서 key값을 통한 복잡도는 0(1)
//        System.out.println(sports.get("baseball"));
//
////        map의 전체 데이터 조회
////        keySet() : map의 key목록을 리턴하는 매서드
////        values() : map의 value목록을 리턴하는 매서드
//        for(String key : sports.keySet()){
//            System.out.println("sports의 key값은 : " + key);
//            System.out.println("sports의 vlaue값은 : " + sports.get(key));
//        }
//
////        remove : 키를 통해 삭제
//        sports.remove("baseball");
//        System.out.println(sports);
//
////        putIfAbsent : key값이 없는 경우에만 put
//        sports.putIfAbsent("soccer", "운동");
//        sports.putIfAbsent("baseball", "야구");
//        System.out.println(sports);
//
////        getOrDefault : key가 없으면 default값으로 return
//        System.out.println(sports.get("pingpong")); // null
//        System.out.println(sports.getOrDefault("pingpong", "그런키없음")); // 그런키없음
//        System.out.println(sports.getOrDefault("baseball", "그런키없음")); // 야구
//
////        containsKey : 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("baseball")); // true
//        System.out.println(sports.containsKey("pingpong")); // false


//        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
////        농구 : 2, 축구 : 2, 야구 : 1
//
//        Map<String, Integer> sports = new HashMap<>();
//
//        for(int i = 0;i<arr.length;i++){
//            if(!sports.containsKey(arr[i])){
//                sports.put(arr[i],1);
//            }else{
//                sports.put(arr[i],sports.get(arr[i])+1);
//            }
//        }
////        향상for문
//        for(String a : arr){
//            if(sports.containsKey(a)){
//                sports.put(a,sports.get(a)+1);
//            }else{
//                sports.put(a,1);
//            }
//        }

////        향상for문 + getOrDefault
//        for(String a : arr){
//            sports.put(a,sports.getOrDefault(a,0)+1);
//        }
//        System.out.println(sports);

//        문제) 완주하지 못한 선수 - 프로그래머스
//        문제) 의상 - 프로그래머스

//        LinkedHashMap : 데이터 삽입순서를 보장(유지)
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello1",1);
//        linkedMap.put("hello2",2);
//        linkedMap.put("hello3",3);
//        linkedMap.put("hello4",4);
//        linkedMap.put("hello5",5);
//        for(String l : linkedMap.keySet()){
//            System.out.println("KEY값은 " + l);
//        }

//        TreeMap : key를 통해 데이터를 정렬
//        Map<String, Integer> TreeMap = new TreeMap<>();
//        TreeMap.put("hello1",1);
//        TreeMap.put("hello2",2);
//        TreeMap.put("hello3",3);
//        TreeMap.put("hello4",4);
//        TreeMap.put("hello5",5);
//        for(String l : TreeMap.keySet()){
//            System.out.println("KEY값은 " + l);
//        }
//
////        Hash맵을 사용해서 key값으로 정렬
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("hello1",1);
//        myMap.put("hello2",2);
//        myMap.put("hello3",3);
//        myMap.put("hello4",4);
//        myMap.put("hello5",5);
//        List<String> myList = new ArrayList<>();
//        for(String a : myMap.keySet()){
//            myList.add(a);
//        }
//        myList.sort(Comparator.naturalOrder());
//        for(String l : myMap.keySet()){
//            System.out.println("KEY값은 " + l);
//            System.out.println("VALUE값은 " + myMap.get(l));
//        }
//        myList.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return myMap.get(o2) - myMap.get(o1);
//            }
//        });
//        System.out.println(myList);

////        hashmap출력방법 2가지 : 1. 강화된 for문     2. iterator
//        Map<String,String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//
//        for(String a : myMap.keySet()){
//            System.out.println(a);
//        }
//        Iterator<String> myIters = myMap.keySet().iterator();
////        next매서드는 데이터를 하나씩 소모시키면서 값을 반환
//        System.out.println(myIters.next());
////        hasNext는 iterator안에 그 다음값이 있는지 없는지 boolean return
//
//        while(myIters.hasNext()){
//            System.out.println(myIters.next());
//        }





    }
}
