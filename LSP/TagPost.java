package LSP;

public class TagPost extends Post {

    @Override
    public String createPost(PostDatabase db, String post) {
        return db.addTagPost(post);
    }

}
