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

## MVC Thymeleaf

Generar Plantillas HTML dinamicas
* [▶️ Video referencia](https://www.youtube.com/watch?v=elz3vXttR-Q&list=PLvimn1Ins-40wR4PC-YtTQ5TKt3vRrVwl&index=6)


 * [😉 Carpeta Código ](./DemoWebThymeleafMVC/src/main)
 * [😉 Controller](./DemoWebThymeleafMVC/src/main/java/com/faber/controller/DemoController.java)
 * [😉 Vista HTML Dinamica](./DemoWebThymeleafMVC/src/main/resources/templates/greeting.html)

 ## Spring Data JPA MVC
 * [▶️ Video referencia](https://www.youtube.com/watch?v=elz3vXttR-Q&list=PLvimn1Ins-40wR4PC-YtTQ5TKt3vRrVwl&index=7)

 * [😉 Carpeta Código ](./JPA-SpringData/)
 * [😉 Model o Entidad](./JPA-SpringData/src/main/java/com/faber/model/Persona.java) Equivalente a tabla en BD
* [😉 Repository JPA](./JPA-SpringData/src/main/java/com/faber/repo/IPersonaRepo.java) Para el manejo de las propiedades o ventajas de JPA para la entidad
* [😉 Aplication Propierties](./JPA-SpringData/src/main/resources/application.properties) Datos conexion a BD
* [😉 Controller](./JPA-SpringData/src/main/java/com/faber/controller/DemoController.java)  Aquí se inyecta la interface del repository y se usa sus métodos para guardar o manipular la BD

Nota: @Query sirve para traer solo ciertas columnas de la BD