package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
public class AppController {

    @Autowired
    private ProductService service;

    @RequestMapping("/ChartLine")
    public String ChartLineFormView(Model model){
        model.addAttribute("greeting",new Greeting());
    	return "ChartLine";
	}

	@RequestMapping("/ReqChartLine")
    public String PostForm(@Valid @ModelAttribute(value = "greeting") Greeting greeting, BindingResult result, Model model) {
        model.addAttribute("greeting", greeting);
        String time = greeting.getTime();
        String date = greeting.getDate();
        System.out.println(time);
        System.out.println(date);
        String date1 = date.replace('-', '/');
        List<Object[]> listData = service.listData(time, date1);
        model.addAttribute("listData", listData);
        List<Object[]> listTime = service.listTime(time, date1);
        model.addAttribute("listTime", listTime);
        return "ChartLine";
    }
}
