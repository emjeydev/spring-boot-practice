package dev.emjey.grade_submission.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * This file is made by EmJey
 * Project: GradeSubmission - Spring Security JWT
 * FileName: User.java
 * Date: 2024/11/22
 * Modified Date: 2024/11/22
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


@Entity
@Table(name = "users")
/*
 * 'user' is a reserved keyword in SQL, so we name our table users. If you name it user, you will get a org.h2.jdbc.JdbcSQLSyntaxErrorException. 
 *  See https://docs.microsoft.com/en-us/sql/t-sql/language-elements/reserved-keywords-transact-sql?view=sql-server-ver16 for a list of reserved keywords.
 */ 
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class User {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message =  "username cannot be blank")
	@NonNull
	@Column(nullable = false, unique = true)
	private String username;

	@NotBlank(message =  "password cannot be blank")
    @NonNull
	@Column(nullable = false)
	private String password;

}