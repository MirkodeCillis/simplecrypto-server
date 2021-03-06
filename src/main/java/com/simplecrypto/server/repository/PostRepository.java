package com.simplecrypto.server.repository;

import com.simplecrypto.server.domains.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {

    @Query(value = "select distinct p from Post p")
    Page<Post> findAll(Pageable pageable);


}
