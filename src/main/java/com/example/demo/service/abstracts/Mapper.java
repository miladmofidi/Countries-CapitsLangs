package com.example.demo.service.abstracts;


import com.example.demo.model.BaseUser;
import com.example.demo.model.User;

public interface Mapper<U extends BaseUser>
{
    User map(User user);

}
