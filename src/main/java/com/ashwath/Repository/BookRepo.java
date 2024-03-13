package com.ashwath.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ashwath.entity.Book;

@RepositoryRestResource(path = "books")
public interface BookRepo extends JpaRepository<Book, Integer> {
	public List<Book> findByName(@Param("name") String name);
}
