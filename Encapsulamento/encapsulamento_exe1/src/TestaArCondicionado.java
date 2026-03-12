public class TestaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado ar1 = new ArCondicionado("Samsung", "WindFree", 22, true);

        System.out.println(ar1.toString());

        ar1.setTemperatura(35);

        ar1.setMarca("LG");
        System.out.println("Estado: " + ar1.toString());

        System.out.println("Temperatura atual: " + ar1.getTemperatura() + "°C");

        ar1.ativarModoTurbo();

        System.out.println("Estado: " + ar1.toString());
    }
}