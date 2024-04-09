package pedidosAoFornecedor;

public class PedidoAoFornecedor {

    private String produto;
    private int quantidade;

    public PedidoAoFornecedor(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}