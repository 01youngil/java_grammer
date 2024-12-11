package C02ClassBasic;

public class C0202Person {
//    private접근제어는 해당 클래스내에서만 접근 가능
//    클래스에서 객체변수는 일반적으로 변수의 안정성을 위해 private으로 설정
    private String name;
    private int age;
    private String email;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void eating(){
        System.out.println(this.name + "님이 밥을 먹고 있습니다.");
    }
    public String whoIs(){
        String result = "이름 : " + this.name + " 나이 : " + this.age +" 이메일 : " + this.email;
        return result;
    }

}

