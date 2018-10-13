package com.mango.webservice.dto.post;

import com.mango.webservice.domain.post.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class PostDto {

    @Getter
    @Setter
    @NoArgsConstructor
    public static class Create {

        private String title;
        private String content;
        private String author;

        public Post toEntity() {

            return Post.builder()
                    .title(title)
                    .content(content)
                    .author(author)
                    .build();
        }
    }
}
