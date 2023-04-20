package sopt.org.SecondSeminar.domain;

import lombok.Getter;

@Getter
public class Board {
    private Long id;
    private String title;
    private String author;
    private String content;

    public Board(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + this.id + "\n" +
                "title: " + this.title + "\n" +
                "author: " + this.author + "\n" +
                "content: " + this.content;
    }
}
