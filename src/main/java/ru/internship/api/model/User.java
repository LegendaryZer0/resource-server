package ru.internship.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(collection = "Employee")
public class User {
    @Field
    private String name;
    @Field
    private String surname;
    @Field
    private Integer age;
    @Id
    private Long id;
}
