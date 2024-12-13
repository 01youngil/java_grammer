package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C0209RecurCombiPermu {
    public static void main(String[] args) {
//        숫자가 1,2,3,4가 있을때
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//
////        myList로 만들 수 있는 2개짜리 숫자조합을 이중리스트에 담아서 출력
////        1,2 1,3 1,4 2,3 2,4 3,4
//        List<List<Integer>> com = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for(int i = 0;i<myList.size();i++){
//            for(int j=i+1;j<myList.size();j++){
//                com.get(i).add(myList.get(i));
//                com.get(i).add(myList.get(j));


//                List<Integer> temp = new ArrayList<>();
//                temp.add(myList.get(i));
//                temp.add(myList.get(j));
//                com.add(temp);
//            }
//        }

//        for(int i=0;i<myList.size();i++){
//            temp.add(myList.get(i));
//            for(int j=i+1;j<myList.size();j++){
//                temp.add(myList.get(j));
//                com.add(new ArrayList<>(temp)); // 반복마다 temp에 새 주소부여
//                temp.remove(temp.size()-1);
//            }
//            temp.remove(temp.size()-1);
//        }
//        System.out.println(com);

//        재귀함수 호출을 이용한 조합리스트 만들기
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        myList.add(8);
        myList.add(13);
        myList.add(21);
        myList.add(34);
        List<List<Integer>>answer = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();

        combi(answer,temp,myList,6,0);
        System.out.println(answer);
//        answer = new ArrayList<>();
//        permu(answer,temp,myList,2,new boolean[myList.size()]);
//        System.out.println(answer);
        for( List<Integer> a : answer) {
            for(int i=0;i<a.size();i++) {
                if(i==a.size()-1) {
                    System.out.print(a.get(i));
                }else {
                    System.out.print(a.get(i) + " ");
                }
            }
            System.out.println();
        }

//        문제) N과M(15649) - 백준

//        문제)로또(6603) - 백준






    }

    public static void combi(List<List<Integer>>answer, List<Integer>temp,
                             List<Integer>myList, int count, int start){
        if(temp.size()==count) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<myList.size();i++){
                temp.add(myList.get(i));
                combi(answer,temp,myList,count,i+1);
                temp.remove(temp.size()-1);
        }
    }

    public static void permu(List<List<Integer>>answer, List<Integer>temp,
                             List<Integer>myList, int count, boolean[] visited){
        if(temp.size()==count) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<myList.size();i++){
            if(!visited[i]) {
                visited[i] = true;
                temp.add(myList.get(i));
                permu(answer, temp, myList, count, visited);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }




}
