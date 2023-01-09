package com.training.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.training.user.model.Labourer;
import com.training.user.model.ResponseDto;
import com.training.user.model.User;
import com.training.user.repository.userInterface;


@Service
public class UserService {

	@Autowired
	private userInterface userinterface;
	
	@Autowired
	private ResponseDto responseDto;

	@Autowired
	private RestTemplate restTemplate;

	public User registerUser(User user) {
		return userinterface.save(user);
	}

	public List<User> getusers() {
		return userinterface.findAll();
	}

	public User getUsersById(int userId) {
		return userinterface.findById(userId).orElse(null);
	}

	public User updateUser(User user) {
		Optional<User> updateUser = userinterface.findById(user.getId());

		if (updateUser.isPresent()) {
			user.setId(user.getId());
			user.setAdharNo(user.getAdharNo());
			user.setLocation(user.getLocation());
			user.setMobNo(user.getMobNo());
			user.setName(user.getName());
		} else
			new User();
		return null;
	}

	public String deleteSUerById(int id) {
		userinterface.deleteById(id);
		return "user deleted";
	}

	public ResponseDto getLabourersById(int id) {
		
		User repo=userinterface.findById(id).get();
		
		//RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List> responseEntity = restTemplate
				.getForEntity("http://localhost:8081/api/GetByLocation/"+repo.getLocation(), List.class);

		List<Labourer> labor =responseEntity.getBody();
		
		/*ObjectMapper mapper = new ObjectMapper();
		List<Labourer> accountList = mapper.convertValue(
		responseEntity.getBody(),
        new TypeReference<List<Labourer>>(){}
		);*/
		//ResponseDto responseDto = new ResponseDto();
		responseDto.setUser(repo);
        responseDto.setLabourer(labor);
		return responseDto;

	}}

