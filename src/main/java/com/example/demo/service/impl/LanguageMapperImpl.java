package com.example.demo.service.impl;


import com.example.demo.model.CountriesAndLanguagesData;
import com.example.demo.model.User;
import com.example.demo.service.abstracts.LanguageMapper;
import org.springframework.stereotype.Component;

@Component
public class LanguageMapperImpl implements LanguageMapper<User>

{

    private User mapLanguage(User user)
    {
        CountriesAndLanguagesData.getLANGUAGES().computeIfPresent(user.getCountry(),
                                                                  (key2, val2) -> {
                                                                      user.setLanguage(val2);
                                                                      return val2;
                                                                  });


        return user;
    }

    @Override
    public User map(User user)
    {
        return mapLanguage(user);
    }

}
