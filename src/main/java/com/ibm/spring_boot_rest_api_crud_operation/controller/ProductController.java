package com.ibm.spring_boot_rest_api_crud_operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.spring_boot_rest_api_crud_operation.dao.Productdao;
import com.ibm.spring_boot_rest_api_crud_operation.entity.Product;

@RequestMapping(value= "/product")
@RestController
@CrossOrigin(origins="https://localhost:4200")
public class ProductController {
	
	  @Autowired
      Productdao productdao;
	 
	
	@GetMapping("/getProductDetails")
	public String getProductDetails() {
		return "my product details";
	}
	
	@PostMapping(value="/saveProduct")
	public Product saveProductController(@RequestBody Product product) {
		
        System.out.println("product Saved Successfully: "+product);
		return productdao.saveProduct(product);
			
	}
	
	@GetMapping(value="/getProductById/{id}")
	public Product getProductById(@PathVariable Integer id) {
		return productdao.getProductById(id);
	}
	
	@GetMapping(value ="/getAllProducts")
	public List<Product> getAllproducts(){
		return productdao.getAllProducts();
	}
	
	@PostMapping(value ="/saveMultipleProducts")
	public List<Product> saveMultipleproducts(@RequestBody List<Product> products){
		return productdao.saveMultipleProduct(products);
	}

}
