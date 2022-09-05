package com.eda.icerikyonetimi.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_subject_detail")
public class SubjectDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subject;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    List<User> user;

    @OneToMany(mappedBy = "subjectDetail",cascade = CascadeType.ALL)
    private List<Questions> questions = new ArrayList<>();

    private String title;
    private String description;
    @Lob
    private String article;

    private LocalDateTime createdAt;

    private LocalDateTime updateddAt;

    private boolean enabled;

    public SubjectDetail(Subject subject, List<User> user,  String title, String description, String article, LocalDateTime createdAt, LocalDateTime updateddAt, boolean enabled) {
        this.subject = subject;
        this.user = user;
        this.title = title;
        this.description = description;
        this.article = article;
        this.createdAt = createdAt;
        this.updateddAt = updateddAt;
        this.enabled = enabled;
    }

    public SubjectDetail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setPhoneNumbers(List<Questions> Questions) {
        this.questions = questions;
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

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
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
        return "SubjectDetail{" +
                "id=" + id +
                ", subject=" + subject +
                ", user=" + user +
                ", phoneNumbers=" + questions +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", article='" + article + '\'' +
                ", createdAt=" + createdAt +
                ", updateddAt=" + updateddAt +
                ", enabled=" + enabled +
                '}';
    }
}
