public class TestaAcademico{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, 25900, "Emanuel", "Engenharia de Software");
        Aluno aluno2 = new Aluno(2, 25600, "João", "Ciências da Computação");
        Disciplina disc1 = new Disciplina("Daniel", "Programação Orientada a Objetos", 50);

        disc1.matricularAluno(aluno1);
        disc1.matricularAluno(aluno2);

        disc1.criarAvaliacao(5,"Prova Semestral");
        Avaliacao aval1 = disc1.getAvaliacoes().get(0);
        aval1.adicionarQuestao(1, "O que é um objeto na programação?", 1);
        aval1.adicionarQuestao(2, "Qual a importância de definir um atributo privado?", 2);
        aval1.adicionarQuestao(3, "Para que servem os getters e setters?", 2);

        System.out.println(disc1.toString());
    }
}