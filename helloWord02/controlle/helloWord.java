package br.org.generation.helloWord02.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") 
public class helloWord {

	
		@GetMapping 
		public String hello() {
			return "hello Word! hello Spring!";
			
		}

}
