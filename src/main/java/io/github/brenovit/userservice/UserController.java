package io.github.brenovit.userservice;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
	
	private UserService service;
	
	@PostMapping("")
	public ResponseEntity<User> save(@RequestBody User entity){
		return ResponseEntity.ok(service.save(entity));
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<User> upate(@PathVariable("id") String id, @RequestBody User entity){
		return ResponseEntity.ok(service.update(id, entity));
	}
	
	@GetMapping("")
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable("id") String id){
		return ResponseEntity.ok(service.findById(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") String id){
		service.delete(id);
		return ResponseEntity.ok("Course deleted");
	}
}
