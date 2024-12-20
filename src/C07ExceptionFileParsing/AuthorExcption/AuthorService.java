package C07ExceptionFileParsing.AuthorExcption;

import java.util.*;

//핵심 로직을 구현하는 계층
public class AuthorService {
    private AuthorRepository authorRepository;
    public AuthorService(){
        AuthorRepository authorRepository = new AuthorRepository();
    }

    public void register(String name,String email,String password){
        Optional<Author> author = authorRepository.findByEmail(email);
        if(author.isPresent()){
            throw new IllegalArgumentException("이메일 중복");
        }
        if(password.length()<8){
            throw new IllegalArgumentException("비밀번호 짧음");
        }
        this.authorRepository.register(new Author(name,email,password));
    }

    public void login(String email, String password){
        Optional<Author>author = authorRepository.findByEmail(email);
        if(!author.isPresent()){
            throw new NoSuchElementException("없는이메일");
        }else{
            if(author.get().getPassword().equals(password)){
                throw new IllegalArgumentException("잘못된 비밀번호");
            }
        }
    }

    public List<Author> findAll(String email, String password){
        return this.authorRepository.findAll();

    }


}
