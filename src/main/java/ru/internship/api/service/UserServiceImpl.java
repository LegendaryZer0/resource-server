package ru.internship.api.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.internship.api.model.User;
import ru.internship.api.model.UserDto;
import ru.internship.api.repository.UserRepository;

import java.util.List;
@Slf4j
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    public void saveUser(UserDto userDto){
        log.info(userDto.toString());
        log.info("user to save {}",userDto.convertToUser());

        userRepository.save(userDto.convertToUser());
    }

    public List<UserDto> getAllUsers(){
        List<User> usersList = userRepository.findAll();
        log.info("userlist testing {}",usersList);
        return UserDto.from(usersList);
    }
}
