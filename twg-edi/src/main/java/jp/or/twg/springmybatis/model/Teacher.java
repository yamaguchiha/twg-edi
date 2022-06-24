package jp.or.twg.springmybatis.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Teacher {

	@Id
	private Long id;

	// Validate
	@NotBlank
	@Size(max = 60)
	private String userName;

	// Validate
	@NotBlank
	@Email
	@Size(max = 254)
	private String email;

}
