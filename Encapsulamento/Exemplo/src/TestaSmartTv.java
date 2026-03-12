public class TestaSmartTv {
    public static void main(String[] args){
        SmartTv obj1 = new SmartTv();

        System.out.println(obj1.toString());

        obj1.setVolume(120);
        obj1.setVolume(30);
        obj1.abrirYoutube();

        System.out.println("Volume da TV: " + obj1.getVolume());

        SmartTv obj2 = new SmartTv("Samsung", "Oled 32", -30);

        System.out.println(obj2.toString());

        obj2.abrirYoutube();

        obj2.aumentarVolume(10);
        System.out.println(obj2.toString());

        obj2.diminuirVolume(5);
        System.out.println(obj2.toString());
    }
}