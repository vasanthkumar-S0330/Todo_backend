package com.vkumar.demoo.dal;

import com.vkumar.demoo.model.Todomodel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo {
    public List<Todomodel> read();
    public String create(Todomodel todomodel);
    public String update(String id, Todomodel todomodel);
    public String delete(String id);
}
