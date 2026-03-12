public class TestaDrone {
    public static void main(String[] args) {
        Drone d1 = new Drone("DR-01", 0, 15, false);

        d1.decolar();

        System.out.println("Em voo - " + d1.getEmVoo());

        Drone d2 = new Drone("DR-02", 0, 100, false);

        d2.decolar();
        System.out.println("Em voo - " + d2.getEmVoo());
        d2.subir(110);
        System.out.println("Altura atual: " + d2.getAltura() + "m");

        d2.subir(10);
        System.out.println("Altura atual: " + d2.getAltura() + "m");

        d2.descer(120);
    }
}