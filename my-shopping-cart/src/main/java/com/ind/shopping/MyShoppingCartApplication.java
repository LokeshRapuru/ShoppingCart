package com.ind.shopping;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ind.shopping.vaibhav.model.MultiplyNo;

@SpringBootApplication
public class MyShoppingCartApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MyShoppingCartApplication.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Ans = "+MultiplyNo.multiplyOfTwoNumbers(10, 20));
		
	}

}
