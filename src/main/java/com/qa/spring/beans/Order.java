package com.qa.spring.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Order {

	private int id;
	private int customerId;
	private float orderValue;
	private String orderDate;
	
	
	public void init() {
		System.out.println("initialize order bean...");
	}
	
	public void del() {
		System.out.println("destroy order bean...");
	}
	
}
