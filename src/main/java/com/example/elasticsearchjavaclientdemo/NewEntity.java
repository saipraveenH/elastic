package com.example.elasticsearchjavaclientdemo;

import lombok.Data;


public class NewEntity {

    private String id;

    private String name;

    public Position(String id, String name) {
        this.id = id;
        this.name = name;
    }
}