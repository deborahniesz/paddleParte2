import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "JUGADORES")
public class Jugador {

    @Id @GeneratedValue
    private Long id_jugador;

    private String nombre;
    private String apellido;
    private String domicilio;
    private Date nacimiento;

    @ManyToOne
    private Paleta paleta;

    public Long getId_jugador() {
        return id_jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Paleta getPaleta() {
        return paleta;
    }

    public void setPaleta(Paleta paleta) {
        this.paleta = paleta;
    }

}
