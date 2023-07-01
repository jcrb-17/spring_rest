package com.java11.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java11.rest.models.Property;
import com.java11.rest.repositories.PropertyRepository;

@Service
public class PropertyService {
    @Autowired
    PropertyRepository repo;

    public void add(Property property){
        repo.save(property);
    }

    public List<Property> getAll(){
        return repo.findAll();
    }

    public Optional<Property> findById(String id){
        return repo.findById(id);
    }

    public void remove(String id){
        repo.deleteById(id);
    }

    public void update(String id,Property property){
        try{
            Property p = repo.findById(id).get();

            p.setCity(property.getCity());
            p.setImageUrl(property.getImageUrl());
            p.setPrice(property.getPrice());
            p.setRent(property.getRent());
            p.setSell(property.getSell());
            p.setType(property.getType());            
            p.setId(id);
            repo.save(p);
        }
        catch(Exception e){
            //Id is null
            return;
        }
    }
}
