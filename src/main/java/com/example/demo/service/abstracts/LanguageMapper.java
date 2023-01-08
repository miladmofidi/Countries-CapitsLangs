package com.example.demo.service.abstracts;


import com.example.demo.model.BaseUser;
import com.example.demo.model.User;

public interface LanguageMapper<U extends BaseUser> extends Mapper<User>
{
    User map(User user);
}
