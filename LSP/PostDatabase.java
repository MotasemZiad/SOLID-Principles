package LSP;

public class PostDatabase {
    public String add(String post) {
        return "Original Post: " + post;
    }

    public String addTagPost(String post) {
        return "Tag Post: " + post;
    }

    public String addMentionPost(String post) {
        return "Mention Post: " + post;
    }
}
