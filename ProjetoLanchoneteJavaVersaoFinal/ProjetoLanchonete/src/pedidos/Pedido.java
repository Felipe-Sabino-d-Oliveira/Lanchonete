package pedidos;

import java.util.ArrayList;
import java.util.List;

import produto.ProdutoDisponivel;

public class Pedido{
	
	private int numeroPedido;
    private String nomeCliente;
    private List<Integer> quantidades;
    private String[] produtosSelecionados;
    private ArrayList<ProdutoDisponivel> produtosDisponiveis;
    private String status;
    private String descricao;

    public Pedido(int numeroPedido, String nomeCliente, List<Integer> quantidades, String[] produtosSelecionados, ArrayList<ProdutoDisponivel> produtosDisponiveis) {
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.quantidades = quantidades;
        this.produtosSelecionados = produtosSelecionados;
        this.produtosDisponiveis = produtosDisponiveis;
        this.status = "Pedido em andamento";
        this.descricao = "";
    }
    public List<Integer> getQuantidades() {
        return quantidades;
    }
    public String[] getProdutosSelecionados() {
        return produtosSelecionados;
    }
    public ArrayList<ProdutoDisponivel> getProdutosDisponiveis() {
        return produtosDisponiveis;
    }
    public int getNumeroPedido() {
        return numeroPedido;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}