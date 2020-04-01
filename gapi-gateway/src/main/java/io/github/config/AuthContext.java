package io.github.config;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthContext {
	private String email;
	private String password;
	//TODO: other auth related information
}