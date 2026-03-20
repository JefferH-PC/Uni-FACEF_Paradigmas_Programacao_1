public class ItemVenda {
    private int id, quantidade;
    private Produto produto;

    public ItemVenda() {
    }
    public ItemVenda(int id, int quantidade, Produto p) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = p;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }
}
