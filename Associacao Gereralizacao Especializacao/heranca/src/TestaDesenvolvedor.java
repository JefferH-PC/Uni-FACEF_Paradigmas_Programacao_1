public class TestaDesenvolvedor {
    public static void exibir(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao.toString() + " \nBônus = " + camaleao.calcularBonus());
    }
    public static void main(String[] args){
        Desenvolvedor dev1 = new Desenvolvedor();

        Junior jr1 = new Junior("Fulano", "Java", 4000, "Beltrano");
        exibir(jr1);

        Pleno pl1 = new Pleno("Beltrano", "Java", 5000, 5);
        exibir(pl1);

        Senior se1 = new Senior("Ciclano", "Java", 6000, 3000);
        exibir(se1);
    }
}
