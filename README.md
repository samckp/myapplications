# Springboot REST Api with JPA, MySQL/H2 Database 

1. SpringBoot REST Api
2. JPA with MySQL and H2 Database
3. Rest API Data validation
4. Swagger url : http://localhost:8080/swagger-ui.html#
5. Added Springboot Dev Tools for continuos code update without restart server.
6. H2 DB url: http://localhost:8080/h2/
7. Custom Exception Handaled. (extends ResponseEntityExceptionHandler)
8. HAL Browser added to monitor API. http://localhost:8080/browser/index.html#/

@ControllerAdvice and extends ResponseEntityExceptionHandler used for Global exception handler.

#Monitoring : <br/>
Download Promethous and Grafana

#Promethous: <br/>
cmd prompt > perometheus.exe --config.file=emp-app.yml <br/>
http://localhost:9090/graph  --Promethous GUI for query

#Grafana : 

cmd prompt > grafana-server.exe
<br/>
http://localhost:3000


