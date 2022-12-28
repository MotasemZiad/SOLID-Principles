package LSP;

public class LinkPost extends Post {

    @Override
    public String createPost(PostDatabase db, String post) {
        return db.addLinkPost(post);
    }
    
}
