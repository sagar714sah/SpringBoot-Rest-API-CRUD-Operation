package com.ibm.spring_boot_rest_api_crud_operation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	private int id;
	private String name;
	private String color;
	private double price;

}
