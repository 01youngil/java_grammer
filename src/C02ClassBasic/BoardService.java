package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
//
//public class BoardService {
//    public static void main(String[] args) throws IOException {
//
//        Map<String,Author> authorMap = new HashMap<>();
//        Map<String,Post> postMap = new HashMap<>();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        while(true) {
//            System.out.println("<서비스번호입력>");
//            System.out.println("1.회원가입 2.회원 전체목록조회 3.회원 상세조회 \n" +
//                    "4.게시글 작성 5.게시글 목록조회 6. 게시글 상세조회 7.종료");
//            int serNum = Integer.parseInt(br.readLine());
//
//            if(serNum==1) {
////        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
//                System.out.println("<회원가입>");
//                System.out.println("이름 : ");
//                String name = br.readLine();
//                System.out.println("이메일 : ");
//                String email = br.readLine();
//                System.out.println("비밀번호 : ");
//                String password = br.readLine();
//
//                Author at = new Author(email,name,password);
//                authorMap.put(email,at);
//
//                System.out.println(at.getAuthor_id());
//
//            }else if(serNum==2) {
////        2.회원 전체 목록 조회 : id, email
//                System.out.println("<회원 전체 목록조회>");
//                Author at = (Author) authorMap.values();
//
//            }else if(serNum==3) {
////        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수
//                System.out.println("<회원 상세 조회>");
//                System.out.println("id를 입력하세요.");
//                int id = Integer.parseInt(br.readLine());
//
////                Author at = authorMap.get();
////                if(authorMap.containsKey(id)){
////                    System.out.println("id : "+ at.getAuthor_id() +
////                    " email : " + at.getEmail() + " name : " + at.getName()
////                    + " 작성글수 : ");
////                }else{
////                    System.out.println("없는회원입니다.");
////                }
//
//
//
//            }else if(serNum==4) {
////        4.게시글 작성 : 제목, 내용, 작성자Email -> author_id를 찾아서 author_id로 변경 입력, id값(auto_increment)
//                System.out.println("<게시글 작성>");
//
//            }else if(serNum==5) {
////        5.게시글 목록 조회 : id(post), title
//                System.out.println("<게시글 목록 조회>");
//
//
//            }else if(serNum==6) {
////        6.게시글 상세 조회 : id(post), title, contents, 작성자email
//                System.out.println("<게시글 상세 조회>");
//
//
//            }else if(serNum==7) {
////        7.서비스 종료
//                System.out.println("<종료>");
//                break;
//
//
//            }else{
//                System.out.println("<다시입력>\n");
//            }
//        }
//
//
//    }
//}
//
//class Author{
//    static int static_id = 0;
//    private int author_id;
//    private String email;
//    private String name;
//    private String password;
//
//    public Author(String email, String name, String password) {
//        static_id++;
//        this.author_id = static_id;
//        this.email = email;
//        this.name = name;
//        this.password = password;
//    }
//
//    public int getAuthor_id() {
//        return author_id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//}
//
//
//class Post{
//    static int static_id = 0;
//    private int post_id;
//    private String title;
//    private String contents;
//
//    public Post(int post_id, String title, String contents) {
//        static_id++;
//        this.post_id = static_id;
//        this.title = title;
//        this.contents = contents;
//    }
//
//    public int getPost_id() {
//        return post_id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getContents() {
//        return contents;
//    }
//}





public class BoardService {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        StringTokenizer st;

        loop :
        while(true) {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1.회원가입 2.회원전체목록조회 3.회원상세조회 4.게시글작성 5.게시글목록조회 6.게시글상세조회 7.서비스종료");

            switch (br.readLine()) {

//        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto increment)
                case "1" -> {
                    System.out.println("회원가입 : 이름, 이메일, 비밀번호를 입력해주세요");
                    st = new StringTokenizer(br.readLine());
                    String name = st.nextToken();
                    String email = st.nextToken();
                    String password = st.nextToken();
                    Author a = new Author(name, email, password);
                }

//        2.회원 전체 목록 조회 : id, email
                case "2" -> {
                    System.out.println("회원 전체 목록 조회");
                    Author.allAuthor();
                }

//        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글 수
                case "3" -> {
                    System.out.println("회원 상세 조회, author id를 입력해주세요");
                    long id = Integer.parseInt(br.readLine());
                    Author.infoAuthor(id);
                }

//        4.게시글 작성 : 제목, 내용, 작성자 email 입력, author id값(email로 찾아서 입력)
                case "4" -> {
                    System.out.println("게시글 작성 : 제목, 내용, 작성자 email을 입력해주세요");
                    st = new StringTokenizer(br.readLine());
                    String title = st.nextToken();
                    String contents = st.nextToken();
                    String email = st.nextToken();
                    Post p = new Post(title, contents, email);
                    Author.authorMap.get(email).postListAdd(p);

                }

//        5.게시물 전체 목록 조회 : id (post id, auto increment), title
                case "5" -> {
                    System.out.println("게시물 전체 목록 조회");
                    Post.allPost();
                }

//        6.게시물 상세 조회 : id (post id), title, contents, 작성자email
                case "6" -> {
                    System.out.println("게시물 상세 조회, post id를 입력하세요");
                    long id = Integer.parseInt(br.readLine());
                    Post.infoPost(id);
                }

//        7.서비스 종료
                case "7" -> {
                    System.out.println("서비스를 종료합니다");
                    break loop;
                }
            }
        }
    }
}


class Author{
    private static long staticId = 0L;
    private long id;
    private String email;
    private static String name;
    private String password;
    private List<Post> postList = new ArrayList<>();
    static Map<String, Author> authorMap = new HashMap<>();

    public Author(String name, String email, String password) {
        this.id = staticId++;
        this.name = name;
        this.email = email;
        this.password = password;
        authorMap.put(this.email, this);
    }

    public void postListAdd(Post p){
        this.postList.add(p);
    }

    public static void allAuthor(){
        for(String email : authorMap.keySet()){
            System.out.println("Id : " + authorMap.get(email).id + " , email : " + email);
        }
    }

    public static void infoAuthor(long id){
        for(String email : authorMap.keySet()){
            if(authorMap.get(email).id == id){
                Author a = authorMap.get(email);
                System.out.println("id : " + a.id + " , email :  " + a.email + " , name :  " + a.name + " ," +
                        " password : " + a.password + " , 작성글 수 :  " + a.postList.size());
            }
        }
    }


    public long getId() {
        return id;
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

    public List<Post> getPostList() {
        return postList;
    }
}


class Post{
    //    제목, 내용, 작성자 email 입력, author id값(email로 찾아서 입력)
    static long staticId = 0L;
    private String title;
    private String contents;
    private String email;
    private long postId;
    private Author author;
    static Map<Long, Post> postMap= new HashMap<>();

    public Post(String title, String contents, String email) {
        this.postId = staticId++;
        this.title = title;
        this.contents = contents;
        this.email = email;
        this.author = Author.authorMap.get(email);
        postMap.put(postId, this);
    }

    public static void allPost(){
        for(long i : postMap.keySet()){
            System.out.println("Id : " + postMap.get(i).postId + " , title : " + postMap.get(i).title);
        }
    }

    public static void infoPost(long id){
        Post p = postMap.get(id);
        System.out.println("post id : " + p.postId + " , title : " + p.title + ", contents : "
                + p.contents + ", 작성자 name : " + p.author.getName());
    }
}