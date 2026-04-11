public class Pix implements IPagamentos{
    private String chavePix;

    public Pix(String pix) {
        this.chavePix = pix;
    }

    @Override
    public void autorizar(float valor) {
        System.out.println("Gerando QR Code para a chave " + this.chavePix);
        System.out.println("Pagamento de R$ " + valor + " transferido de forma instantânea.");
    }

    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante disponível no app do banco.");
    }
}
