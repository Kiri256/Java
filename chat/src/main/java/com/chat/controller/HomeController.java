package com.chat.controller;

import com.chat.dao.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    private List<Message> messageList= Collections.synchronizedList(new ArrayList<>());

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute(messageList);
        return "home";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String get(String name,String talks){
        messageList.add(new Message(name,talks));
        return "redirect:/";
    }
}
