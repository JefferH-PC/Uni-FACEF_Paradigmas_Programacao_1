public class TestaTime {
    public static void main(String[] args){
        Atleta atleta = new Atleta(15, "Rafael Mineiro","Ala-Pivô");
        Time time = new Time(16, "Sesi Franca Basquete", "Helinho Garcia");
        time.contratarAtleta(atleta);

        System.out.println(time.toString());
        time = null;
        System.out.println("Atleta continua existindo após anulação do time: " + atleta.toString());
    }
}
