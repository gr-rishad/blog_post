package com.springboot.blog.springbootblogrestapi.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {

    private Long id;
    // name should not be null or empty
    @NotEmpty(message = "Name Should not be Null or Empty")
    private String name;
    // should not null or empty
    // email field validation
    @NotEmpty(message = "Email Should not be Null or Empty")
    @Email
    private String email;
    // comment body should not be null or empty
    // comment body must be maintain 10 characters
    @NotEmpty(message = "Comment body must not be Null")
    @Size(min = 10,message = "Comment body must be minimum 10 characters")
    private String body;
}
