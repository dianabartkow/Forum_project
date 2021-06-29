package org.example.controller;

import org.example.entity.Post;
import org.example.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PostRepository postRepository;

    @RequestMapping(value = "/")
    public String getAllPosts(Model model) {
        List<Post> posts = (List<Post>) postRepository.findAll();
        model.addAttribute("listPosts",posts);
        return "home";
    }


}

