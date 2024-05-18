# **Inicialización del proyecto con Spring Initializr**

Para comenzar, utiliza Spring Initializr para generar un nuevo proyecto Spring Boot. Asegúrate de incluir la dependencia Web para habilitar el soporte web en tu aplicación.

Creación de la entidad Libro: En el paquete com.tuuniversidad.models, crea una nueva clase llamada Libro. Esta clase representará la entidad Libro en tu aplicación y contendrá los siguientes campos: id (tipo Long), titulo (tipo String), autor (tipo String), editorial (tipo String) y anioPublicacion (tipo Integer). Estos campos representan las propiedades básicas de un libro.

Creación del repositorio: En el paquete com.tuuniversidad.repository, crea una clase para contener objetos quemados de los libros. Aquí podrías definir una lista estática de objetos Libro para simular una base de datos en memoria.

Creación del servicio: En el paquete com.tuuniversidad.service, crea una clase para contener la lógica de negocio relacionada con los libros. Este servicio debería interactuar con el repositorio para obtener y manipular los datos de los libros.

Creación del controlador: En el paquete com.tuuniversidad.controllers, crea una clase llamada LibroController que será responsable de manejar las solicitudes relacionadas con los libros. Define tres endpoints utilizando anotaciones como @RestController, @RequestMapping, @GetMapping y @PostMapping:
