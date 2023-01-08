package com.example.demo.service.impl;

import com.example.demo.service.abstracts.Mapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//A service class to map
@Component
public class MapperService
{
    @Autowired
    private List<Mapper> mappers;


    public List<User> map(List<User> users)
    {
        users.forEach(user -> {
            mappers.forEach(mapper -> mapper.map(user));
        });
        return users;
    }
}
