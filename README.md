# microservicio-department-client
practice with microservices


#### SERVER CONFIG
El primer servicio se trata de la configuracion de nuestro microservicio
En una arquitectura basada en Microservicios tenemos varias piezas de software que muy probablemente requieran la misma configuración en cada uno de ellos. Para no escribir la misma configuración en cada uno de ellos podemos usar Spring Cloud Config Server y centralizar nuestra configuración en un solo lugar.

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-config-server</artifactId>
</dependency>

Una vez que se configura el servidor centralizado, debemos tener servidores clientes, es decir que consulte la información del Servicio Config Server.


<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-config-client</artifactId>
  <version>4.0.1</version>
</dependency>

Ahora podemos crear una aplicacion Config Server y aplicaciones Config Client para poder centralizar las propiedades comunes de todos nuestros microservicios 
