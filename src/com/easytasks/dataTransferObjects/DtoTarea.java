package com.easytasks.dataTransferObjects;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DtoTarea {

    private Date fechaCreacion;
    private Date fechaLimite;
    private List<DtoTarea> subtareas;
    private Long id;
    private String nombre;
    private int prioridad;
    private boolean completado;
    private DtoUsuario realizador;
    private List<DtoUsuario> listaResponsables;
    private List<DtoEtiqueta> listaEtiquetas;
    private DtoProyecto proyecto;
    
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public List<DtoTarea> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(List<DtoTarea> Subtareas) {
        this.subtareas = Subtareas;
    }

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

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public List<DtoUsuario> getListaResponsables() {
        return listaResponsables;
    }

    public void setListaResponsables(List<DtoUsuario> listaResponsables) {
        this.listaResponsables = listaResponsables;
    }

    public List<DtoEtiqueta> getListaEtiquetas() {
        return listaEtiquetas;
    }

    public void setListaEtiquetas(List<DtoEtiqueta> listaEtiquetas) {
        this.listaEtiquetas = listaEtiquetas;
    }

    public DtoProyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(DtoProyecto proyecto) {
        this.proyecto = proyecto;
    }

    public DtoUsuario getRealizador() {
        return realizador;
    }

    public void setRealizador(DtoUsuario realizador) {
        this.realizador = realizador;
    }

    public DtoTarea() {
        subtareas = new ArrayList<>();
        listaEtiquetas = new ArrayList<>();
        listaResponsables = new ArrayList<>();
    }
}
