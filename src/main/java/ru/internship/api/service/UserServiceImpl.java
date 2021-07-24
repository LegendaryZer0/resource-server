package ru.internship.api.service;

import org.springframework.stereotype.Service;
import ru.internship.api.model.UserDto;
import ru.internship.api.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    UserRepository userRepository;
    public void saveUser(UserDto userDto){
        userRepository.save(userDto.getUser());
    }

    public List<UserDto> getAllUsers(){
        return UserDto.from(userRepository.findAll());
    }
}
