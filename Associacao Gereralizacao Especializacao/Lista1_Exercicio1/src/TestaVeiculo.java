public class TestaVeiculo{
    public static void main(String[] args){

        Aviao aviao = new Aviao("Boeing", "777", 900.0f,10000.0f);
        CarroEletrico carroEletrico = new CarroEletrico("BYD", "Seal", 110.0f, 600);
        Veiculo veiculo;

        veiculo = aviao;
        veiculo.mover();

        veiculo = carroEletrico;
        veiculo.mover();
    }
}
