package io.github.brenovit.userservice;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
	
	private UserRepository repository;
	
	public User save(User entity) {
		entity.setCode(System.currentTimeMillis());
		return repository.save(entity);
	}
	
	public User findById(String id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
	}
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User update(String id, User entity) {
		User findById = findById(id);
		findById.setName(entity.getName());
		return repository.save(findById);
	}
	
	public void delete(String id) {
		repository.deleteById(id);
	}
}
