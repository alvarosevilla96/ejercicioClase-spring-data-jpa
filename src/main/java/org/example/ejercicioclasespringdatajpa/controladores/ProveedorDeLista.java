package org.example.ejercicioclasespringdatajpa.controladores;

import java.util.List;
import java.util.Map;

public interface ProveedorDeLista {
    /**
     * Devuelve el título de la página.
     */
    String getTitulo();
    /**
     * Devuelve las cabeceras de la tabla.
     */
    List<String> getCabeceras();

    /**
     * Devuelve los datos de las filas. Cada fila es una lista de objetos.
     */
    List<Map<String, Object>> getFilas();

    /**
     * Devuelve el nombre de la entidad que gestiona, para el registro.
     */
    String getNombreEntidad();
}
