package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {

//        int a = 0;
//        while (a<10){
//            System.out.println("hello wolrd");
//            a+=1;
//
//        }

//        예제) 2~10까지 출력 while문
//        int a=2;
//        while(a<=10){
//            System.out.println(a);
//            a++;
//        }

//        예제) 입력한 숫자의 구구단 출력
//        3 x 1 = 3
//        3 x 2 = 6 ...
//        while(true){
//            System.out.println("몇단 : ");
//            Scanner sc = new Scanner(System.in);
//            int dan = sc.nextInt();
//            int a = 1;
//            while(a<10){
//                System.out.println(dan + " x " + a + " = " + (dan*a));
//                a++;
//            }
//        }

//        도어락키예제 -> 무한반복되는 도어락키 예제
//        int a = 0;
//
//        while(true){
//            int answer = 1234;
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            if(answer == input){
//                System.out.println("문이 열렸습니다.");
////                breack문은 가장 가까이에 있는 반복문을 종료
//                break;
//            }else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            a++;
//            if(a==5){
//                System.out.println("5회이상초과");
//                break;
//            }
//        }

//        do while문 : 무조건 한번은 실행되는 while문

//        int a = 100;
//        do {
//            System.out.println(a);
//            a--;
//        }
//        while(a>90);

//        for문 : 초기식, 조건식, 증감식이 모두 포함돼 있는 반복문

//        int b=2;
//        while(b<=10){
//            System.out.println(b);
//            b++;
//        }
//        for(int a=2;a<11;a++){
//            System.out.println(a);
//        }
//        for문은 사용했던 변수명을 for문 끝난이후 다음 라인에서 재선언이 가능

//        ex) 1부터 10중에 홀수만 출력

//        for(int a = 1;a<11;a++){
//            if(a%2==1){
//                System.out.println(a);
//            }
//        }

//        ex) 1부터 20중에 짝수를 모두 더한 값
//        int a = 0;
//        int sum = 0;
//        for(a=1;a<21;a++){
//            if(a%2==0){
//                sum = sum + a;
//            }
//        }
//        System.out.println(sum);

//        ex) 두 수의 최대공약수 찾기
//        int a = 24;
//        int b = 36;
//        int min = a<b ? a : b;
//        int c = 0;
//        for(int i = 1;i<=min;i++){
//            if(a%i==0 && b%i==0){
//                c=i;
//            }
//        }
//        System.out.println(c);
//
//        ex) 소수구하기 : 1과 자기 자신을 제외한 숫자로 나누어지지 않는 수
//        사용자가 입력한 숫자 n이 소수인지 아닌지 판별
//        System.out.println("숫자입력 : ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = 0;
//        for(int i = 1;i<=a;i++){
//            if(a%i==0){
//                b++;
//            }
//        }
//        if(b>2){
//            System.out.println("소수가아닙니다.");
//        }else{
//            System.out.println("소수입니다.");
//        }

//        강사님풀이
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean answer = false;
//        for(int i=2;i*i<=input;i++){  //소수 검사는 제곱근까지만
//            if(input%i==0){
//                answer=true;
//                break;
//            }
//        }
//        if(answer==true){
//            System.out.println("소수x");
//        }else{
//            System.out.println("소수o");
//        }


//        continue : 반복문의 조건식으로 이동
//        for (int i=1;i<11;i++){
//            if(i%2 ==0){
//                continue;
//            }
//            System.out.println(i);
//        }
//
////        배열과 enhanced for문(향상된 for문 -for each문)
//        int[] arr = {1,3,5,7};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
////        일반for문으로 배열접근
//        for(int i=0;i<4;i++){
//            System.out.println(arr[i]);
//        }
//
////        향상된 for문으로 배열 접근 : a의 arr의 값이 하니씩 담기고, 값의 갯수만큼 반복횟수가 결정
//        for(int a : arr){
//            System.out.println(a);
//        }

//        일반for문을 통해 arr의 저장된 값 변경
//        int[] arr = {1,3,5,7};
//        for(int i=0;i<4;i++){
//            arr[i] += 10;
//        }
//        System.out.println(Arrays.toString(arr));
//        향상된 for문으로 arr 값 변경

//        int[] arr = {1,3,5,7};
//        for(int a : arr){
//            a+=100;
//        }
//        System.out.println(Arrays.toString(arr));
//
////        자바 변수의 유효범위 : {}
//        int num = 10;
//        if(num>1){
//            int abc = 20;
//            num  = 20;
//        }
////        abc = 30; //if문 중괄호 밖에서는 abc변수의 존재를 모름
//        System.out.println(num);


//        다중반복문
//        for(int dan=2;dan<10;dan++){
//            System.out.println(dan + "단 입니다.");
//            for(int a=1;a<10;a++){
//                System.out.println(dan + " x " + a + " = " + (dan*a));
//            }
//        }
//
////        라벨문 : 반복문에 이름을 붙이는것
//        boolean end = false;
//        for(int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                System.out.println("hello world");
//                if(j==2){
//                    end=true;
//                    break;
//                }
//            }
//            if(end==true){
//                break;
//            }
//        }


//        int[][] arr = {{1, 2, 3}, {4, 5, 11}, {7, 8, 9,}, {10, 11, 12}};
////        숫자8을 찾아서 2,1에 있다고 출력
//        for(int a = 0;a<4;a++){
//            for(int b=0;b<3;b++){
//                if(arr[a][b]==8){
//                    System.out.println(a + "," + b +"에 있습니다.");
//                }
//            }
//        }

//        숫자11을 찾되, 가장 먼저 찾아지는 11의 위치만 출력

//        int[][] arr = {{1, 2, 3}, {4, 5, 11}, {7, 8, 9,}, {10, 11, 12}};
//        int a = 0;
//        int b = 0;
//        loop1:
//        for(a = 0;a<4;a++){
//            for(b=0;b<3;b++){
//                if(arr[a][b]==11){
//                    break loop1;
//                }
//
//            }
//        }
//        System.out.println(a + "," + b +"에 있습니다.");


//        100~200 중에서 가장 작은 소수를 출력

        int input = 0;

        for(input=100;input<201;input++){
            boolean answer = false;
            for(int i=2;i*i<=input;i++) {  //소수 검사는 제곱근까지만
                if (input % i == 0) {
                    answer = true;
                    break;
                }
            }
            if(!answer){
                System.out.println(input);
                break;
            }
        }






    }
}
