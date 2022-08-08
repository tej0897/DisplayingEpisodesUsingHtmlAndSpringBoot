package com.tejLearning.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowController {

    @GetMapping("/")
    public String getShows(){
        return "shows";
    }

}
