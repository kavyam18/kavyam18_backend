package com.example.demo.service;

import com.example.demo.dto.UserDTO;

public interface UserService {

	Integer addUserInfo(UserDTO dto);

	UserDTO updateUserInfo(UserDTO dto);

}
