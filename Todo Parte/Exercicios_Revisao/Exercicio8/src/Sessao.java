import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id, sala;
    private LocalDateTime horário;
    private Filme filme;
    private ArrayList<Ingresso> ingressos;

    public Sessao() {
        this.ingressos = new ArrayList<Ingresso>();
    }
    public Sessao(int id, int sala, LocalDateTime horário) {
        this.id = id;
        this.sala = sala;
        this.horário = horário;
        this.ingressos = new ArrayList<Ingresso>();
    }

    public void vincularFilme(Filme f){
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco){
        Ingresso aux = new Ingresso(id, assento, tipo, preco);
        this.ingressos.add(aux);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getSala() {
        return sala;
    }
    public void setSala(int sala) {
        this.sala = sala;
    }

    public LocalDateTime getHorário() {
        return horário;
    }
    public void setHorário(LocalDateTime horário) {
        this.horário = horário;
    }

    public Filme getFilme() {
        return filme;
    }
    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }
    public void setIngressos(ArrayList<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        return "Sessao{" +
                "id=" + id +
                ", sala=" + sala +
                ", horário=" + horário.format(formatoBR) +
                ", filme=" + filme +
                ", ingressos=" + ingressos +
                '}';
    }
}
