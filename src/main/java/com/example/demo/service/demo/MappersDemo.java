package com.example.demo.service.demo;


import com.example.demo.model.User;
import com.example.demo.service.impl.MapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MappersDemo implements CommandLineRunner
{

    @Autowired
    private MapperService mapperService;

    private static List<User> userList = UsersDataInitializer.userList;


    @Override
    public void run(String... args) throws Exception
    {
        mapperService.map(userList);
        printList(userList);
    }

    public void printList(List<User> list)
    {
        System.out.println("**********************************************************************************************************************************************" +
                           "\n" +"Founded Capitals & Languages Per Each User: " );
        for (User elem : list)
        {
            System.out.println(elem + "  ");
        }
        System.out.println("**********************************************************************************************************************************************");
    }
}
