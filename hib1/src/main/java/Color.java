import javax.persistence.*;

@Entity
@Table(name = "COLORES")
public class Color {

    @Id
    private Long cod_color;

    @Column(length = 128)
    private String descripcion;

    public Long getCod_color() {
        return cod_color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
