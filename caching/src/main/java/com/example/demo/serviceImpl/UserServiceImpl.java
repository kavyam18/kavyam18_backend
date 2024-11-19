package com.example.demo.serviceImpl;

import  static com.example.demo.constant.UserConstant.USER_EMAIL_NOT_FOUND;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.exception.UserEmailNotFoundException;
import com.example.demo.exception.UserExistenceException;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.util.UserUtil;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Integer addUserInfo(UserDTO dto) {
	   User user = UserUtil.dtoToEntity(dto);
	   if(!userRepository.findByEmail(dto.getEmail()).isPresent()) 
	   {
		   user = userRepository.save(user);
		   return user.getId();
	   }
		   throw new UserExistenceException("Email already exists:" + dto.getEmail());
   }

	@Override
	public UserDTO updateUserInfo(UserDTO dto) {
		Optional<User> optional = userRepository.findByEmail(dto.getEmail());
		 if (optional.isPresent()) {
	        User existingUser = optional.get();
	        existingUser.setName(dto.getName());
	        existingUser.setEmail(dto.getEmail());
	       
	        User updatedUser = userRepository.save(existingUser);
	        return UserUtil.UserEntityToDto(updatedUser);
	    }
		 throw new UserEmailNotFoundException(USER_EMAIL_NOT_FOUND);
	}
	
}
