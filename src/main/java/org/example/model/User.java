package org.example.model;

public class User extends BaseUser
{
    private String country;
    private String language;
    private String city;

    public User()
    {
    }

    public User(int id, String firstName, String lastName, String country)
    {
        super(id, firstName, lastName);
        this.country = country;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }


    public String getLanguage()
    {
        return language;
    }

    public void setLanguage(String language)
    {
        this.language = language;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "User{" +
               "country='" + country + '\'' +
               ", language='" + language + '\'' +
               ", city='" + city + '\'' +
               ", id=" + id +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               '}';
    }
}
