package model.states;

import model.ItemPedido;
import model.enums.PedidoStateEnum;

public class PedidoCanceladoCliente extends State{

    public PedidoCanceladoCliente(Pedido pedido) {
        super(pedido);
    }

    @Override
    PedidoStateEnum getStatus() {
        return PedidoStateEnum.CANCELADO_CLIENTE;
    }

    @Override
    Pedido getPedido() {
        return pedido;
    }

    void reembolsar(){

        pedido.setValorAPagar(0.0);
        pedido.setValorPedido(0.0);
        pedido.setValorDescontos(0.0);
        pedido.setValorImpostos(0.0);

        this.baixaEstoque();
        pedido.changeState(new PedidoReembolsado(pedido));
    }

    void baixaEstoque(){
        for(ItemPedido item: pedido.getItens()){
            pedido.getProdutoDAO().adicionaEstoque(item.getProduto().getCodigo(), item.getQuantidade());
        }
    }
}
