package org.axpen.restapi.models;

import java.util.Objects;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import lombok.*;


@Entity
@Table(name="users")
@Data
public class User {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message="\'_Name is required.")
    @Size(min=2, message="\'_At least 2 characters in name.")
    private String name;

    @NotEmpty(message="\'_Age is required.")
    private Integer age;

    @NotEmpty(message="\'_Email is required.")
    @Email(message="\'_Email should be valid")
    @Column(unique=true)
    private String email;

}
