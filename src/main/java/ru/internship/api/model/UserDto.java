package ru.internship.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private String name;
    private String surname;
    private Integer age;
    private Long id;

    public static UserDto from(User user) {
        return UserDto.builder().id(user.getId()).age(user.getAge()).name(user.getName()).surname(user.getSurname()).build();
    }

    public static List<UserDto> from(List<User> users){
        return users.stream().map(UserDto::from).collect(Collectors.toList());
    }

    public User getUser() {
        return User.builder().age(age).surname(surname).name(name).build();
    }
}
