
# Product Management System
## Overview
This is a simple Spring Boot application that performs CRUD operations on products. Each product has a unique ID, name, and price. The application uses MySQL as the database and leverages Spring Data JPA for ORM and Spring Web for creating RESTful web services.

## Features
* Add new products
* Retrieve all products
* Retrieve a product by its ID
* Update an existing product
* Delete a product
## Technologies Used
<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>
+
<a href="https://spring.io/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/> </a>
* Spring Boot
* Spring Data JPA
* MySQL
* Spring Boot DevTools
* Maven
* Postman (for API testing)
## Prerequisites
* Java 8 or higher
* Maven 3.6 or higher
* MySQL
* Postman (for API testing)

Setup Instructions
spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update

## Setup Instructions


Update the application.properties file located in src/main/resources with your MySQL database configuration:

```bash
  spring.datasource.url=jdbc:mysql://localhost:3306/productdb
  spring.datasource.username=your-username
  spring.datasource.password=your-password
  spring.jpa.hibernate.ddl-auto=update
```

## Testing the API with Postman
### Install Postman:
Download and install Postman from here.

### Import Endpoints:
Create a new collection in Postman and add the above API endpoints to test them.

### Testing:

To add a product, set the method to POST, the URL and the body to raw JSON.
```bash
    http://localhost:8080/products
```


To retrieve all products, set the method to GET and the URL 
```bash
    http://localhost:8080/products
```
To retrieve a product by ID, set the method to GET and the URL to 
```bash 
    http://localhost:8080/products/{id}
```
To update a product, set the method to PUT, the URL and the body to raw JSON.
```bash
    http://localhost:8080/products
```
To delete a product, set the method to DELETE and the URL to 
```bash
    http://localhost:8080/products/{id}
```

## Project Structure

```bash
src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── productmanagement
│   │               ├── controller
│   │               │   └── ProductController.java
│   │               ├── model
│   │               │   └── Product.java
│   │               ├── repository
│   │               │   └── ProductRepository.java
│   │               └── ProductManagementApplication.java
│   └── resources
│       ├── application.properties
│       └── schema.sql
└── test
    └── java
        └── com
            └── example
                └── productmanagement
                    └── ProductManagementApplicationTests.java

```
    
## API Reference

#### Get all items

```http
  GET /products
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `` | `product` | It returns all the products in JSON |

#### Get item

```http
  GET /products/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to fetch |


#### Add item

```http
  POST /products
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `prodid`      | `int` | **Required**. Id of item to Create |
| `prodname`      | `int` | **Required**. Product Name of item to Create |
| `price`      | `int` | **Required**. Product Price of item to Create |

#### Update item

```http
  PUT /products
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `prodid`      | `int` | **Required**. Id of item to Update |
| `prodname`      | `int` | **Required**. Product Name of item to Update |
| `price`      | `int` | **Required**. Product Price of item to Update |

#### Delete item
```http
  GET /products/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to Delete |


