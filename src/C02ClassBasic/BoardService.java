package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class BoardService {
    public static void main(String[] args) throws IOException {

        Map<String,Author> authorMap = new HashMap<>();
        Map<String,Post> postMap = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.println("<서비스번호입력>");
            System.out.println("1.회원가입 2.회원 전체목록조회 3.회원 상세조회 \n" +
                    "4.게시글 작성 5.게시글 목록조회 6. 게시글 상세조회 7.종료");
            int serNum = Integer.parseInt(br.readLine());

            if(serNum==1) {
//        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
                System.out.println("<회원가입>");
                System.out.println("이름 : ");
                String name = br.readLine();
                System.out.println("이메일 : ");
                String email = br.readLine();
                System.out.println("비밀번호 : ");
                String password = br.readLine();

                Author at = new Author(email,name,password);
                authorMap.put(email,at);

                System.out.println(at.getAuthor_id());

            }else if(serNum==2) {
//        2.회원 전체 목록 조회 : id, email
                System.out.println("<회원 전체 목록조회>");
//                System.out.println(Arrays.deepToString(authorList.toArray()));

            }else if(serNum==3) {
//        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수
                System.out.println("<회원 상세 조회>");
                System.out.println("id를 입력하세요.");
                int id = Integer.parseInt(br.readLine());

                Author at = authorMap.get(at.getEmail());
                if(authorList.contains(id)){
                    System.out.println("id : "+ at.getAuthor_id() +
                    " email : " + at.getEmail() + " name : " + at.getName()
                    + " 작성글수 : ");
                }else{
                    System.out.println("없는회원입니다.");
                }



            }else if(serNum==4) {
//        4.게시글 작성 : 제목, 내용, 작성자Email -> author_id를 찾아서 author_id로 변경 입력, id값(auto_increment)
                System.out.println("<게시글 작성>");

            }else if(serNum==5) {
//        5.게시글 목록 조회 : id(post), title
                System.out.println("<게시글 목록 조회>");


            }else if(serNum==6) {
//        6.게시글 상세 조회 : id(post), title, contents, 작성자email
                System.out.println("<게시글 상세 조회>");


            }else if(serNum==7) {
//        7.서비스 종료
                System.out.println("<종료>");
                break;


            }else{
                System.out.println("<다시입력>\n");
            }
        }


    }
}

class Author{
    static int static_id = 0;
    private int author_id;
    private String email;
    private String name;
    private String password;

    public Author(String email, String name, String password) {
        static_id++;
        this.author_id = static_id;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}


class Post{
    static int static_id = 0;
    private int post_id;
    private String title;
    private String contents;

    public Post(int post_id, String title, String contents) {
        static_id++;
        this.post_id = static_id;
        this.title = title;
        this.contents = contents;
    }

    public int getPost_id() {
        return post_id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }
}
