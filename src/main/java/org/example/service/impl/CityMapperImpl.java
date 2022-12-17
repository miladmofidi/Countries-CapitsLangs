package org.example.service.impl;


import org.example.service.abstracts.CityMapper;
import org.example.model.CountriesAndLanguagesData;
import org.example.model.User;
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
