package com.training.user.model;

import java.util.List;


public class ResponseDto {
	
	private User user;
	private List<Labourer> labourer;
	
	//public ResponseDto () {}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Labourer> getLabourer() {
		return labourer;
	}

	public void setLabourer(List<Labourer> labourer) {
		this.labourer = labourer;
	}
	
	
}
