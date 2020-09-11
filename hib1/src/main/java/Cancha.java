import javax.persistence.*;

@Entity
@Table(name = "CANCHAS")
public class Cancha {

    @Id @GeneratedValue
    private Long id_cancha;

    private String nombre;
    private Boolean esta_iluminada;

    @ManyToOne
    private Color cod_color;



    public Long getId_cancha() {
        return id_cancha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEsta_iluminada() {
        return esta_iluminada;
    }

    public void setEsta_iluminada(Boolean esta_iluminada) {
        this.esta_iluminada = esta_iluminada;
    }

    public Color getCod_color() {
        return cod_color;
    }

    public void setCod_color(Color cod_color) { this.cod_color = cod_color; }


}

