package Hospital;

public class Doctor {
    
    private int id;
    private String nombre;
    private String telefono;
    private int idHospital;
    private String especialidad;
    private String fechaNac;

    public Doctor(int id, String nombre, String telefono, int idHospital, String especialidad, String fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.idHospital = idHospital;
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

    public int getIdHospital() {
        return idHospital;
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

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }   
}
