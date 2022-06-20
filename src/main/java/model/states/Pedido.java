package model.states;

import dao.ProdutoDAO;
import model.descontos.Desconto;
import model.impostos.Imposto;
import model.ItemPedido;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {

    private State state;

    private Integer numero;
    private LocalDateTime data;
    private Double valorAPagar;
    private Double valorPedido;
    private Double valorDescontos;
    private Double valorImpostos;
    private ArrayList<ItemPedido> itens;
    private ArrayList<Desconto> descontos;
    private ArrayList<Imposto> impostos;
    private Integer avaliacao;

    private ProdutoDAO produtoDAO;

    public Pedido(Integer numero) {
        this.itens = new ArrayList<>();
        this.descontos = new ArrayList<>();
        this.impostos = new ArrayList<>();
        this.numero = numero;
        this.data = LocalDateTime.now();
        this.state = new PedidoNovo(this);
        this.produtoDAO = ProdutoDAO.getInstance();

    }

    void changeState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public Integer getNumero() {
        return numero;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Double getValorAPagar() {
        return valorAPagar;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public ProdutoDAO getProdutoDAO() {
        return produtoDAO;
    }

    public void setValorAPagar(Double valorTotal) {
        this.valorAPagar = valorTotal;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setValorPedido(Double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public void setValorDescontos(Double valorDescontos) {
        this.valorDescontos = valorDescontos;
    }

    public void setValorImpostos(Double valorImpostos) {
        this.valorImpostos = valorImpostos;
    }

    public Double getValorPedido() {
        return valorPedido;
    }

    public Double getValorDescontos() {
        return valorDescontos;
    }

    public Double getValorImpostos() {
        return valorImpostos;
    }

    public ArrayList<Desconto> getDescontos() {
        return descontos;
    }

    public ArrayList<Imposto> getImpostos() {
        return impostos;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }
}
