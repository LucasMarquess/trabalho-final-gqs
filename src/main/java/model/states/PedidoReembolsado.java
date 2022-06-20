package model.states;

import model.enums.PedidoStateEnum;

public class PedidoReembolsado extends State {

    public PedidoReembolsado(Pedido pedido) {
        super(pedido);
    }

    @Override
    PedidoStateEnum getStatus() {
        return PedidoStateEnum.REEMBOLSADO;
    }

    @Override
    Pedido getPedido() {
        return pedido;
    }

    public void avaliarPedido(Integer nota){
        this.pedido.setAvaliacao(nota);
    }
}
