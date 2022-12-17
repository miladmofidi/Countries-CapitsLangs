package org.example;


import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UsersDataInitializer
{
    public static List<User> userList =  initUsers();

    private static List<User> initUsers()
    {
        List<User> userList = new ArrayList<>();
        User user1 = new User(1, "Jack","Hamilton","usa");
        User user2 = new User(2, "Ali","Kiani","iran");
        User user3 = new User(2, "Mehmet","Nandoni","turkey");
        User user4 = new User(2, "Muyang","Nakumorro","china");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return userList;
    }
}
