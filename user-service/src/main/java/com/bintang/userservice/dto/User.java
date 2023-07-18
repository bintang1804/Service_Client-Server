package com.bintang.userservice.dto;

import com.bintang.userservice.service.UserServiceImpl;

public class User {

    private String id;
    private String name;
    private String address;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
