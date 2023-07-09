# microservicio-department-client
practice with microservices

![image](https://github.com/LeandroTombe/microservicio-department-client/assets/57770761/47e86249-b334-4b55-af74-24a68e1e5513)



#### SERVER CONFIG
El primer servicio se trata de la configuracion de nuestro microservicio
En una arquitectura basada en Microservicios tenemos varias piezas de software que muy probablemente requieran la misma configuración en cada uno de ellos. Para no escribir la misma configuración en cada uno de ellos podemos usar Spring Cloud Config Server y centralizar nuestra configuración en un solo lugar.

Dependencia:
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-config-server</artifactId>
</dependency>



#### SERVER CLIENT
Una vez que se configura el servidor centralizado, debemos tener servidores clientes, es decir que consulte la información del Servicio Config Server.

Dependencia:
<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-config-client</artifactId>
  <version>4.0.1</version>
</dependency>

Ahora podemos crear una aplicacion Config Server y aplicaciones Config Client para poder centralizar las propiedades comunes de todos nuestros microservicios 


#### EUREKA SERVER

El objetivo de Eureka Server es localizar y registrar servicios con los que se desea interactuar, además nos ayuda con el balanceo de carga y la tolerancia a fallos. Para configurar Eureka Server deben existir al menos dos tipos de aplicaciones, una aplicación que funcione como servidor y otra como cliente.

Cada servicio debe comunicarse con el Servidor Eureka para decirle que está disponible para ser usado. Eureka Server guardará su información y su estado. A esta comunicación entre el microservicio y Eureka se le llama heartbeats y ocurre cada 30 segundos. Si  3 heartbeats fallan Eureka Server lo elimina de la lista.
