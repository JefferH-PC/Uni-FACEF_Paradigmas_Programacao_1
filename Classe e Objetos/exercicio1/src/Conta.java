public class Conta {

    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(float valor){
        if(this.status){
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso. Valor: R$" + valor);
        }
        else System.out.println("Não foi possível realizar o depósito, a conta está inativa.");
    }

    public void sacar(float valor){
        if(this.status && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso. Valor: R$" + valor);
        }
        else System.out.println("Saldo insuficiente ou Conta Inativa");
    }

    public void encerrarConta(){
        if(this.saldo == 0){
            this.status = false;
            System.out.println("Conta encerrada com sucesso.");
        }
        else System.out.println("Todo o saldo deve ser sacado antes de encerrar a conta.");
    }

    public String toString(){
        return "Número: " + this.numeroConta + " | Agência: " + this.agencia + " | Cliente: " + this.nomeCliente + " | Saldo Atual: " + this.saldo + " | Status: " + (this.status? "Ativa" : "Encerrada");
    }
}