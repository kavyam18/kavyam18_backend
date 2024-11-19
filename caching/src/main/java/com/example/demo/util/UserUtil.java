package com.example.demo.util;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;

public class UserUtil {

	public UserUtil() {

	}

	public static User dtoToEntity(UserDTO dto) {
		User user = new User();
		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		return user;
	}

	public static UserDTO UserEntityToDto(User user) {
		return UserDTO.builder().id(user.getId()).name(user.getName()).email(user.getEmail()).build();
	}
}
