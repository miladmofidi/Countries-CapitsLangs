package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseUser
{
    private String country;
    private String language;
    private String city;


    public User(int id,String firstName, String lastName, String country)
    {
        super.id=id;
        super.firstName=firstName;
        super.lastName=lastName;
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "User(" +
               "id=" + id +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", country='" + country + '\'' +
               ", language='" + language + '\'' +
               ", city='" + city + '\'' +
               ')';
    }
}
