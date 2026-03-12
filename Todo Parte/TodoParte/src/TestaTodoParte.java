import java.util.Date;

public class TestaTodoParte {
    public static void main(String[] args){
        Cliente cl1 = new Cliente(100, "Fulano", "123", "Rua 10");
        Pedido ped1 = new Pedido(1, new Date(), cl1);
        Produto prod1 = new Produto(1, "Eficiente", "PC", 1500.00f);
        Produto prod2 = new Produto(2, "mouse óptico", "mouse", 199.90f);

        ped1.adicionaItemPedido(1, 2, prod1);
        ped1.adicionaItemPedido(2, 5, prod2);

        System.out.println(ped1.toString());
    }
}