package org.example.entity;

import javax.persistence.*;

@Entity
@Table
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @Column(name = "text", nullable = false, length = 200)
    private String text;

    @Column(name = "author", nullable = false, length = 30)
    private String author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postId")
    private Post post;

    public Comment( String text, String author) {

        this.text = text;
        this.author = author;
    }

    public Comment() {
    }

    public Long getCommentId() {
        return commentId;
    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
