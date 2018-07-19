package ado.com.itla.tartaro.entidad;

import java.util.Date;

public class Tarea {

    public enum EstadoTarea{
        PENDIENTE,
        PROCESO,
        LISTA
    }

    private Integer id;
    private Date fecha;
    private EstadoTarea estadoTarea;
    private  Categoria categoria;
    private Usuario usuarioCreador;
    private Usuario usuarioAsignado;
    private Date fechaCompletado;
    private  String nombre;
    private String descripcion;



}
