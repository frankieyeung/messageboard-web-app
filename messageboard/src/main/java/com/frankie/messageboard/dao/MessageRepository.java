package com.frankie.messageboard.dao;

import com.frankie.messageboard.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="message")
public interface MessageRepository extends JpaRepository<Message, Integer> {
}
