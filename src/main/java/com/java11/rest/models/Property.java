package com.java11.rest.models;

import javax.annotation.Generated;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "properties")
public class Property {

    @Id
    @Generated("id")
    private String id;
    private String type;
    private String city;
    private long price;    
    private boolean rent;
    private boolean sell;
    private String imageUrl;


    public Property(){}


    public Property(String id, String type, String city, long price, boolean rent, boolean sell, String imageUrl) {
        this.id = id;
        this.type = type;
        this.city = city;
        this.price = price;
        this.rent = rent;
        this.sell = sell;
        this.imageUrl = imageUrl;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPrice() {
        return this.price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public boolean isRent() {
        return this.rent;
    }

    public boolean getRent() {
        return this.rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public boolean isSell() {
        return this.sell;
    }

    public boolean getSell() {
        return this.sell;
    }

    public void setSell(boolean sell) {
        this.sell = sell;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}
