public class TestaVenda {
    public static void main(String[] args) {
        Produto p1 = new Produto(3500.00f, "Notebook",1 );
        Produto p2 = new Produto(150.00f, "Mouse", 2);
        Cliente cliente = new Cliente(101, "Lucas");

        Venda venda = new Venda(1, cliente);

        venda.adicionarItem(1, 1, p1);
        venda.adicionarItem(2, 2, p2);

        System.out.println(venda.toString());
    }
}
