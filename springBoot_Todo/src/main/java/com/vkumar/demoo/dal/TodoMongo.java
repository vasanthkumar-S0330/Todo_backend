package com.vkumar.demoo.dal;

import com.vkumar.demoo.model.Todomodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TodoMongo implements TodoRepo{
    @Autowired
    MongoRepo mongoRepo;

    @Override
    public List<Todomodel> read(){
        return mongoRepo.findAll();
    }
    @Override
    public String create(Todomodel todomodel){
         mongoRepo.save(todomodel);
         return "Created Successfully";
    }
    @Override
    public String update(String id, Todomodel todomodel){
        Todomodel oldid = mongoRepo.findById(id).get();
        oldid.setTitle(todomodel.getTitle());
        oldid.setDescription(todomodel.getDescription());
        mongoRepo.save(oldid);
        return "Update Success";
    }
    @Override
    public String delete(String id){
        mongoRepo.deleteById(id);
        return "Deleted Successfully";
    }
}
