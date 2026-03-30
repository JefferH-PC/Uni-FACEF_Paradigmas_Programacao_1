public class TestaVetorPolimorfico {
    public static void main(String[] args){
        Desenvolvedor[] desenvolvedores = new Desenvolvedor[4];
        Junior junior = new Junior("Pedro", "JavaScript", 1500.00f, "João");
        Pleno pleno = new Pleno("João", "Python", 3000.00f, 15);
        Senior senior = new Senior("Marcos", "C++", 6500.00f, 3000.00f);
        Desenvolvedor devGenerico = new Desenvolvedor("Douglas", "C#", 1000.00f);
        desenvolvedores[0] = junior;
        desenvolvedores[1] = pleno;
        desenvolvedores[2] = senior;
        desenvolvedores[3] = devGenerico;
        for(Desenvolvedor desenvolvedor : desenvolvedores){
            desenvolvedor.codar();
            System.out.println("Bônus do desenvolvedor " + desenvolvedor.getClass().getSimpleName() + " " + desenvolvedor.nome + ": R$" + desenvolvedor.calcularBonus());
            System.out.println(desenvolvedor.toString());
        }
    }
}
