import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args){
        Filme filme1 = new Filme(10, 120, "Batman", "Ação");
        Filme filme2 = new Filme(12, 60, "Duna", "Ação");
        LocalDateTime horario = LocalDateTime.of(2026, 07, 20, 20, 00);
        Sessao sessao = new Sessao(19, 8, horario);

        sessao.vincularFilme(filme1);
        sessao.venderIngresso(9, "A1", "Inteira", 10.00f);
        sessao.venderIngresso(8, "A2", "Meia", 5.00f);
        sessao.venderIngresso(5, "A3", "Inteira", 10.00f);

        System.out.println(sessao.toString());
    }
}
