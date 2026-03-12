public class TestaStreaming {
    public static void main(String[] args) {
        Streaming conta1 = new Streaming("Alex Silva", "Premium");

        System.out.println(conta1.toString());

        conta1.assistirFilme("Interestelar");

        System.out.println(conta1.toString());

        Streaming conta2 = new Streaming("Mariana Souza", "Básico");

        conta2.cancelarAssinatura();

        System.out.println(conta2.toString());
        
        conta2.assistirFilme("O Poderoso Chefão");
    }
}