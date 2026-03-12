public class TestaCarro {
    public static void main(String args[]){
        // Cria uma instância da classe Carro - objeto
        Carro obj1 = new Carro("Fiat","Uno");
        // Exibe os dados
        System.out.println(obj1.toString());
        obj1.ligar();


        Carro obj2 = new Carro("GM","Onix");
        // Exibe os dados
        System.out.println(obj2.toString());
        obj2.ligar();
        obj2.acelerar(120);
        System.out.println(obj2.toString());


        Carro obj3 = new Carro("Toyota", "SW4");
        // Exibe os dados
        System.out.println(obj3.toString());
        obj3.ligar();
        obj3.acelerar(80);
        System.out.println(obj3.toString());

        obj1.desligar();
        obj2.desligar();
        obj3.desligar();
    }
}
