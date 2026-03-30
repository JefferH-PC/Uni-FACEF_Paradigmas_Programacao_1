public class Desenvolvedor{
    protected String nome;
    protected String linguagem;
    protected float salarioBase;

    public Desenvolvedor() {
    }
    public Desenvolvedor(String nome, String linguagem, float salario) {
        this.nome = nome;
        this.linguagem = linguagem;
        this.salarioBase = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagem() {
        return linguagem;
    }
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public float getSalario() {
        return salarioBase;
    }
    public void setSalario(float salario) {
        this.salarioBase = salario;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public void codar(){
        System.out.println("Desenvolvedor escrevendo código.");
    }
    public float calcularBonus(){
        return this.salarioBase * 0.05f;
    }
}