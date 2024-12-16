package com.vkumar.demoo.dal;

import com.vkumar.demoo.model.Todomodel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepo extends MongoRepository<Todomodel,String> {

}
