package model.states;

import model.enums.PedidoStateEnum;

public class PedidoProntoEntrega extends State{

    public PedidoProntoEntrega(Pedido pedido) {
        super(pedido);
    }

    @Override
    PedidoStateEnum getStatus() {
        return PedidoStateEnum.PRONTO_ENTREGA;
    }

    @Override
    Pedido getPedido() {
        return pedido;
    }

    void sairParaEntrega(){
        pedido.changeState(new PedidoRotaEntrega(pedido));
    }
}
