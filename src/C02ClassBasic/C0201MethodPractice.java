package C02ClassBasic;

public class C0201MethodPractice {
    public static void main(String[] args) {
        if(isPrime(7)){
            System.out.println("소수입니다.");
        }else{
            System.out.println("소수가 아닙니다.");
        }
    }
    public static boolean isPrime(int a){
        boolean answer = true;
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                answer=false;
                break;
            }
        }
        if(a<=1){
            answer = false;
        }
        return answer;
    }
}
