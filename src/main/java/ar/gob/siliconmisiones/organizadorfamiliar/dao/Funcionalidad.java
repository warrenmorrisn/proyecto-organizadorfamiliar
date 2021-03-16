package ar.gob.siliconmisiones.organizadorfamiliar.dao;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Persona;

import java.util.List;


public interface Funcionalidad {

    //Buscar
    int find();

    //Buscar a todos
    List<Persona> findAll();

    //Añadir nuevo
    boolean addNew();

    //Modificar
    boolean modify();

    //Visualizar
    String visualize();

    //eliminar
    boolean delete();




}
