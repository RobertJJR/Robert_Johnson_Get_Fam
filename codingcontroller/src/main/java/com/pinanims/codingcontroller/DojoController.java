package com.pinanims.codingcontroller;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/{path}")
	public String showTitle(@PathVariable ("path") String name) {
		if( name.equals("dojo")) {
			return "The dojo is awesome!";
		}else if (name.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}else if (name.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		return "None of the paths expected were listed.";
	}
}
