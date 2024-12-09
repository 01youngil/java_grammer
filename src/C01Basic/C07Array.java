package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C07Array {
    public static void main(String[] args) {


////        배열표현식1. 리터럴 방식
//        int[] intArr1 = {1,3,5,7,9};
//
////        배열표현식2. 배열 선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 3;
//        intArr2[2] = 5;
//        intArr2[3] = 7;
//        System.out.println(intArr2[4]); // 0
//
////        참조자료형의 배열은 기본적으로 null초기화
//        String[] stArr = new String[5];
//        stArr[0] = "hello1";
//        stArr[1] = "hello2";
//        stArr[2] = "hello3";
////        아래코드는 nullpointexception발생
//        for(int i=0;i<stArr.length;i++) {
//            if {
//                stArr[i].equals("hello")
//                System.out.println("hello가 있습니다.");
//            }
//        }
//
////        표현식3
//        int[] intArr = new int[]{1,3,5,7,9};
//        List<int[]> list1 = new ArrayList<>();
//        list1.add(new int[]{1,2,3,4,5});
//
////        표현식 4 : 불가 -> 배열의길이가 사전 지정되어야함
//        int[] inArr4 = new int[];

//        String[] stArr = new String[5];
//        for(int i=0; i<stArr.length;i++){
//            stArr[i] = "";
//        }
//        Arrays.fill(stArr,"hello world"); //모든 값을 "hello ...."로 채움
//        System.out.println(Arrays.toString(stArr));
//
////        85, 65, 90인 int 배열을 선언하고, 총합, 평균을 구하라.
//        int[] intArr = new int[]{85,65,90};
//        int sum = 0;
//        for(int i =0;i< intArr.length;i++){
//            sum += intArr[i];
//        }
//        System.out.println(sum);
//        double avg = sum/intArr.length;
//        System.out.println(avg);

//        배열의 최대값, 최소값
//        int[] arr2 = {10,20,30,12,8,17};
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i = 0;i<arr2.length;i++){
//            if(arr2[i]>max){
//                max = arr2[i];
//            }
//            if(arr2[i]<min){
//                min = arr2[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);

//        배열의 자리바꾸기
//        int[] arr = {20,10,30};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//        int[] arr2 = {10,20,30,40,50};
//        for(int i = 0;i<arr2.length-1;i++){
//            int a = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = a;
//        }
//        System.out.println(Arrays.toString(arr2));

//        배열 뒤집기 : 새로운 배열을 선언하여, arr을 뒤집은 배열 생성
//        int[] arr = {10,20,30,40,50};
//        int[] newArr = new int[arr.length];
//        for(int i =0;i<arr.length;i++){
//            newArr[arr.length-1-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));

//        배열의 정렬
//        int[] arr = {17,12,20,10,25};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        선택정렬 알고리즘 구현
//        int[] arr = {17,12,20,10,25};
//        int min = Integer.MAX_VALUE;
//        for(int j =0; j<arr.length;j++) {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] < min) {
//                    min = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = min;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));/////////////내코드

//        int[] arr = {17,12,20,10,25};
//        for(int i =0; i<arr.length-1;i++) {
//            int min = arr[i];
//            int minIndex = i;
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[j] < min) {
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        문자정렬
//        아스키코드(unicode)기준으로 정렬
//        String[] fruits = {"banana", "apple", "cherry"};
////        오름차순
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits)); // [apple, banana, cherry]
//
//        String[] fruits2 = {"apple", "applee", "applef", "b"};
//        System.out.println(Arrays.toString(fruits2)); // [apple, applee, applef, b]
////        내림차순
//        Arrays.sort(fruits, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(fruits)); // [cherry, banana, apple]
////        기본형타입은 Comparator로 처리 불가
//        int[] arr = {5,1,2,3,6};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 5, 6]
//        Arrays.sort(arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(arr)); // Error

//        문제) k번째수 - 프로그래머스






    }
}
