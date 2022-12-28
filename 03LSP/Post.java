package LSP;

public class Post {
    public String createPost(PostDatabase db, String post){
        return db.add(post);
    }

    
}
