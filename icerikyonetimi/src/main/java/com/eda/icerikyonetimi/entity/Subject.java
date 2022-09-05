package com.eda.icerikyonetimi.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;
    @ManyToOne
    Lesson lesson;

    private LocalDateTime createdAt;

    private LocalDateTime updateddAt;

    private boolean enabled;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true , mappedBy = "subject")
    @JoinColumn(name = "subject_detail_id", referencedColumnName = "id")
    private SubjectDetail subjectDetail;

    public Subject() {
    }

    public Subject(String name, Lesson lesson, LocalDateTime createdAt, LocalDateTime updateddAt, boolean enabled) {
        this.name = name;
        this.lesson = lesson;
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

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
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

    public SubjectDetail getSubjectDetail() {
        return subjectDetail;
    }

    public void setSubjectDetail(SubjectDetail subjectDetail) {
        this.subjectDetail = subjectDetail;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lesson=" + lesson +
                ", createdAt=" + createdAt +
                ", updateddAt=" + updateddAt +
                ", enabled=" + enabled +
                ", subjectDetail=" + subjectDetail +
                '}';
    }
}
