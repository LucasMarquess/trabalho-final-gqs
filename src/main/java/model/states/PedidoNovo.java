package model.states;

import model.descontos.Desconto;
import model.impostos.Imposto;
import model.ItemPedido;
import model.enums.PedidoStateEnum;

public class PedidoNovo extends State {

    PedidoNovo(Pedido pedido) {
        super(pedido);
    }

    @Override
    PedidoStateEnum getStatus() {
        return PedidoStateEnum.NOVO;
    }

    @Override
    Pedido getPedido() {
        return this.pedido;
    }

    void insereItem(ItemPedido item) {
        pedido.getItens().add(item);
    }

    void removeItem(ItemPedido item) {
        pedido.getItens().remove(item);
    }

    void concluirPedido() {
        this.calculaTotalPedido();
        this.calculaImpostos();
        this.calculaDescontos();
        pedido.changeState(new PedidoAguardandoPagamento(pedido));
    }

    void calculaTotalPedido() {
        Double total = 0.0;

        try {
            for(ItemPedido item: pedido.getItens()){
                if (item.getQuantidade() > 0){
                    item.setValorTotal(item.getValorUnitario() * item.getQuantidade());
                    total += item.getValorTotal();
                }
            }

            if (total > 0){
                pedido.setValorPedido(total);
            }
        } catch (RuntimeException ex) {
            throw (ex);
        }
    }

    void calculaImpostos() {
        Double total = 0.0;

        for(Imposto imposto: pedido.getImpostos()){
            imposto.setValor(pedido.getValorPedido() * imposto.getPercentual());
            pedido.setValorAPagar(pedido.getValorPedido() + imposto.getValor());
        }

    }

    void calculaDescontos(){
        Double total = 0.0;

        for(Desconto desconto: pedido.getDescontos()){
            desconto.setValorDesconto(pedido.getValorPedido() * desconto.getPercentual());
            pedido.setValorAPagar(pedido.getValorPedido() - desconto.getValorDesconto());
        }
    }

    void cancelarPedido() {
        pedido.changeState(new PedidoCanceladoCliente(pedido));
    }
}
