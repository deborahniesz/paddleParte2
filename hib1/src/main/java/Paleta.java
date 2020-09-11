import javax.persistence.*;

@Entity
@Table(name = "PALETAS")
public class Paleta {

    @Id
    private Long cod_paleta;

    private String nombre;
    private Float grosor;

    @ManyToOne
    private Constructor cod_constructor;

    @ManyToOne
    private Color cod_color;

    public Long getCod_paleta() {
        return cod_paleta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getGrosor() {
        return grosor;
    }

    public void setGrosor(Float grosor) {
        this.grosor = grosor;
    }

    public Constructor getCod_constructor() {
        return cod_constructor;
    }

    public void setCod_constructor(Constructor cod_constructor) {
        this.cod_constructor = cod_constructor;
    }

    public Color getCod_color() {
        return cod_color;
    }

    public void setCod_color(Color cod_color) {
        this.cod_color = cod_color;
    }

}
