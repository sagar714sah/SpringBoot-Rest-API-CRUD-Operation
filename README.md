# SpringBoot-Rest-API-CRUD-Operation

Spring Boot REST API – CRUD with Validation & MySQL

This project is a Spring Boot RESTful CRUD application that demonstrates how to build APIs using Spring Boot, Spring Data JPA, MySQL, Validation, and Spring Security.
It supports basic Create, Read, Update, and Delete (CRUD) operations with proper request validation.

🚀 Features

RESTful APIs using Spring Boot

CRUD operations for Employee entity

Request validation using @Valid and validation annotations

MySQL database integration using Spring Data JPA

Layered architecture (Controller, DAO, Repository, Entity, DTO)

Spring Security configuration

Exception-safe request handling

Maven-based project

🛠 Tech Stack

Java

Spring Boot

Spring Data JPA

Spring Validation

Spring Security

MySQL

Maven

Hibernate
================================================================================================================

🧩 API Functionality
Employee APIs

Create Employee

Get All Employees

Get Employee By ID

Update Employee

Delete Employee

All request bodies are validated using Bean Validation annotations.
================================================================================================================
✅ Validation

Validation is implemented using:

@NotNull

@NotBlank

@Email

@Size

@Valid

Validation logic is handled via a DTO (EmployeeRequest) to keep entity clean.
==================================================================================================================
🔐 Security

Spring Security is configured using SpringWebSecurity

Basic security configuration for API access

Can be extended for JWT or role-based authorization
