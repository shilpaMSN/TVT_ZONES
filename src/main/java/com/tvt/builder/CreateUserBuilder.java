package com.tvt.builder;

import com.tvt.dto.CreateUser;

public class CreateUserBuilder {

    public static CreateUser createUserBuilder(){
        CreateUser user=new CreateUser();
        user.setId(3);
        user.setUsername("string");
        user.setFirstName("string");
        user.setLastName("string");
        user.setEmail("string");
        user.setPassword("string");
        user.setPhone("string");
        user.setUserStatus(0); 
        
        return user;
    }
}
