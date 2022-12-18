package org.example.service.impl;


import org.example.service.abstracts.LanguageMapper;
import org.example.model.CountriesAndLanguagesData;
import org.example.model.User;
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
