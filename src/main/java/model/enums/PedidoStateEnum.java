package model.enums;

public enum PedidoStateEnum {

    NOVO("Novo"),
    AGUARDANDO_PAGAMENTO("Aguardando Pagamento"),
    CONFIRMADO("Confirmado"),
    PRONTO_ENTREGA("Pronto para entrega"),
    EM_ROTA_ENTREGA("Em rota de entrega"),
    ENTREGUE("Entregue"),
    CANCELADO_CLIENTE("Cancelado pelo cliente"),
    CANCELADO_ESTABELECIMENTO("Cancelado pelo estabelecimento"),
    REEMBOLSADO("Reembolsado");

    private String descricao;

    PedidoStateEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
