# springboot
Demos para entender Java Springboot

# Temas
## Consola 3️⃣

 * [▶️ Video referencia](https://www.youtube.com/watch?v=mCogBfNIFvg&list=PLvimn1Ins-40wR4PC-YtTQ5TKt3vRrVwl&index=3)

 * [😉 Carpeta Código ](./DemoConsola/)
 * [😉 Archivo Con Ejemplo](./DemoConsola/src/main/java/com/faber/DemoConsolaApplication.java)

 ## Inyeccion de Dependencias 4️⃣

 En este caso los estereotipos o decoradores, son los encargados de la funcionalidad, ya que gracias a estos
 se permite indicar a una clase que va permitir la inyeccion de dependencias y a su vez con estos inyectar
 las dependencias.

  * [▶️ Video referencia](https://www.youtube.com/watch?v=sLY9umEahso&list=PLvimn1Ins-40wR4PC-YtTQ5TKt3vRrVwl&index=4)

 * [😉 Carpeta Código ](./DemoInyeccionDependencias/src/main/java/com/faber/)
 * [😉 Implementacion](./DemoInyeccionDependencias/src/main/java/com/faber/service/PersonaServiceImpl.java)
 de la interface Persona Service y su método registrar
 * [😉 Inyeccion dependencia](./DemoInyeccionDependencias/src/main/java/com/faber/DemoInyeccionDependenciasApplication.java)  Service Persona

##  Qualifier, Identificador para Inyeccion de dependencias 5️⃣

  * [▶️ Video referencia](https://www.youtube.com/watch?v=MC9BwnURnfg&list=PLvimn1Ins-40wR4PC-YtTQ5TKt3vRrVwl&index=5)

 * [😉 Carpeta Código ](./DemoInyeccionDependencias/src/main/java/com/faber/)
 * [😉 Implementacion](./DemoInyeccionDependencias/src/main/java/com/faber/repository/PersonaRepoImpl2.java)
 * [😉 Inyeccion dependencia (Implementacion)](./DemoInyeccionDependencias/src/main/java/com/faber/service/PersonaServiceImpl.java) 

## MVC Thymeleaf 6️⃣

Generar Plantillas HTML dinamicas
* [▶️ Video referencia](https://www.youtube.com/watch?v=elz3vXttR-Q&list=PLvimn1Ins-40wR4PC-YtTQ5TKt3vRrVwl&index=6)


 * [😉 Carpeta Código ](./DemoWebThymeleafMVC/src/main)
 * [😉 Controller](./DemoWebThymeleafMVC/src/main/java/com/faber/controller/DemoController.java)
 * [😉 Vista HTML Dinamica](./DemoWebThymeleafMVC/src/main/resources/templates/greeting.html)

 ## Spring Data JPA MVC 7️⃣

 Permite manejar tablas de BD directamente desde java, reprenstandolo con una entidad
 * [▶️ Video referencia](https://www.youtube.com/watch?v=elz3vXttR-Q&list=PLvimn1Ins-40wR4PC-YtTQ5TKt3vRrVwl&index=7)
* [😉 Carpeta Código ](./JPA-SpringData/)
* [😉 Model o Entidad](./JPA-SpringData/src/main/java/com/faber/model/Persona.java) Equivalente a tabla en BD
* [😉 Repository JPA](./JPA-SpringData/src/main/java/com/faber/repo/IPersonaRepo.java) Para el manejo de las propiedades o ventajas de JPA para la entidad
* [😉 Aplication Propierties](./JPA-SpringData/src/main/resources/application.properties) Datos conexion a BD
* [😉 Controller](./JPA-SpringData/src/main/java/com/faber/controller/DemoController.java)  Aquí se inyecta la interface del repository y se usa sus métodos para guardar o manipular la BD

Nota: @Query sirve para traer solo ciertas columnas de la BD

 ## Servicios Rest 8️⃣

 Servicio rest, tomando como base, datos del punto anterior

  * [▶️ Video Referencia](https://www.youtube.com/watch?v=RABN1tDBN4Q&list=PLvimn1Ins-40wR4PC-YtTQ5TKt3vRrVwl&index=8)
  * [😉 Carpeta Código ](./JPA-SpringData/)
  * [😉 Aplication Propierties](./JPA-SpringData/src/main/resources/application.properties) Datos conexion a BD
  * [😉 Controller](./JPA-SpringData/src/main/java/com/faber/rest/RestDemoController.java) Servicio Rest Post, Get,Put y Delete
  * [😉 Coleccion Prueba](./colecciones/Persona.postman_collection.json) Coleccion de prueba del servicio rest

   ## Spring Security 9️⃣

   Dependencia que restringe el acceso a la aplicacion por usuario y contraseña, se debe agregar en el archivo `pom.xml` del proyecto

  * [▶️ Video Referencia](https://www.youtube.com/watch?v=ksLYIavT2L0&list=PLvimn1Ins-40wR4PC-YtTQ5TKt3vRrVwl&index=9)


~~~ xml
	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
	</dependency>
~~~


### 1. Credenciales por defecto
- usuario: user
- contraseña :suministrada en consola de la aplicación

### 2. Para asignar un usuario y contraseña personalizado, 
Se puede realizar agregando las sigtes lineas en archivo `aplication.properties`

``` properties
spring.security.user.name=faber
spring.security.user.password=1234
``` 

### 3. Usuario y contraseña dinámico BD
Para que la proteccion con usuario sea dinámico de acuerdo a un registro de BD, se crean las sigtes clases.

- [Usuario](./JPA-SpringData/src/main/java/com/faber/model/Usuario.java) clase para crear en BD, los usuarios que pueden acceder a la aplicación
- [SecurityConfig](./JPA-SpringData/src/main/java/com/faber/SecurityConfig.java) Clase o utilidad para encriptar un texto
- [Prueba Unitaria](./JPA-SpringData/src/test/java/com/faber/JpaSpringDataApplicationTests.java)
Se crea prueba unitaria para simular la creación de un usuario en BD

## Spring Security II 🔟

* [▶️ Video Referencia](https://www.youtube.com/watch?v=zQjZFHo8eO4&list=PLvimn1Ins-40wR4PC-YtTQ5TKt3vRrVwl&index=10)

### 🔴🔴🔴🔴🔴  
### Seccion sin desarrollar por error en la importacion de WebSecurityConfigurerAdapter 
### 🔴🔴🔴🔴🔴




