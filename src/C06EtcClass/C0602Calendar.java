package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C0602Calendar {
    public static void main(String[] args) {
////        java.util 패키지의 Canlendar 클래스
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getTime());
//        System.out.println(calendar.get(Calendar.YEAR)); // 년
//        System.out.println(calendar.get(Calendar.MONTH)+1); // 월(+1해야함)
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // 0:일 1:월 2:화
//        System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); // 시
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // 일
//        System.out.println(calendar.get(Calendar.MINUTE)); // 분

////        java.time패키지의 Local~ 클래스
////        LocalDate : 날짜, LocalTime : 시간, LocalDateTime : 날짜와시간
//        LocalDate loclaDate = LocalDate.now();
//        System.out.println(loclaDate);
//        System.out.println(loclaDate.getYear());
//        System.out.println(loclaDate.getMonth());
//        System.out.println(loclaDate.getDayOfWeek());
//        System.out.println(loclaDate.getDayOfMonth());
//
////        LocalTime
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//        System.out.println(localTime.getHour());
//        System.out.println(localTime.getMinute());
//        System.out.println(localTime.getSecond());

//        LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getHour());

//        .of : 임의로 특정시간을 만들어 내고 싶을때
        LocalDate birthday = LocalDate.of(2000,11,12);
        System.out.println(birthday.getYear());
        System.out.println(birthday.getMonth());
        System.out.println(birthday.getDayOfMonth());

        LocalDateTime birthDayTime = LocalDateTime.of(2000,11,12,13,4,10);
        System.out.println(birthDayTime.get(ChronoField.YEAR));
        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(birthDayTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println(birthDayTime.get(ChronoField.DAY_OF_WEEK));

//        0: 오전, 1: 오후
        System.out.println(birthDayTime.get(ChronoField.AMPM_OF_DAY));



    }
}
