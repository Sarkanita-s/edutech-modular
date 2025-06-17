package com.edutech.grades.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
// Esto es un comentario para probar GitHub.
@Getter
@Setter
@Entity
@Table(name = "course_quiz")
public class CourseQuiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "course_id", nullable = false)
    private Integer courseId;

    @Size(max = 200)
    @NotNull
    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @Size(max = 800)
    @Column(name = "description", length = 800)
    private String description;

    @Size(max = 50)
    @Column(name = "quiz_type", length = 50)
    private String quizType;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

}