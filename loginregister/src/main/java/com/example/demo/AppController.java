package com.example.demo;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import com.example.demo.ProductService;
	@Controller
	public class AppController {	
		@Autowired
		private ProductService service; 	
		@RequestMapping("/ChartLine")
	    public String PostForm(@ModelAttribute(value="greeting") Greeting greeting,Model model) {		
				model.addAttribute("greeting", greeting);
				String time = greeting.getTime();
				String date = greeting.getDate();
				System.out.println(time);
				System.out.println(date);
				String date1 = date.replace('-','/');
				List<Object[]> listData = service.listData(time,date1);
				model.addAttribute("listData", listData);
				List<Object[]> listTime = service.listTime(time,date1);
				model.addAttribute("listTime", listTime);		
				return "ChartLine";		
	    }	
	}
