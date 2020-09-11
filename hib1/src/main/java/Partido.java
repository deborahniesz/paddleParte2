import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PARTIDOS")
public class Partido {

    @Id @GeneratedValue
    private Long id_partido;

    private Date inicio_partido;
    private Date fin_partido;

    @ManyToOne
    private Cancha id_cancha;

    @ManyToOne
    private Color cod_color_cancha;

    @ManyToOne
    private Jugador id_jugador_responsable;

    public Long getId_partido() {
        return id_partido;
    }

    public Date getInicio_partido() {
        return inicio_partido;
    }

    public void setInicio_partido(Date inicio_partido) {
        this.inicio_partido = inicio_partido;
    }

    public Date getFin_partido() {
        return fin_partido;
    }

    public void setFin_partido(Date fin_partido) {
        this.fin_partido = fin_partido;
    }

    public Cancha getId_cancha() {
        return id_cancha;
    }

    public void setId_cancha(Cancha id_cancha) {
        this.id_cancha = id_cancha;
    }

    public Color getCod_color_cancha() {
        return cod_color_cancha;
    }

    public void setCod_color_cancha(Color cod_color_cancha) {
        this.cod_color_cancha = cod_color_cancha;
    }

    public Jugador getId_jugador_responsable() {
        return id_jugador_responsable;
    }

    public void setId_jugador_responsable(Jugador id_jugador_responsable) {
        this.id_jugador_responsable = id_jugador_responsable;
    }

}
