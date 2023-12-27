package com.system.blog.controlador;

import com.system.blog.DTO.ComentarioDTO;
import com.system.blog.servicio.ComentarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ComentarioControlador {
    @Autowired
    private ComentarioServicio comentarioServicio;
    @PostMapping("/publicacion/{id}/comentarios")
    public ResponseEntity<ComentarioDTO> guardarComentario(@PathVariable(value = "id") Long id, @RequestBody ComentarioDTO comentarioDTO){
        return new ResponseEntity<>(comentarioServicio.crearComentario(id,comentarioDTO), org.springframework.http.HttpStatus.CREATED);
    }

    @GetMapping("/publicacion/{id}/comentarios")
    public ResponseEntity<List<ComentarioDTO>> obtenerComentariosPorPublicacion(@PathVariable(value = "id") Long id){
        return new ResponseEntity<>(comentarioServicio.obtenerComentariosPorPublicacion(id), org.springframework.http.HttpStatus.OK);
    }

    @GetMapping("/comentarios/{id}")
    public ResponseEntity<ComentarioDTO> obtenerComentarioPorId(@PathVariable(value = "id") Long id){
        return new ResponseEntity<>(comentarioServicio.obtenerComentarioPorId(id), org.springframework.http.HttpStatus.OK);
    }

    @PutMapping("/comentarios/{id}")
    public ResponseEntity<ComentarioDTO> actualizarComentario(@PathVariable(value = "id") Long id, @RequestBody ComentarioDTO comentarioDTO){
        return new ResponseEntity<>(comentarioServicio.actualizarComentario(id,comentarioDTO), org.springframework.http.HttpStatus.OK);
    }



}