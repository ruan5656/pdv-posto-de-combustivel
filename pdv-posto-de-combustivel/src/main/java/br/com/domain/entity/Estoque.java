package br.com.domain.entity;

import java.math.BigDecimal;

public class Estoque{
    private BigDecimal quantidade;
    private String LocalTanque;
    private String LocalEndereco;
    private String LoteFabricacao;
    private String DataValidade;
    Estoque(BigDecimal quantidade,String LocalTanque,String LocalEndereco,String LoteFabricacao,String DataValidade){
        this.quantidade =quantidade;
        this.LocalTanque = LocalTanque;
        this.LocalEndereco = LocalEndereco;
        this.LoteFabricacao = LoteFabricacao;
        this.DataValidade = DataValidade;

    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public String getLocalTanque() {
        return LocalTanque;
    }

    public String getLocalEndereco() {
        return LocalEndereco;
    }

    public String getLoteFabricacao() {
        return LoteFabricacao;
    }

    public String getDataValidade() {
        return DataValidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public void setLocalTanque(String localTanque) {
        LocalTanque = localTanque;
    }

    public void setLocalEndereco(String localEndereco) {
        LocalEndereco = localEndereco;
    }

    public void setLoteFabricacao(String loteFabricacao) {
        LoteFabricacao = loteFabricacao;
    }

    public void setDataValidade(String dataValidade) {
        DataValidade = dataValidade;
    }
}
