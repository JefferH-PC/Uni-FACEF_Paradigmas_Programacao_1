public class Carro {
    // Variéveis
    public String marca, modelo;
    public float velocidade;
    public boolean motor;

    // Métodos da Classe

    // Converte objeto em String
    public void ligar(){
        if(!this.motor) {
            this.motor = true;
            System.out.println("Carro foi ligado");
        }
    }

    public void desligar(){
        if(this.motor) {
            this.motor = false;
            this.velocidade = 0;
            System.out.println("Carro foi desligado");
        }
    }
    // Converte objeto em String
    public String toString(){
        return "Marca: " + this.marca + " Modelo: " + this.modelo + " Velocidade: " + this.velocidade + " Motor: " + (this.motor? "Ligado" : "Desligado");
    }
    // Acelera o carro.
    public void acelerar(float x){
        if (this.motor){
            this.velocidade += x;
            System.out.println("Nova velocidade: " + this.velocidade);
        }
        else System.out.println("Não foi possível acelerar");
    }
    // Frear o carro
    public void frear(float x){
        if(this.motor && this.velocidade - x >= 0){
            this.velocidade -= x;
            System.out.println("Novo valor: " + this.velocidade);
        }
        else System.out.println("Não foi possível frear");
    }

    // Metodo construtor - constroe o objeto e inicializa as variaveis
    public Carro(String marca, String modelo){
        // marca é o valor do usuário
        // this.marca é o valor do objeto
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
        this.motor = false;
    }
}