package com.tuuniversidad.apirest.libro.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tuuniversidad.apirest.libro.modelos.Libro;
import com.tuuniversidad.apirest.libro.servicios.LibroService;

@RestController
public class LibroController {

    //@Autowired
    //private LibroRepository libroRepository;

    @Autowired
    private LibroService libroService;

    @GetMapping ("/Hola_libro")
    public Libro getLibro ()
    {
        return new Libro(1, "Hola", "kevin", "holaaa");
        
    }

    @GetMapping("/Hola_libros")
    public List<Libro> getLibros() {
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro(1, "My Hero Academia", "Kōhei Horikoshi", "Shūeisha"));
        libros.add(new Libro(2, "Haikyū!!", "Haruichi Furudate", "Shūeisha"));
        libros.add(new Libro(3, "Kimetsu no Yaiba", "Koyoharu Gotōge", "Shūeisha"));
        libros.add(new Libro(4, "Black Clover", "Yūki Tabata (guion) Setta Kobayashi (dibujo)", "Shūeisha"));
        return libros;
    }

    // Endpoint para obtener todos los libros
    @GetMapping
    public List<Libro> obtenerTodosLosLibros() {
        return libroService.getLibros();
    }

    // Endpoint para obtener un libro por su ID
    @GetMapping("/{id}")
    public Libro obtenerLibroPorId(@PathVariable Long id) {
        return libroService.getLibro(id);
    }

    // Endpoint para crear un nuevo libro
    @PostMapping("/Crear_Libro")
    public Libro crearLibro(@RequestBody Libro nuevoLibro) {
        return libroService.crearLibro(nuevoLibro);
    }
}

    
