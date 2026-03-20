import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nome;
    private ArrayList<Programador> programadores;

    public Projeto() {
        this.programadores = new ArrayList<Programador>();
    }
    public Projeto(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.programadores = new ArrayList<Programador>();
    }

    public String listarProgramadoresProjeto(){
        return "Programadores no projeto " + this.nome + ": " + this.programadores;
    }
    public void agregarProgramador(Programador programador){
        this.programadores.add(programador);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Programador> getProgramadores() {
        return programadores;
    }
    public void setProgramadores(ArrayList<Programador> programadores) {
        this.programadores = programadores;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", programadores=" + programadores +
                '}';
    }
}
