package Hospital;

/**
 *
 * @author Jose, Iris
 */
public class Hospital {

    private int id;
    private String nombre;
    private String direccion;
    private String localidad;
    private String telefono;

    /**
     * Contructor de la clase Hospital.
     * @param id Id del hospital.
     * @param nombre Nombre del hospital.
     * @param direccion Direccion del hospital.
     * @param localidad Localidad del hospital.
     * @param telefono Teléfono del hospital.
     */
    public Hospital(int id, String nombre, String direccion, String localidad, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.telefono = telefono;
    }

    /**
     * Constructor vacío.
     */
    public Hospital() {
    }

    /**
     * Getter del id del hospital.
     * @return Devuelve el id del hospital.
     */
    public int getId() {
        return id;
    }

    /**
     * Setter del id del hospital.
     * @param id Id del hospital.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter del nombre del hospital.
     * @return Devuelve el nombre del hospital.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre del hospital.
     * @param nombre Nombre del hospital.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de la direccion del hospital.
     * @return Devuelve la direccion del hospital.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Setter de la direccion del hospital.
     * @param direccion Direccion del hospital.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Getter de la localidad del hospital.
     * @return Devuelve la localidad del hospital.
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Setter de la localidad del hospital.
     * @param localidad Localidad del hospital.
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * Getter del teléfono del hospital.
     * @return Devuelve el teléfono del hospital.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Setter del teléfono del hospital.
     * @param telefono Teléfono del hospital.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
