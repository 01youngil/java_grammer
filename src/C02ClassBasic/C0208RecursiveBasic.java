//package C02ClassBasic;
//
//public class C0208RecursiveBasic {
//    public static void main(String[] args) {
////        for문으로 1~10까지 누적합계
//        int sum =0;
//        for(int i=1;i<11;i++){
//            sum+=i;
//        }
//        System.out.println(sum);
////        재귀함수로 1~10까지 누적합계
//        System.out.println(sumAcc(10));
//
////        factorial 값 구하기
////        factorial(5) -> 1*2*3*4*5
//        System.out.println(factorial(10));
//
////        피보나치 수열 구현
////        1 1 2 3 5 8 13 21
////        int arr[] = {};
////        arr[0]=1;
////        arr[1]=1;
////        for(int i=2;i<10;i++){
////            arr[i] = arr[i-1]+arr[i-2];
//
//        }
//
//    }
//
//    public static int sumAcc(int n){
//        if(n==1){
//            return 1;
//        }
//        return n + sumAcc(n-1);
//
//    }
//    public static int factorial(int n){
//        if (n == 1) {
//            return 1;
//        }
//        return n * factorial(n-1);
//    }
//
//    public static int fibonacci(int n){
//        if(n<=2){
//            return 1;
//        }
//        return fibonacci(n-1) + fibonacci(n-2);
//    }
