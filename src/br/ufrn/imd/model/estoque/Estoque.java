package br.ufrn.imd.model.estoque;

import java.math.BigDecimal;
import java.util.List;

import br.ufrn.imd.model.Almoxarifado;
import br.ufrn.imd.model.material.LoteMaterial;
import br.ufrn.imd.model.material.Material;

public class Estoque {
	private BigDecimal qtdAtual;
	private Almoxarifado almoxarifado;
	private LoteMaterial lote;
	private Material material;
	private BigDecimal qtdMaxima;
	private List<MovimentacaoEstoque> historicoMovimentacoes;
	/**
	 * @return the qtdAtual
	 */
	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}
	/**
	 * @param qtdAtual the qtdAtual to set
	 */
	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}
	/**
	 * @return the almoxarifado
	 */
	public Almoxarifado getAlmoxarifado() {
		return almoxarifado;
	}
	/**
	 * @param almoxarifado the almoxarifado to set
	 */
	public void setAlmoxarifado(Almoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
	}
	/**
	 * @return the lote
	 */
	public LoteMaterial getLote() {
		return lote;
	}
	/**
	 * @param lote the lote to set
	 */
	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}
	/**
	 * @return the material
	 */
	public Material getMaterial() {
		return material;
	}
	/**
	 * @param material the material to set
	 */
	public void setMaterial(Material material) {
		this.material = material;
	}
	/**
	 * @return the qtdMaxima
	 */
	public BigDecimal getQtdMaxima() {
		return qtdMaxima;
	}
	/**
	 * @param qtdMaxima the qtdMaxima to set
	 */
	public void setQtdMaxima(BigDecimal qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}
	/**
	 * @return the historicoMovimentacoes
	 */
	public List<MovimentacaoEstoque> getHistoricoMovimentacoes() {
		return historicoMovimentacoes;
	}
	/**
	 * @param historicoMovimentacoes the historicoMovimentacoes to set
	 */
	public void setHistoricoMovimentacoes(List<MovimentacaoEstoque> historicoMovimentacoes) {
		this.historicoMovimentacoes = historicoMovimentacoes;
	}
	
	
}
