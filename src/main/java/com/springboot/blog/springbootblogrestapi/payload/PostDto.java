package com.springboot.blog.springbootblogrestapi.payload;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Data
public class PostDto {

    private Long id;
    // title should not be null or empty and at least 2 characters
    @NotEmpty
    @Min(value = 2, message = "Post title should have at least 2 characters")
    private String title;
    // should not be null or empty and at least 10 characters
    @NotEmpty
    @Min(value = 2, message = "Description  should have at least 10 characters")
    private String description;
    // should not have null or empty
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}
