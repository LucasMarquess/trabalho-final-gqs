package model.states;

import model.enums.PedidoStateEnum;

public class PedidoRotaEntrega extends State{

    public PedidoRotaEntrega(Pedido pedido) {
        super(pedido);
    }

    @Override
    PedidoStateEnum getStatus() {
        return PedidoStateEnum.EM_ROTA_ENTREGA;
    }

    @Override
    Pedido getPedido() {
        return pedido;
    }

    void entregue(){
        pedido.changeState(new PedidoEntregue(pedido));
    }
}
