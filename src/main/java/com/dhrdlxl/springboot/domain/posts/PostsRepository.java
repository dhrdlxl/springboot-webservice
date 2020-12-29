package com.dhrdlxl.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//<Entity Class, PK type>
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
