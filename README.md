# **Inicialización del proyecto con Spring Initializr**

Para comenzar, se utiliza Spring Initializr para generar un nuevo proyecto Spring Boot. Aseguramos de incluir la dependencia Web para habilitar el soporte web en tu aplicación.

### Ss
![image](https://github.com/Kss21ch/Web-API-de-Libro/assets/147552972/9ac296bc-dc99-4280-8687-fc740fa9f7f7)


## Creación de la entidad Libro 
En el paquete com.tuuniversidad.modelos, creamos una nueva clase llamada Libro. Esta clase representará la entidad Libro contendrá los siguientes campos: id, titulo, autor, editorial y anioPublicacion. Estos campos representan las propiedades básicas de un libro.

## Creación del repositorio
En el paquete com.tuuniversidad.repository, se crea una clase para contener objetos quemados de los libros, definimos una lista estática de objetos Libro para simular una base de datos en memoria.

### Captura del taller
![image](https://github.com/Kss21ch/Web-API-de-Libro/assets/147552972/2f60e44a-1cdb-4c12-814d-bce80d963d2f)


# Creación del servicio 
En el paquete com.tuuniversidad.service, creamos una clase para contener la lógica de negocio relacionada con los libros. Este servicio debería interactuar con el repositorio para obtener y manipular los datos de los libros.

### Captura del taller
![image](https://github.com/Kss21ch/Web-API-de-Libro/assets/147552972/694db03a-c6f9-4d0c-9f16-3234c91ab16d)

# Creación del controlador
En el paquete com.tuuniversidad.controllers, se crea una clase llamada LibroController que será responsable de manejar las solicitudes relacionadas con los libros. Define tres endpoints utilizando anotaciones como @RestController, @RequestMapping, @GetMapping y @PostMapping.

### Captura del taller
![image](https://github.com/Kss21ch/Web-API-de-Libro/assets/147552972/b84df7f0-7bb8-40ad-ab99-d72e1792f9bc) 

### Captura del taller
![image](https://github.com/Kss21ch/Web-API-de-Libro/assets/147552972/47d9a997-1465-4275-abe2-152482a1d528)

### Captura del taller
![image](https://github.com/Kss21ch/Web-API-de-Libro/assets/147552972/c52ba900-110f-4b40-85e4-c021860fb00e)





