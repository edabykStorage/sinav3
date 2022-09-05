package com.eda.icerikyonetimi.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_questions")
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne( mappedBy = "question")
    private Answers answers;

    @ManyToOne(cascade = CascadeType.ALL)
    SubjectDetail subjectDetail;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    List<User> user;

    private String title;

    private String Question;

    private LocalDateTime createdAt;

    private LocalDateTime updateddAt;

    private boolean enabled;

    public Questions() {
    }

    public Questions( SubjectDetail subjectDetail, List<User> user, String title, String question, LocalDateTime createdAt, LocalDateTime updateddAt, boolean enabled) {

        this.subjectDetail = subjectDetail;
        this.user = user;
        this.title = title;
        Question = question;
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

    public Answers getAnswers() {
        return answers;
    }

    public void setAnswers(Answers answers) {
        this.answers = answers;
    }

    public SubjectDetail getSubjectDetail() {
        return subjectDetail;
    }

    public void setSubjectDetail(SubjectDetail subjectDetail) {
        this.subjectDetail = subjectDetail;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
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
}
