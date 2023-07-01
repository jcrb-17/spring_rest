package com.java11.rest.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.java11.rest.models.Property;

public interface PropertyRepository extends MongoRepository<Property, String>{
    
}
