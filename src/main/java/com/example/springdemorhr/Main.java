package com.example.springdemorhr;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class Main {
	
	@PostConstruct
	public void main() {
		
		System.out.println("\n\n"+("My first Spring back-end application")+"\n");
		
	}


}
