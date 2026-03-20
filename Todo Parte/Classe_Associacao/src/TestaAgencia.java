import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args){
        Passageiro pas1 = new Passageiro("Fulano", "123");
        System.out.println(pas1.toString());

        LocalDateTime data = LocalDateTime.of(2026, 07, 14, 10, 15);
        Voo vo1 = new Voo(999, "Guarulhos", "Salvador", data);
        System.out.println(vo1.toString());

        Reserva res1 = new Reserva(145, LocalDateTime.now(), 56, pas1, vo1);
        System.out.println(res1.toString());
    }
}
