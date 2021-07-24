package ru.internship.api.service;

import ru.internship.api.model.UserDto;

import java.util.List;

public interface UserService {
    public void saveUser(UserDto userDto);
    public List<UserDto> getAllUsers();
}
