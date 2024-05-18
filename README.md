# **Inicialización del proyecto con Spring Initializr**

Para comenzar, se utiliza Spring Initializr para generar un nuevo proyecto Spring Boot. Aseguramos de incluir la dependencia Web para habilitar el soporte web en tu aplicación.

## Creación de la entidad Libro 
En el paquete com.tuuniversidad.modelos, creamos una nueva clase llamada Libro. Esta clase representará la entidad Libro contendrá los siguientes campos: id, titulo, autor, editorial y anioPublicacion. Estos campos representan las propiedades básicas de un libro.

## Creación del repositorio
En el paquete com.tuuniversidad.repository, se crea una clase para contener objetos quemados de los libros, definimos una lista estática de objetos Libro para simular una base de datos en memoria.
![image](https://github.com/Kss21ch/Web-API-de-Libro/assets/147552972/2f60e44a-1cdb-4c12-814d-bce80d963d2f)


Creación del servicio: En el paquete com.tuuniversidad.service, crea una clase para contener la lógica de negocio relacionada con los libros. Este servicio debería interactuar con el repositorio para obtener y manipular los datos de los libros.

Creación del controlador: En el paquete com.tuuniversidad.controllers, crea una clase llamada LibroController que será responsable de manejar las solicitudes relacionadas con los libros. Define tres endpoints utilizando anotaciones como @RestController, @RequestMapping, @GetMapping y @PostMapping:
