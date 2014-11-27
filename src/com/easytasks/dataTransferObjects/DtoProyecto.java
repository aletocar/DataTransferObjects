
package com.easytasks.dataTransferObjects;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DtoProyecto extends DataTransferObject{
    private String nombre;
    private DtoUsuario responsable;
    private Long id;
    private Date fechaInicio;
    private Date fechaFin;
    private DtoContexto contexto;
    private List<DtoUsuario> usuarios;
    private List<DtoTarea> tareas;
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DtoUsuario getResponsable() {
        return responsable;
    }

    public void setResponsable(DtoUsuario responsable) {
        this.responsable = responsable;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public DtoContexto getContexto() {
        return contexto;
    }

    public void setContexto(DtoContexto contexto) {
        this.contexto = contexto;
    }

    public List<DtoUsuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<DtoUsuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<DtoTarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<DtoTarea> tareas) {
        this.tareas = tareas;
    }

    public DtoProyecto() {
        this.usuarios = new ArrayList<>();
        this.tareas = new ArrayList<>();
    }

    public DtoProyecto(String nombre, DtoUsuario responsable, Date fechaInicio, Date fechaFin, DtoContexto contexto) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.contexto = contexto;
        this.usuarios = new ArrayList<>();
        this.tareas = new ArrayList<>();
    }
}
