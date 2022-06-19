package com.example.springbootrestapipostgres.repository;

import com.example.springbootrestapipostgres.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
