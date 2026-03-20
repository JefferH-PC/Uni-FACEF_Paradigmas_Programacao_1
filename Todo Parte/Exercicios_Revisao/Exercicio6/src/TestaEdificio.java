public class TestaEdificio {
    public static void main (String[] args){
        Edificio edificio = new Edificio("Arconia", "Nova York");
        edificio.construirApartamento(14, 3);
        edificio.construirApartamento(10, 4);
        edificio.construirApartamento(12, 5);
        System.out.println(edificio.toString());
    }
}
