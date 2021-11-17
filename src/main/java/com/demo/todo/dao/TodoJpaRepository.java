package com.demo.todo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.todo.entity.Todo;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long>{
	List<Todo> findByUsername(String username);
}
