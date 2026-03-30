public class Pleno extends Desenvolvedor{
    private int projEnt;

    public Pleno() {
        super();
    }
    public Pleno(String nome, String linguagem, float salario, int projEnt) {
        super(nome, linguagem, salario);
        this.projEnt = projEnt;
    }

    public int getProjEnt() {
        return projEnt;
    }
    public void setProjEnt(int projEnt) {
        this.projEnt = projEnt;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projEnt=" + projEnt +
                '}';
    }

    @Override
    public void codar(){
        System.out.println("Pleno desenvolvendo código e fazendo Code Review");
    }

    @Override
    public float calcularBonus(){
        return super.calcularBonus() + 2000;
    }
}