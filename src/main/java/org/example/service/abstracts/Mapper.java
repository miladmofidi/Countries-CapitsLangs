package org.example.service.abstracts;


import org.example.model.BaseUser;
import org.example.model.User;

public interface Mapper<U extends BaseUser>
{
    User map(User user);

}
