package C07ExceptionFileParsing.AuthorExcption;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//저장소역할을 하는 계층
public class AuthorRepository {
    private static List<Author> authorList = new ArrayList<>();

    public void register(Author author){
        authorList.add(author);
    }

    public Optional<Author> findByEmail(String email){
//        email로 Author를 찾는 로직
        Author author = null;
        for(Author a : authorList){
            if(a.getEmail().equals(email)){
                author=a;
            }
        }
        return Optional.ofNullable(author);
    }

    public List<Author> findAll(){
        return authorList;
    }

}
