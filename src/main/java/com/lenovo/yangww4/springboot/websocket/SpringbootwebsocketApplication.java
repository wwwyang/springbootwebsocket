package com.lenovo.yangww4.springboot.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class SpringbootwebsocketApplication {

	@RequestMapping("/iven")
	public String index(Model model) {
		return "iven";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwebsocketApplication.class, args);
	}
}
