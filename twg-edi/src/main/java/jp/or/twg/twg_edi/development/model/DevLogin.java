package jp.or.twg.twg_edi.development.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DevLogin {

	// Validate
	@NotBlank
	@Size(max = 32)
	private String userId;

	// Validate
	@NotBlank
	@Size(max = 32)
	private String userPasswd;

	// Validate
	@NotBlank
	@Size(max = 10)
	private String partyId;

	// Validate
	@NotBlank
	@Size(max = 5)
	private String placeId;

}
