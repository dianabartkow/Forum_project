package org.example.repository;

import org.example.entity.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository  extends CrudRepository<Comment,Long> {
}
