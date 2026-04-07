package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@SpringBootApplication
@Controller
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/contacto")
	public String contact(Model model) {
		return "contacto";
	}

	@GetMapping("/asir")
	public String asir(Model model) {
		return "asir";
	}

	@GetMapping("/daw")
	public String daw(Model model) {
		return "daw";
	}

	@GetMapping("/smr")
	public String smr(Model model) {
		return "smr";
	}
}
