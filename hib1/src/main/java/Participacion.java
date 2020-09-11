import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PARTICIPACIONES")
public class Participacion {

    @Id @ManyToOne
    private Jugador id_jugador;

    @Id @ManyToOne
    private Partido id_partido;

    @ManyToOne
    private Paleta id_paleta;


    public Jugador getId_jugador() {
        return id_jugador;
    }

    public Partido getId_partido() {
        return id_partido;
    }

    public Paleta getId_paleta() {
        return id_paleta;
    }

    public void setId_paleta(Paleta id_paleta) {
        this.id_paleta = id_paleta;
    }

}