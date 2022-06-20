package model.states;

import model.enums.PedidoStateEnum;

public class PedidoConfirmado extends State{

    public PedidoConfirmado(Pedido pedido) {
        super(pedido);
    }

    @Override
    PedidoStateEnum getStatus() {
        return PedidoStateEnum.CONFIRMADO;
    }

    @Override
    Pedido getPedido() {
        return pedido;
    }

    void preparar(){
        pedido.changeState(new PedidoProntoEntrega(pedido));
    }

    void cancelarPedido(){
        pedido.changeState(new PedidoCanceladoEstabelecimento(pedido));
    }
}
