package com.example.elasticsearchjavaclientdemo;

import lombok.Data;


public class NewEntity {

    private String id;

    private String name;

    public NewEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }
}