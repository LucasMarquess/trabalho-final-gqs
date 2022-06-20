package model.states;

import model.ItemPedido;
import model.enums.PedidoStateEnum;

public class PedidoAguardandoPagamento extends State {

    public PedidoAguardandoPagamento(Pedido pedido) {
        super(pedido);
    }

    @Override
    PedidoStateEnum getStatus() {
        return PedidoStateEnum.AGUARDANDO_PAGAMENTO;
    }

    @Override
    Pedido getPedido() {
        return pedido;
    }

    void pagar(){
        this.baixaEstoque();
        pedido.changeState(new PedidoConfirmado(pedido));
    }

    void baixaEstoque(){
        for(ItemPedido item: pedido.getItens()){
            pedido.getProdutoDAO().baixaEstoque(item.getProduto().getCodigo(), item.getQuantidade());
        }
    }

    void cancelarPedido(){
        pedido.changeState(new PedidoCanceladoEstabelecimento(pedido));
    }
}
