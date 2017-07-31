package test.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.spring.domain.Users;
import test.spring.repository.UsersRepository;
import test.spring.service.AppState;
import test.spring.service.UserGenerator;

import java.sql.Timestamp;
import java.util.List;

@Controller
public class ApplicationController {

    @Autowired
    AppState appState;

    @Autowired
    UsersRepository usersRepository;

    @RequestMapping("/getAppState")
    @ResponseBody
    String getAppState(){
        return String.valueOf(appState.getState());
    }

    @RequestMapping("/getRandUser")
    @ResponseBody
    String getRandUser(){
        UserGenerator userGenerator = new UserGenerator();
        Users users =  userGenerator.generateUser();
        usersRepository.save(users);
        return users.toString();
    }
}
