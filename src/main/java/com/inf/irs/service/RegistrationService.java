package com.inf.irs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inf.irs.entity.UserEntity;
import com.inf.irs.exception.UserIdAlreadyPresentException;
import com.inf.irs.model.User;
import com.inf.irs.repository.UserRepository;
@Service
public class RegistrationService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void registerUser(User user) throws UserIdAlreadyPresentException{
        boolean ue = userRepository.existsById(user.getUserId());
        if(ue)
           throw new UserIdAlreadyPresentException("RegistrationService.USERID_PRESENT");
		UserEntity userEntity = new UserEntity();
		userEntity.setCity(user.getCity());
		userEntity.setEmail(user.getEmail());
		userEntity.setName(user.getName());
		userEntity.setPassword(user.getPassword());
		userEntity.setPhone(user.getPhone());
		userEntity.setUserId(user.getUserId());
		userRepository.saveAndFlush(userEntity);		
	}
}