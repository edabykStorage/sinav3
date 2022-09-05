package com.eda.icerikyonetimi.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    private String surname;

    @Enumerated(EnumType.STRING)
    private ERole role;

    private LocalDateTime createdAt;

    private LocalDateTime updateddAt;

    private boolean enabled;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
    List<SubjectDetail> subjectDetails;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
    List<Questions> questions;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
    List<Answers> answers;

    public User() {
    }

    public User(String name, String surname, ERole role, LocalDateTime createdAt,
                LocalDateTime updateddAt, boolean enabled) {
        this.name = name;
        this.surname = surname;
        this.role = role;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ERole getRole() {
        return role;
    }

    public void setRole(ERole role) {
        this.role = role;
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

    public List<SubjectDetail> getSubjectDetails() {
        return subjectDetails;
    }

    public void setSubjectDetails(List<SubjectDetail> subjectDetails) {
        this.subjectDetails = subjectDetails;
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", role=" + role +
                ", createdAt=" + createdAt +
                ", updateddAt=" + updateddAt +
                ", enabled=" + enabled +
                ", subjectDetails=" + subjectDetails +
                ", questions=" + questions +
                ", answers=" + answers +
                '}';
    }
}
