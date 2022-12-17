package org.example;



import org.example.service.impl.MapperService;
import org.example.model.User;
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
        //System.out.println(Arrays.toString(userList.toArray()));
        //System.out.println(Arrays.deepToString(userList.toArray()));
        printList(userList);

    }

    public void printList(List<User> list){
        for(User elem : list){
            System.out.println(elem+"  ");
        }
    }


}
