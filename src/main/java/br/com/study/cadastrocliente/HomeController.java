package br.com.study.cadastrocliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping
	public String home () {
		
		return "Hello Darkness my Old Friend";
	} 
	
}
