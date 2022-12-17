package org.example.model;

import java.util.Optional;

public class BaseUser
{
    public int id;
    public String firstName;
    public String lastName;

    public BaseUser()
    {
    }

    public BaseUser(int id, String firstName, String lastName)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Optional<Integer> getId()
    {
        return Optional.ofNullable(id);
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Optional<String> getFirstName()
    {
        return Optional.ofNullable(firstName);
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    @Override
    public String toString()
    {
        return "User{" +
               "id=" + id +
               ", name='" + firstName + '\'' +
               '}';
    }


}
