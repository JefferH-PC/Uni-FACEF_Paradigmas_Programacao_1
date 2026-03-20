public class TestaProjeto {
    public static void main (String[] args){
        Programador prog1 = new Programador(15, "Pedro", "Java");
        Programador prog2 = new Programador(16, "João", "Python");
        Projeto projeto = new Projeto(15, "Site Trote Solidário");

        projeto.agregarProgramador(prog1);
        projeto.agregarProgramador(prog2);

        System.out.println(projeto.listarProgramadoresProjeto());
        System.out.println(projeto.toString());
    }
}
