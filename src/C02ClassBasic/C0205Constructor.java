package C02ClassBasic;

public class C0205Constructor {
    public static void main(String[] args) {
//        캘린더 객체 생성 후 연도, 월, 일 세팅
////        데이터의 안정성을 위해 일반적으로 setter를 사용하지 않음.
//        Calendar cl = new Calendar();
//        cl.setYear(2024);
//        cl.setMonth(12);
//        cl.setDay(11);

        Calendar cl = new Calendar("2024","12","11");
//        캘린더 객체출력 : "오늘은 xxx년도, xx월, xx일 입니다."
        System.out.println("오늘은 " + cl.getYear() + "년도, " + cl.getMonth() + "월, " + cl.getDay() + "일 입니다.");
    }
}

class Calendar{
//    year,month,day 변수값 존재하는 클래스, getter/setter 추가
    private String year;
    private String month;
    private String day;

//    별도의 생성자를 만들경우, 초기(기본)생성자는 더이상 사용할 수 없으므로, 별도추가 필요.
    public Calendar(){

    }
//    생성자는 메서드의 일종으로 클래스명과 동일한 이름을 갖는 메서드
//    생성자를 통해 객체변수값들을 객체가 만들어지는 시점에 초기화(세팅)
    public Calendar(String year, String month, String day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }
    public String getMonth() {
        return month;
    }
    public String getDay() {
        return day;
    }

}