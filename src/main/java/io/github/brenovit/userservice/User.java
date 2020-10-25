package io.github.brenovit.userservice;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class User {
	
	@Id	
	private String id;
	private Long code;
	private String name;
}
