package com.mango.webservice.web;

import com.mango.webservice.domain.post.PostRepository;
import com.mango.webservice.dto.post.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("posts")
@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostRepository postRepository;

    @PostMapping
    public void savePosts(@RequestBody PostDto.Create dto) {
        postRepository.save(dto.toEntity());
    }
}
