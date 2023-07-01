package com.java11.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java11.rest.models.Property;
import com.java11.rest.services.PropertyService;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    private PropertyService service;

    /** 
     * @return List<Property>
     */
    @GetMapping
    public List<Property> get(){
        return this.service.getAll();
    }

    /** 
     * @param id
     * @return Optional<Property>
     */
    @GetMapping("/{id}")
    public Optional<Property> getById(@PathVariable String id){
        return this.service.findById(id);
    }

    
    /** 
     * @param property
     */
    @PostMapping
    public void add(@RequestBody Property property){
        this.service.add(property);
    }

    
    /** 
     * @param id
     */
    @DeleteMapping("/{id}")
    public void remove(@PathVariable String id){
        this.service.remove(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable String id,@RequestBody Property property){
        this.service.update(id,property);
    }
}
