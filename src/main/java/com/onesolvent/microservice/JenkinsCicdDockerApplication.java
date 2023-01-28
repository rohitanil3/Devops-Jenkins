package com.onesolvent.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsCicdDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsCicdDockerApplication.class, args);
	}
	
	@GetMapping("/get")
	public String get() {
		return "CI-CD by GITHUB";
	}

	
//	echo "# Devops-Jenkins" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/rohitanil3/Devops-Jenkins.git
//	git push -u origin main
}
