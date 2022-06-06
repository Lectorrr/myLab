package com.example.mylabproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * index页面
 * @author Hsuehsh
 *
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index", method = {RequestMethod.GET})
    public String index() {
        return "index";
    }
}