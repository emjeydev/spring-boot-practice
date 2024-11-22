package dev.emjey.grade_submission.entity;

import dev.emjey.grade_submission.validation.Score;
import jakarta.persistence.*;
import lombok.*;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring Security JWT
 * FileName: Grade.java
 * Date: 2024/11/22
 * Modified Date: 2024/11/22
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "grade", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"student_id", "course_id"})
})
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Score
    @Column(name = "score", nullable = false)
    private String score;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    @ManyToOne(optional = false)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;

}
