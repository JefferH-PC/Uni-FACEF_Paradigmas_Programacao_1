import java.util.ArrayList;

public class Venda {
    private int id;
    private Cliente cliente;
    private ArrayList<ItemVenda> itensVenda;

    public Venda() {
    }
    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itensVenda = new ArrayList<ItemVenda>();
    }

    public void adicionarItem(int idItem, int qtd, Produto p) {
        ItemVenda aux = new ItemVenda(idItem, qtd, p);
        this.itensVenda.add(aux);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getItensVenda() {
        return itensVenda;
    }
    public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", itensVenda=" + itensVenda +
                '}';
    }
}
