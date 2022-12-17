package org.example.service.abstracts;


import org.example.model.BaseUser;
import org.example.model.User;

public interface CityMapper<U extends BaseUser> extends Mapper<User>
{
    User map(User user);
}
