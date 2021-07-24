package ru.internship.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.internship.api.model.User;

public interface UserRepository extends MongoRepository<User,Long> {
}
