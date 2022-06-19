package com.example.springbootrestapipostgres.repository;

import com.example.springbootrestapipostgres.model.Book;
import com.example.springbootrestapipostgres.model.Lend;
import com.example.springbootrestapipostgres.model.LendStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LendRepository extends JpaRepository<Lend, Long> {

    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}
