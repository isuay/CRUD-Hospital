package Hospital;

import java.util.Date;

public class Doctor {
    
    private int id;
    private String nombre;
    private String telefono;
    private int id_hospital;
    private String especialidad;
    private Date fechaNac;

    public Doctor(int id, String nombre, String telefono, int id_hospital, String especialidad, Date fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.id_hospital = id_hospital;
        this.especialidad = especialidad;
        this.fechaNac = fechaNac;
    }

    public Doctor() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getId_hospital() {
        return id_hospital;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setId_hospital(int id_hospital) {
        this.id_hospital = id_hospital;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    
    
    
}
