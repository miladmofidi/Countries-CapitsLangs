package com.example.demo.service.impl;


import com.example.demo.service.abstracts.CityMapper;
import com.example.demo.model.CountriesAndLanguagesData;
import com.example.demo.model.User;
import org.springframework.stereotype.Component;

@Component
public class CityMapperImpl implements CityMapper<User>
{

 /*   @Override
    public User map(User user)
    {
        return mapCity(user);
    }*/

    private User mapCity(User user)
    {
        CountriesAndLanguagesData.getCOUNTRIES().computeIfPresent(user.getCountry(),
                                                                  (cityKey, cityValue) -> {
                                                                      user.setCity(cityValue);
                                                                      return cityValue;
                                                                  }
        );
        return user;
    }


    @Override
    public String toString()
    {
        return "SemanticCheckWithoutBean1{}";
    }

    @Override
    public User map(User user)
    {
        return mapCity(user);
    }
}
