package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BankService {
    public static void main(String[] args) throws IOException {
//        프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
//        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
//        1.개설 : 계좌번호와 현재가지고 계신돈을 입력하세요.
//        2.조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
//        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요.
//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증)
//        5.송금 : 송금서비스입니다. user1과 user2의 송금금액을 입력해주세요.(잔액검증)

        Map<String,BankAccount> map = new HashMap<>();
        while(true){
            System.out.println("서비스번호입력 : 1개설 2조회 3입금 4출금 5송금");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int serNum = Integer.parseInt(br.readLine());

            if(serNum==1){
                System.out.println("1.계좌개설");
                System.out.println("계좌번호를 입력해주세요.");
                String accNum = br.readLine();
                System.out.println("개설금액을 입력해주세요.");
                int money = Integer.parseInt(br.readLine());
                BankAccount ba = new BankAccount(accNum,money);
                map.put(accNum,ba);

            }else if(serNum==2){
                System.out.println("2.계좌조회");
                System.out.println("계좌번호를 입력해주세요.");
                String accNum = br.readLine();
                BankAccount ba = map.get(accNum);
                if(map.containsKey(accNum)) {
                    System.out.println("현재 잔고는 : " + ba.getBalance());
                }else{
                    System.out.println("없는 계좌입니다.");
                }

            }else if(serNum==3){
                System.out.println("3.입금");
                System.out.println("계좌번호를 입력해주세요.");
                String accNum = br.readLine();
                BankAccount ba = map.get(accNum);
                System.out.println("입금금액을 입력해주세요.");
                int money = Integer.parseInt(br.readLine());
                ba.deposit(money);

            }else if(serNum==4){
                System.out.println("4.출금");
                System.out.println("계좌번호를 입력해주세요.");
                String accNum = br.readLine();
                BankAccount ba = map.get(accNum);
                System.out.println("출금금액을 입력해주세요.");
                int money = Integer.parseInt(br.readLine());
                ba.withdraw(money);

            }else if(serNum==5){
                System.out.println("5.송금");
                System.out.println("내계좌번호를 입력해주세요.");
                String accNum1 = br.readLine();
                System.out.println("상대계좌번호를 입력해주세요.");
                String accNum2 = br.readLine();
                System.out.println("송금금액을 입력해주세요.");
                int money = Integer.parseInt(br.readLine());

                BankAccount ba1 = map.get(accNum1);
                BankAccount ba2 = map.get(accNum2);
                ba1.transfer(ba2,money);

            }else{
                System.out.println("다시입력");
            }



        }
    }
}

class BankAccount{
    static int static_id = 0;
    private int id;
    private String accNum;
    private int balance;

    public BankAccount(String accNum, int balance) {
        static_id++;
        this.id = static_id;
        this.accNum = accNum;
        this.balance = balance;
    }

    public void deposit(int money){
        this.balance += money;
    }

    public boolean withdraw(int money){
        if(this.balance<money){
            System.out.println("잔액부족");
            return false;
        }else{
            this.balance -= money;
            return true;
        }
    }

    public void transfer(BankAccount Uacc, int money){
        if(!this.withdraw(money)){
            return;
        }
        Uacc.deposit(money);
    }

    public int getId() {
        return id;
    }

    public String getAccNum() {
        return accNum;
    }

    public int getBalance() {
        return balance;
    }
}







//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class BankService {
//    public static void main(String[] args) throws IOException {
////        프로그램은 항상 실행될 수 있도록 전체코드를 while(true)처리
////        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
//        Map<String,BankAccount> map = new HashMap<>();
//        while(true) {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금");
//            String input = br.readLine();
//            int serNum = Integer.parseInt(input);
//
//            if (serNum == 1) {
////        1.개설 : 계좌번호와 현재가지고 계신돈을 입력하세요.
//                System.out.println("계좌번호를 입력하세요.");
//                String accountNumber = br.readLine();
//                System.out.println("가진돈을 입력하세요.");
//                int money = Integer.parseInt(br.readLine());
//                BankAccount ba = new BankAccount(accountNumber,money);
//                map.put(accountNumber,ba);
//
////        2.조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
//            }else if(serNum==2) {
//                System.out.println("계좌번호를 입력해주세요.");
//                String accountNumber = br.readLine();
//                BankAccount ba = map.get(accountNumber);
//                System.out.println("현재 잔고는" + ba.getBalance());
//
////        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요.
//            }else if(serNum==3) {
//                System.out.println("계좌입금서비스입니다.");
//                System.out.println("계좌번호를 입력해주세요.");
//                String accountNumber = br.readLine();
//                System.out.println("입금금액을 입력해주세요.");
//                int money = Integer.parseInt(br.readLine());
//                BankAccount ba = map.get(accountNumber);
//                ba.deposit(money);
//
////        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.
//            }else if(serNum==4) {
//                System.out.println("계좌출금서비스입니다.");
//                System.out.println("계좌번호를 입력해주세요.");
//                String accountNumber = br.readLine();
//                System.out.println("출금금액을 입력해주세요.");
//                int money = Integer.parseInt(br.readLine());
//                BankAccount ba = map.get(accountNumber);
//                ba.withdraw(money);
//
////        5.송금 : 송금서비스입니다. user1과 user2의 계좌번호와 송금금액을 입력해주세요.
//            }else if(serNum==5) {
//                System.out.println("계좌송금서비스입니다.");
//                System.out.println("본인계좌번호를 입력해주세요.");
//                String accountNumber1 = br.readLine();
//                System.out.println("상대계좌번호를 입력해주세요.");
//                String accountNumber2 = br.readLine();
//                System.out.println("송금금액을 입력해주세요.");
//                int money = Integer.parseInt(br.readLine());
//                BankAccount ba1 = map.get(accountNumber1);
//                BankAccount ba2 = map.get(accountNumber2);
//                ba1.transfer(ba2, money);
//
//            }else{
//                System.out.println("잘못입력하셨습니다.");
//            }
//        }
//
//    }
//
//}
//
//
////Account객체 : 자체ID값(자동increment), 계좌번호, 잔액 변수로구성
//class BankAccount{
//    static long static_id = 0L;
//    private String accountNumber;
//    private int balance;
//    private long id;
//
//    public BankAccount(String accountNumber, int balance) {
//        static_id++;
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//        this.id = static_id;
//    }
//
//    public void transfer(BankAccount yourBankacount, int money){
//        if(!this.withdraw(money)){
//            return;
//        }
//        yourBankacount.deposit(money);
//    }
//
//    public void deposit(int money){
//        this.balance += money;
//    }
//
//    public boolean withdraw(int money){
//        if(this.balance < money){
//            System.out.println("잔액 부족입니다.");
//            return false;
//        }else{
//            this.balance -= money;
//            return true;
//        }
//    }
//
//
//
//
//    public long getId() {
//        return id;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//}