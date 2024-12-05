package C01Basic;

import java.util.ArrayList;
import java.util.List;

public class C06String {
    public static void main(String[] args) {

//        참조자로형 : 기본자료형을 제외한 모든 자료형, 클래스 기반
//        WrapperClass : 기본형 타입을 Wrapping한 클래스
//        int a = 10;
//        Integer b = new Integer(10);
////        오프 언박싱 : WrapperClass -> 기본자료형
//        int c = b;
////        오토 박싱 : 기본자료형 -> WrapperClass 형변환
//        Integer d = a;

//        String과 int의 형변환
//        int a = 10;
//        String st1 = Integer.toString(a);
//        String st2 = String.valueOf(a);
//
////        String -> int
//        int b = Integer.parseInt(st1);
//
////        배열에는 원시타입 자료형 세팅
//        int[] arr1 = {10,20,30};
//
////        리스트에는 참조자료형 세팅
////        참조자료형에 원시자료형을 담을때는 Wrapper클래스를 써야함.
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//
//
//        String st1 = new String("hello1");
////        리터럴 방식 허용 : 권장되는 방식(문자pool을 통해 성능향상)
//        String st2 = "hello1";
//        String st3 = "hello1";
////        참조자료형이므로, ==비교는 메모리주소가 비교됨.
//        System.out.println(st1==st2); //false
////        값을 비교할때는 .equals사용
//        System.out.println(st1.equals(st2)); //true
//        System.out.println(st2==st3); //true
//
//        char ch1 = '가';
//        char ch2 = '가';
//        System.out.println(ch1==ch2);

//        equals 중에 대소문자 무시
//        String st1 = "hello1";
//        String st2 = "hello1";
//        String st3 = "Hello1";
//        System.out.println(st1.equals(st2)); // true
//        System.out.println(st2.equals(st3)); // false
//        System.out.println(st2.equalsIgnoreCase(st3)); // ture //IgnoreCase 대소문자 무시

//        문자열의 길이 : length()
//        String st1 = "hello1 java1 world2";
//        System.out.println(st1.length());
////        소문자알파벳의 갯수 구하기
//        int b=0;
//        for(int i=0;i<st1.length();i++){
//            if(st1.charAt(i)>='a' && st1.charAt(i)<='z'){
//                b++;
//            }
//        }
//        System.out.println(b);


////        ex) a의 개수가 몇개인지 출력
//        String st2 = "abcdefabaaf";
//        int b = 0;
//        for(int i = 0;i<st2.length();i++){
//            if(st2.charAt(i)=='a'){
//                b++;
//            }
//        }
//        System.out.println(b);

//        toCharArray() : String문자열을 char배열로 리턴
//        String st1 = "abcd";
//        char[] chArr = st1.toCharArray(); //char[] = {a,b,c,d}

//       ex) toCharArray()를 이용한 문자열의 a개수 구하기
//        String st2 = "abcdefabaaf";
////        int b = 0;
////        char[] chArr = st2.toCharArray();
////        for(int i = 0;i<st2.length();i++){
////            if(chArr[i]=='a'){
////                b++;
////            }
////        }
////        System.out.println(b);

        String st1 = "hello java java";
//        indexof : 특정 문자열의 위치 반환. 가장 먼저 나오는 문자열의 위치
        System.out.println(st1.indexOf("java"));

//        contains : 특정 문자열이 있는지 여부를 boolean으로 반환
        System.out.println(st1.contains("hello")); //ture
        System.out.println(st1.contains("world")); //false



    }
}
