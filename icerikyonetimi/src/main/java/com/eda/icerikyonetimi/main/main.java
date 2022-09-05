package com.eda.icerikyonetimi.main;

import com.eda.icerikyonetimi.service.UserService;

import static com.eda.icerikyonetimi.main.ImplData.*;

public class main {

static UserService userService;
    public static void main(String[] args) {
        loadDatabase();
        userService=new UserService();

        System.out.println(  userService.enCokIcerikUreten().get().getName());

    }
}
