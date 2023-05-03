package com.example.demo.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Book")
public class Book{
	
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String author;
	private long price;
	}

