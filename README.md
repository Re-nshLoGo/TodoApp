# Todo Application
### Requirments
 * IntelliJIDEA
 * Serverport: 8080 (use: localhost:8080)
 * Java version: 17
 * H2 Databse
 * Everything is present in the pom.xml (no need to download any library)
 ### Steps to run program
 * Download the source code and import in intellijIDEA.
 * Go to localhost:8080/ 
 * Type endpoints in url or
 * You Can also Use Swagger 
 
### 1- Todo model has -
  * Id
  * Title
  * status
  * Date

### application.properties file have - 

        springdoc.swagger-ui.path=/swagger
        spring.datasource.url=jdbc:h2:mem:doc_data
        spring.datasource.driverClassName=org.h2.Driver
        spring.datasource.username=sa
        spring.datasource.password=
        spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
        spring.h2.console.enabled = true
        spring.jpa.defer-datasource-initialization=true
        spring.jpa.show-sql=true
        spring.jpa.properties.hibernate.format-sql=true
 
 


