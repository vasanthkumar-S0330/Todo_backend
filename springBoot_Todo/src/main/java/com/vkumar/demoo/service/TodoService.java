package com.vkumar.demoo.service;

import com.vkumar.demoo.dal.TodoRepo;
import com.vkumar.demoo.model.Todomodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoRepo todoRepo;

    public List<Todomodel> read(){
        return todoRepo.read();
    }

    public String create(Todomodel todomodel){
        return todoRepo.create(todomodel);
    }

    public String update(String id, Todomodel todomodel){
        return todoRepo.update(id,todomodel);
    }

    public String delete(String id){
        return todoRepo.delete(id);
    }
}
