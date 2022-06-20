package model.builders;

import dao.ProdutoDAO;
import model.ItemPedido;

import java.util.ArrayList;

public class CestaBasicaTopBuilder implements Builder {
    private ProdutoDAO produtoDAO;
    private ArrayList<ItemPedido> itens;

    public CestaBasicaTopBuilder() {
        this.produtoDAO = ProdutoDAO.getInstance();
        itens = new ArrayList<>();
    }

    @Override
    public void insereItens() {
        //CARNES
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(28)));
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(29)));
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(30)));
        //LEITE
        itens.add(new ItemPedido(8, produtoDAO.buscaProdutoPorCodigo(32)));
        //ARROZ
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(3)));
        //FEIJAO
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(11)));
        //FARINHA DE TRIGO
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(9)));
        //CAFÉ
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(6)));
        //ÓLEO
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(17)));
        //MANTEIGA
        itens.add(new ItemPedido(8, produtoDAO.buscaProdutoPorCodigo(33)));
        //AÇUCAR
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(2)));
        //PÃO
        itens.add(new ItemPedido(6, produtoDAO.buscaProdutoPorCodigo(34)));
        //BATATA
        itens.add(new ItemPedido(6, produtoDAO.buscaProdutoPorCodigo(35)));
        //TOMATE
        itens.add(new ItemPedido(9, produtoDAO.buscaProdutoPorCodigo(36)));
        //BANANA
        itens.add(new ItemPedido(8, produtoDAO.buscaProdutoPorCodigo(37)));
        //ACHOCOLATADO
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(1)));
        //CREAM CRACKER
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(4)));
        //OVOS
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(31)));
        //SABONETE
        itens.add(new ItemPedido(4, produtoDAO.buscaProdutoPorCodigo(27)));
        //PAPEL HIGIÊNICO
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(26)));
        //CREME DENTAL
        itens.add(new ItemPedido(3, produtoDAO.buscaProdutoPorCodigo(24)));
        //SAL
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(20)));
        //MACARRÃO
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(14)));
        //FEIJAO
        itens.add(new ItemPedido(2, produtoDAO.buscaProdutoPorCodigo(11)));
        //FUBA
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(12)));
        //TEMPERO
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(22)));
        //DESINFETANTE
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(25)));
        //FARINHA
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(10)));
        //DESINFETANTE
        itens.add(new ItemPedido(1, produtoDAO.buscaProdutoPorCodigo(25)));
        //BISCOITO
        itens.add(new ItemPedido(5, produtoDAO.buscaProdutoPorCodigo(4)));
    }
}
