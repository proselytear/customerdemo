Sample ofREST application

REST application that provides REST API.

Run CustomerService locally

Databse configuration

1. Create database customerdemo
Predefined username - root
Predefined password - pass

Change in properties if required

spring.datasource.initialize=true
spring.datasource.schema=classpath*:database/initDB.sql
spring.datasource.data=classpath*:database/populateDB.sql

spring.datasource.url=jdbc:mysql://localhost:3306/customerdemo - database name
spring.datasource.username=root - username
spring.datasource.password=pass - password
spring.datasource.driver-class-name=com.mysql.jdbc.Driver - driver
spring.jpa.database=mysql - database type
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect - dialect


2. git clone https://github.com/proselytear/customerdemo
3. cd customerdemo
4. mvn spring-boot:run

5. Access CustomerService using next REST requests:

GET: localhost:9966/api/v1/customers/ - get all customers
GET: localhost:9966/api/v1/customers/1 - get customer with ID 1

POST: localhost:9966/api/v1/customers/
Request body:
{
	"firstName": "Kolya",
	"lastName": "Nikolaev",
	"address": "Test address",
	"budget": "100500"
}

PUT: localhost:9966/api/v1/customers/
Request body:
{
    "id": 2,
	"firstName": "Kolya",
	"lastName": "Nikolaev",
	"address": "Test address",
	"budget": "200800"
}


DELETE: localhost:9966/api/v1/customers/2 - delete customer with ID 2