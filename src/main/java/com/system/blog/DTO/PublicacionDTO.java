package com.system.blog.DTO;

import lombok.Data;

@Data
public class PublicacionDTO {
    private Long id;
    private String titulo;
    private String contenido;
    private String descripcion;
}
