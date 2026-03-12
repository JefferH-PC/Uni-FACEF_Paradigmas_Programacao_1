public class Placar{
    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    public int periodoQuarto;

    public Placar(String casa, String visitante){
        this.nomeTimeCasa = casa;
        this.nomeTimeVisitante = visitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo){
        if(tipo > 0 && tipo < 4){
            switch (time.toLowerCase()){
                case "casa":
                    this.pontosCasa += tipo;
                    break;
                case "visitante":
                    this.pontosVisitante += tipo;
                    break;
                default:
                    System.out.println("Time Inválido.");
            }
        }
    }

    public void proximoQuarto() {
        if(this.periodoQuarto < 4){
            this.periodoQuarto++;
        }
        else System.out.println("O jogo terminou.");
    }

    public String toString(){
        return this.nomeTimeCasa + " " +  this.pontosCasa + " x "
                + this.pontosVisitante + " " + this.nomeTimeVisitante + " - Período: " + this.periodoQuarto;
    }
}