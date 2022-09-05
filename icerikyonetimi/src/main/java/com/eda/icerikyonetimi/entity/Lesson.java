package com.eda.icerikyonetimi.entity;

import javax.persistence.*;
import com.eda.icerikyonetimi.entity.Subject;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tbl_lesson")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    private LocalDateTime createdAt;

    private LocalDateTime updateddAt;

    private boolean enabled;

    @OneToMany(mappedBy = "lesson", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    List<Subject> subjects;

    public Lesson() {
    }

    public Lesson(String name, String description, LocalDateTime createdAt, LocalDateTime updateddAt, boolean enabled) {
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updateddAt=" + updateddAt +
                ", enabled=" + enabled +
                ", subjects=" + subjects +
                '}';
    }
}
