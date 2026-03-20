import java.time.LocalDateTime;

public class TestaConsulta {
    public static void main (String[] args){
        LocalDateTime data = LocalDateTime.of(2026, 05, 20, 10, 00);
        Medico medico = new Medico(15, "Pedro", "Cirurgião");
        Paciente paciente = new Paciente(78, "João", "123.456.789-10");
        Consulta consulta = new Consulta(data, 150.00f, medico, paciente);
        System.out.println(consulta.toString());
    }
}
