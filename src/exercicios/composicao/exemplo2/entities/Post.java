package exercicios.composicao.exemplo2.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date date;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(Date date, String title, String content, Integer likes) {
        this.date = date;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes + " likes - " + sdf.format(date) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");

        for (Comment comment : comments) {
            sb.append(comment.getText() + "\n");
        }

        return sb.toString();

    }

}
