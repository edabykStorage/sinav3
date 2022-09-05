package com.eda.icerikyonetimi.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tbl_answers")
public class Answers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    List<User> user;

    private String answer;


    @OneToOne( optional = false,cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    private Questions question;

    private LocalDateTime createdAt;

    private LocalDateTime updateddAt;

    private boolean enabled;

    public Answers() {
    }

    public Answers(List<User> user, String answer, Questions question, LocalDateTime createdAt, LocalDateTime updateddAt, boolean enabled) {
        this.user = user;
        this.answer = answer;
        this.question = question;
        this.createdAt = createdAt;
        this.updateddAt = updateddAt;
        this.enabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Questions getQuestion() {
        return question;
    }

    public void setQuestion(Questions question) {
        this.question = question;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateddAt() {
        return updateddAt;
    }

    public void setUpdateddAt(LocalDateTime updateddAt) {
        this.updateddAt = updateddAt;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "Answers{" +
                "id=" + id +
                ", user=" + user +
                ", answer='" + answer + '\'' +
                ", question=" + question +
                ", createdAt=" + createdAt +
                ", updateddAt=" + updateddAt +
                ", enabled=" + enabled +
                '}';
    }
}
