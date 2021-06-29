package org.example.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PostId;

    @Column(name = "title", nullable = false, length = 40)
    private String title;

    @Column(name = "description", nullable = false, length = 250)
    private String description;

    @Column(name = "content", nullable = false, length = 500)
    private String content;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

    public Post( String title, String description, String content) {

        this.title = title;
        this.description = description;
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Post() {
    }

    public Long getPostId() {
        return PostId;
    }

    public void setPostId(Long postId) {
        PostId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
