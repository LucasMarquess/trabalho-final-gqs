package model.states;

import model.enums.PedidoStateEnum;

public abstract class State {
    Pedido pedido;

    State(Pedido pedido){
        this.pedido = pedido;
    }

    //FUNÇOES DOS ESTADOS AQUI
    abstract PedidoStateEnum getStatus();
    abstract Pedido getPedido();

}
