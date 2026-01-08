package com.ibm.spring_boot_rest_api_crud_operation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.spring_boot_rest_api_crud_operation.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
