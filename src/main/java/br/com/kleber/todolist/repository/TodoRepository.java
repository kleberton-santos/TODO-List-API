package br.com.kleber.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kleber.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
