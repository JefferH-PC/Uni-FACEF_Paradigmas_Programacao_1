import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome, professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina() {
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }
    public Disciplina(String professor, String nome, int id) {
        this.professor = professor;
        this.nome = nome;
        this.id = id;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public void matricularAluno(Aluno a){
        this.alunos.add(a);
    }
    public void criarAvaliacao(int id, String nome){
        Avaliacao aux = new Avaliacao(id, nome);
        this.avaliacoes.add(aux);
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

    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Avaliacao getAvaliacoes(String nome) {
       for (Avaliacao av : avaliacoes){
           if(av.getNome().equalsIgnoreCase(nome)){
               return av;
           }
        }
       return null;
    }
    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professor='" + professor + '\'' +
                ", alunos=\n" + alunos +
                ", avaliacoes=\n" + avaliacoes +
                '}';
    }
}
