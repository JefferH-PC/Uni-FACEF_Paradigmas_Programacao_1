public class Sms extends CanalNotificacao{
    private int numeroTelefone;

    public Sms() {
        super();
    }
    public Sms(String destinatario, String mensagem, int numeroTelefone) {
        super(destinatario, mensagem);
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para o número " + this.numeroTelefone + ": " + this.mensagem);
    }

    public int getNumeroTelefone() {
        return this.numeroTelefone;
    }
    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "Email{" +
                super.toString() +
                "numeroTelefone='" + numeroTelefone + '\'' +
                '}';
    }
}
