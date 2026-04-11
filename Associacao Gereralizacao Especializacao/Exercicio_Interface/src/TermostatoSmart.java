public class TermostatoSmart implements IDispositivoLigavel, ISensorTemperatura{

    private double temperatura;

    public TermostatoSmart() {
    }

    public TermostatoSmart(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando termostato... Dispositivo ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando termostato... Dispositivo desligado.");
    }

    @Override
    public double lerTemperatura() {
        return this.temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
