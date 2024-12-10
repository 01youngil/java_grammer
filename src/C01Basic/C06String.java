package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

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

//        String st1 = "hello java java";
////        indexof : 특정 문자열의 위치 반환. 가장 먼저 나오는 문자열의 위치
//        System.out.println(st1.indexOf("java"));
//
////        contains : 특정 문자열이 있는지 여부를 boolean으로 반환
//        System.out.println(st1.contains("hello")); //ture
//        System.out.println(st1.contains("world")); //false

//        문자열 더하기 : +=
//        String st1 = "hello";
//        st1 += " world";
//        substring(a,b) : a이상 b미만의 index의 문자를 잘라 반환
//        String st1 = "hello world";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6,st1.length()));

//        문제) 프로그래머스 특정문자 제거하기


//        문제) 프로그래머스 가운데 글자 가져오기



//        trim, strip : 문자열 양쪽 끝과 공백 제거  //둘이 같은 효과, strip 선호
//        String st1 = " hello world   ";
//        String trimSt1 = st1.trim();
//        String stripSt1 = st1.strip();
//        System.out.println(trimSt1);
//        System.out.println(stripSt1);

//        toUpperCase : 대문자로 변환, toLowerCase : 소문자로 변환
//        String s1 = "Hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);
//
////        char -> String 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
////        String -> char 형변환
//        char ch2 = st1.charAt(0);   //한글자
//        char[] ch3 = st1.toCharArray(); //여러글자

//        replace(a,b) : a문자열을 b문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world","java");
//        System.out.println(st2);

//        replaceAll(a,b) : replace와 동일, 정규표현식을 쓸 수 있는점이 차이.
//        String st1 = "01abc123한글123";
////        for문 활용해서 소문자알파벳만 제거한 새로운 문자열 생성
//        String a = "";
//        for(int i = 0;i<st1.length();i++){
//            if(st1.charAt(i)<'a' || st1.charAt(i)>'z'){
//                a += st1.charAt(i);
//            }
//        }
//        System.out.println(a);
//
////        [a-z] : 소문자 알파벳
////        [A-Z] : 대문자 알파벳
////        [A-Za-z] : 대소문자 알파벳
////        [가-힣] : 한글
////        [0-9] : 숫자
//        String answer2 = st1.replaceAll("[a-z]+",""); //  +는 한개 이상을 의미
//        System.out.println(answer2);

//        String input = "helloAAA";
//        System.out.println(input.matches("[A-Za-z]+"));
//        if(input.matches("[A-Za-z]+")){
//            System.out.println("제대로 입력하였습니다.");
//        }else{
//            System.out.println("틀렸습니다. 입력을 확인해주세요.");
//        }
//
////        전화번호 검증
//        String number = "010-1234-1234";
//        boolean b1 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number);
//        System.out.println(b1);
//
////        이메일 검증
//        String email = "hello111@gmail.com";
//        boolean b2 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$",email);
//        System.out.println(b2);

//        문제)문자열 다루기 기본 - 프로그래머스

//        split : 특정문자를 기준으로 문자열을 자르는것.
//        String a = "a:b:c:d";
//        String[] arr1 = a.split(":");
//        System.out.println(Arrays.toString(arr1));      // 결과값 : [a, b, c, d]
//        String b = "a b c d";
//        String[] arr2 = b.split(" ");
//        System.out.println(Arrays.toString(arr2));      // 결과값 : [a, b, c, d]
//        String c = "a b c  d";
//        String[] arr3 = c.split(" ");
//        System.out.println(Arrays.toString(arr3));      // 결과값 : [a, b, c, , d]
////        \s : 공백
//        String[] arr4 = c.split("\\s+");
//        System.out.println(Arrays.toString(arr4));      // 결과값 : [a, b, c, d]
//        int count = 0;
//        for(int i=0;i<arr3.length;i++){
//            if(arr3[i]!=""){
//                count++;
//            }
//        }
//        System.out.println(count);

//        null과 공백의 차이
//        String st1 = null; //null은 String 아님.
//        String st2 = "";
//        String st3 = "hello";
//        System.out.println(st1==st2); //false
////        System.out.println(st1.isEmpty()); //NullPointExeaption 발생
//        System.out.println(st2.isEmpty()); //true
//        System.out.println(st3.isEmpty()); //false
//
//        String[] arr = {"hello", "java", null, "python"};
//        int answer = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=null && arr[i].equals("python")){
//                answer = i;
//            }
//        }
//        System.out.println(answer);

//        문자열조립
//        String[] arr = {"java", "python", "javascript"};
//        String answer = "";
//        for(String a : arr){
//            answer += a;
//        }
//        System.out.println(answer);
////        문자열조립2
//        String answer2 = String.join(":", arr); //  ","  //  " " 등 도 가능
//        System.out.println(answer2);

//        StringBuffer : 문자열 조립
//        StringBuffer sb = new StringBuffer();
//        sb.append("java");
//        sb.append("python");
//        sb.append("javascript");
//        String answer = sb.toString();
//        System.out.println(answer);
//
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("java");
//        sb.append("\n");
//        sb2.append("python");
//        sb.append("\n");
//        sb2.append("javascript");
//        sb.append("\n");
//        String answer3 = sb2.toString();
//        System.out.println(answer3);

//        문자열 뒤집기
//        코드1
//        String st1 = "hello";
//        String answer = "";
//        for(int i=st1.length()-1;i>=0;i--){
//            answer += st1.charAt(i);
//        }
//        System.out.println(answer);
////        코드2
//        StringBuilder sb1 = new StringBuilder();
//        for(int i=st1.length()-1;i>=0;i--){
//            sb1.append(st1.charAt(i));
//        }
//        answer = sb1.toString();
////        코드3
//        StringBuilder sb = new StringBuilder(st1);
//        String answer2 = sb.reverse().toString();
//        System.out.println(answer2);

//        문제) 문자열 밀기 - 프로그래머스

//



    }
}
