import java.util.ArrayList;
import java.util.List;

public class Testa_Dispositivos {
    public static void main(String[] args) {
        FechaduraEletronica fechadura = new FechaduraEletronica("1234");
        TermostatoSmart termostato = new TermostatoSmart(25.5);

        List<IDispositivoLigavel> dispositivos = new ArrayList<>();
        dispositivos.add(fechadura);
        dispositivos.add(termostato);

        for (IDispositivoLigavel dispositivo : dispositivos) {
            dispositivo.ligar();
            dispositivo.desligar();
        }

        fechadura.validarAcesso("1234");
        fechadura.ligar();

        System.out.println("Temperatura: " + termostato.lerTemperatura() + " ºC");
    }
}