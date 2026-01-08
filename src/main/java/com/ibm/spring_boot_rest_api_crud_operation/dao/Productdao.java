package com.ibm.spring_boot_rest_api_crud_operation.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.spring_boot_rest_api_crud_operation.Repository.ProductRepository;
import com.ibm.spring_boot_rest_api_crud_operation.entity.Product;

@Repository
public class Productdao {

	@Autowired
	  ProductRepository productRepository;
	
	public  Product saveProduct(Product product) {
		
	
		return productRepository.save(product);
				
	}
//==================================================================================================
	
	public List<Product> saveMultipleProduct(List<Product> products){
		return productRepository.saveAll(products);
	}
//==================================================================================================
	
	public  Product getProductById(Integer id ) {
		
		Optional<Product> optional= productRepository.findById(id);
		
		if(optional.isPresent()) {
			return optional.get();
			
		}else {
			return null;
		}
	}
	//================================================================================================
	public  List<Product> getAllProducts(){
		return productRepository.findAll();
		
	}
	
	
}
