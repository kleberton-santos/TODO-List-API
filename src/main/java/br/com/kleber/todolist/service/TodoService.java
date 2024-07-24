package br.com.kleber.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.com.kleber.todolist.entity.Todo;
import br.com.kleber.todolist.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepository;

	public List<Todo> create(Todo todo){
		todoRepository.save(todo);
		return list();
	}
	public List<Todo> list() {
	    Sort sort = Sort.by(Direction.DESC, "prioridade")
	        .and(Sort.by(Direction.ASC, "id"));

	    return todoRepository.findAll(sort);
	  }
	public List<Todo> update(Todo todo){
		todoRepository.save(todo);
		return list();
	}
	public List<Todo> delete(Long id){
		todoRepository.deleteById(id);
		return list();
	}
}
