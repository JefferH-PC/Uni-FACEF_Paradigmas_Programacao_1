public class Streaming{
    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano){
        this.usuario = usuario;
        this.plano = plano;
        switch (plano.toLowerCase()){
            case "básico":
                this.mensalidade = 25.90f;
                break;
            case "premium":
                this.mensalidade = 45.90f;
                break;
            case "família":
                this.mensalidade = 60.90f;
                break;
            default:
                System.out.println("Plano Inválido.");
        }
        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }
    public void assistirFilme(String nomeFilme){
        if (this.ativo){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + this.ultimoFilmeAssistido);
        }
        else System.out.println("A fatura precisa ser paga.");
    }
    public void cancelarAssinatura(){
        this.ativo = false;
    }
    public String toString(){
        return "Usuário: " + this.usuario + " | Plano: " + this.plano + " | Mensalidade: R$" + this.mensalidade +
                " | Status: " + (this.ativo? "Ativo" : "Suspenso") + " | Último filme assistido: " + this.ultimoFilmeAssistido;
    }
}