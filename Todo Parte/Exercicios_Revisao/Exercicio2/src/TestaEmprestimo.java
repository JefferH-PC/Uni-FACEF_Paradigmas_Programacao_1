import java.time.LocalDateTime;

public class TestaEmprestimo {
    public static void main(String[] args){
        Leitor leitor = new Leitor("Jeffer", 3);
        Livro livro = new Livro(15, "Sherlock Holmes","Arthur Conan Doyle");
        LocalDateTime dataEmprestimo = LocalDateTime.of(2025, 05, 22, 10, 00);
        LocalDateTime dataDevolucaoPrevista = LocalDateTime.of(2025, 06, 10, 9, 00);
        Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucaoPrevista, leitor, livro);

        System.out.println(emprestimo.toString());
    }
}
