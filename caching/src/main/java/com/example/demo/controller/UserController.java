package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.demo.constant.UserConstant.USER_INFO_MESSAGE;
import static com.example.demo.constant.UserConstant.USER_INFO_UPDATED_MESSAGE;
import com.example.demo.dto.UserDTO;
import com.example.demo.response.CommonResponse;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/c1/caching")
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<CommonResponse<Integer>> postUserinfo(@RequestBody UserDTO dto){
	Integer userId = userService.addUserInfo(dto);
	return ResponseEntity.status(HttpStatus.CREATED).body(CommonResponse.<Integer>builder().data(userId)
			.isError(false).message(USER_INFO_MESSAGE).build());
	}
	@PutMapping("/update")
	public ResponseEntity<CommonResponse<UserDTO>> updateUserInfo(@RequestBody UserDTO dto){
		UserDTO user = userService.updateUserInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(CommonResponse.<UserDTO>builder().data(user)
				.isError(false).message(USER_INFO_UPDATED_MESSAGE).build());
	}

}
