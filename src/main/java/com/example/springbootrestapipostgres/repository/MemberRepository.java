package com.example.springbootrestapipostgres.repository;

import com.example.springbootrestapipostgres.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
