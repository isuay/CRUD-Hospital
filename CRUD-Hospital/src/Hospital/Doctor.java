package Hospital;

/**
 *
 * @author Jose, Iris
 */
public class Doctor {
    
    private int id;
    private String nombre;
    private String telefono;
    private int idHospital;
    private String especialidad;
    private String fechaNac;

    /**
     * Constructor de la clase Doctor.
     * @param id Id del doctor.
     * @param nombre Nombre del doctor.
     * @param telefono Telefono del doctor.
     * @param idHospital Id del hospital en el que trabaja el doctor.
     * @param especialidad Especialidad del doctor.
     * @param fechaNac Fecha de nacimiento del doctor.
     */
    public Doctor(int id, String nombre, String telefono, int idHospital, String especialidad, String fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.idHospital = idHospital;
        this.especialidad = especialidad;
        this.fechaNac = fechaNac;
    }

    /**
     * Contructor vacío de la clase Doctor.
     */
    public Doctor() {
    }

    /**
     * Getter del id del doctor.
     * @return Devuelve el id del doctor.
     */
    public int getId() {
        return id;
    }

    /**
     * Getter del nombre del doctor.
     * @return Devuelve el nombre del doctor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter del teléfono del doctor.
     * @return Devuelve el teléfono del doctor.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Getter del id del hospital en el que trabaja el doctor.
     * @return Devuelve el id del hospital en el que trabaja el doctor.
     */
    public int getIdHospital() {
        return idHospital;
    }

    /**
     * Getter de la especialidad del doctor.
     * @return Devuelve la especialidad del doctor.
     */
    public String getEspecialidad() {
        return especialidad;
    }
    
    /**
     * Getter de la fecha de nacimiento del doctor.
     * @return Devuelve la fecha de nacimiento.
     */
    public String getFechaNac() {
        return fechaNac;
    }

    /**
     * Setter del id del doctor.
     * @param id Id del doctor.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Setter del nombre del doctor.
     * @param nombre Nombre del doctor.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter del teléfono del doctor.
     * @param telefono Teléfono del doctor.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Setter del id del hospital en el que trabaja el doctor.
     * @param idHospital Id del hospital.
     */
    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    /**
     * Setter de la especialidad del doctor.
     * @param especialidad Especialidad del doctor.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Setter de la fecha de nacimiento del doctor.
     * @param fechaNac Fecha de nacimiento del doctor.
     */
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }   
}
