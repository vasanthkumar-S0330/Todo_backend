package com.vkumar.demoo.controller;

import com.vkumar.demoo.model.Todomodel;
import com.vkumar.demoo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping
    public List<Todomodel> read(){
        return todoService.read();
    }

    @PostMapping
    public String create(@RequestBody Todomodel todomodel){
        return todoService.create(todomodel);
    }

    @PutMapping("/{id}")
    public String update(@PathVariable String id, @RequestBody Todomodel todomodel){
        return todoService.update(id,todomodel);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        return todoService.delete(id);
    }

}
