package entidades;

import java.util.ArrayList;
import java.util.List;

import pedidosAoFornecedor.PedidoAoFornecedor;

public class Fornecedor {

    private String nomeEmpresa;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String email;
    private String produtoFornecido;
    private List<PedidoAoFornecedor> pedidosEmAndamento;

    public Fornecedor(String cnpj, String nomeEmpresa, String endereco, String telefone, String email, String produtoFornecido) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.produtoFornecido = produtoFornecido;
        this.pedidosEmAndamento = new ArrayList<>();
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getProdutoFornecido() {
        return produtoFornecido;
    }

    public List<PedidoAoFornecedor> getPedidosEmAndamento() {
        return pedidosEmAndamento;
    }
}