public class TestaConta {
    public static void main(String[] args){

        Conta c1 = new Conta(17659,3145, "João Silva");
        Conta c2 = new Conta(12498, 2345, "Maria Souza");

        c1.depositar(500);
        c1.sacar(200);
        System.out.println(c1.toString());

        c2.sacar(50);

        c1.encerrarConta();
        c1.sacar(c1.saldo);
        c1.encerrarConta();
        System.out.println(c1.toString());
    }
}
