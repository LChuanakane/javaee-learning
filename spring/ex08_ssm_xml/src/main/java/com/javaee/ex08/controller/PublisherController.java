package com.javaee.ex08.controller;

import com.javaee.ex08.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/publisher")
public class PublisherController {
    @Autowired
    private PublisherService publisherService;

    @RequestMapping("/find_publisher")
    public String findPublisher(Model model){
        model.addAttribute("publishers", publisherService.findPublishers());
        return "publisher/publisher_list";
    }

    @RequestMapping("/find_by_name")
    public String findByName(@RequestParam("name") String name, Model model){
            model.addAttribute("publishers", publisherService.findByName(name));
        return "publisher/publisher_list";
    }

    @RequestMapping("/find_by_contacter")
    public String findByContacter(@RequestParam("contacter") String contacter, Model model){
        model.addAttribute("publishers", publisherService.findByContacter(contacter));
        return "publisher/publisher_list";
    }
}
