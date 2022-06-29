package com.springboot.blog.springbootblogrestapi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDtoV2 {

    private Long id;
    private String title;
    private String description;
    private String content;
    private Set<CommentDto> comments;
    private List<String> tags;
}
