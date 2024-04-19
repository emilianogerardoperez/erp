package com.ectechsoftware.erp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
			
		@GetMapping("/login")
		public String Login () {
			return "login";
		}
		
		@GetMapping("/home")
		public String home () {
			return "home";
		}
}
