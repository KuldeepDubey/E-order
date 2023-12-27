package com.kuldeep_dubey.springboot.firstrestapi.helloWorld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class helloworldresource {

	@RequestMapping("/hello-world")
	
	public String helloWorld(){
		
		return "Hello World";
	}
	
	
	@RequestMapping("/hello-world-path-param/{name}/message/{message}")
	public HelloWorldBean helloWorldbean(@PathVariable String name,
			@PathVariable String message){
		
		return new HelloWorldBean("Hello World ,"+ name+" , "+ message);
	}
	
}
