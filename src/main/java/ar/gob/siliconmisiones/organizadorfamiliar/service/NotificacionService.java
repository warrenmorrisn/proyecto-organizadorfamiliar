package ar.gob.siliconmisiones.organizadorfamiliar.service;

import ar.gob.siliconmisiones.organizadorfamiliar.entity.Notificacion;

import java.util.List;

public interface NotificacionService {

    public List<Notificacion> findAll();

    public Notificacion findById(int id);

    public void save(Notificacion notificacion);

    public void deleteById(int id);

}
