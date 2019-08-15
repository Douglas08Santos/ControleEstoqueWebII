package br.ufrn.imd.model.material;

import java.math.BigDecimal;
import java.util.Date;

import br.ufrn.imd.Producao.OrdemProducao;
import br.ufrn.imd.RH.PessoaJuridica;
import br.ufrn.imd.enu.EstadoLote;

public class LoteMaterial {
	private Material material;
	private Date dataValidade;
	private Date dataFabricacao;
	private EstadoLote estado;
	private String numeroLoteFabricante;
	private String numeroLoteInterno;
	private String numeroLoteFornecedor;
	private int volumes;
	private OrdemProducao ordemProducao;
	private PessoaJuridica fabricante;
	private PessoaJuridica fornecedor;
	private int qtdCaixaEmbarque;
	private BigDecimal pesoBrutoTotal;
	private BigDecimal pesoLiquidoTotal;
	private BigDecimal tara;
	private double valorUnitario;
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
	 * @return the dataValidade
	 */
	public Date getDataValidade() {
		return dataValidade;
	}
	/**
	 * @param dataValidade the dataValidade to set
	 */
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	/**
	 * @return the dataFabricacao
	 */
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	/**
	 * @param dataFabricacao the dataFabricacao to set
	 */
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	/**
	 * @return the estado
	 */
	public EstadoLote getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoLote estado) {
		this.estado = estado;
	}
	/**
	 * @return the numeroLoteFabricante
	 */
	public String getNumeroLoteFabricante() {
		return numeroLoteFabricante;
	}
	/**
	 * @param numeroLoteFabricante the numeroLoteFabricante to set
	 */
	public void setNumeroLoteFabricante(String numeroLoteFabricante) {
		this.numeroLoteFabricante = numeroLoteFabricante;
	}
	/**
	 * @return the numeroLoteInterno
	 */
	public String getNumeroLoteInterno() {
		return numeroLoteInterno;
	}
	/**
	 * @param numeroLoteInterno the numeroLoteInterno to set
	 */
	public void setNumeroLoteInterno(String numeroLoteInterno) {
		this.numeroLoteInterno = numeroLoteInterno;
	}
	/**
	 * @return the numeroLoteFornecedor
	 */
	public String getNumeroLoteFornecedor() {
		return numeroLoteFornecedor;
	}
	/**
	 * @param numeroLoteFornecedor the numeroLoteFornecedor to set
	 */
	public void setNumeroLoteFornecedor(String numeroLoteFornecedor) {
		this.numeroLoteFornecedor = numeroLoteFornecedor;
	}
	/**
	 * @return the volumes
	 */
	public int getVolumes() {
		return volumes;
	}
	/**
	 * @param volumes the volumes to set
	 */
	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}
	/**
	 * @return the ordemProducao
	 */
	public OrdemProducao getOrdemProducao() {
		return ordemProducao;
	}
	/**
	 * @param ordemProducao the ordemProducao to set
	 */
	public void setOrdemProducao(OrdemProducao ordemProducao) {
		this.ordemProducao = ordemProducao;
	}
	/**
	 * @return the fabricante
	 */
	public PessoaJuridica getFabricante() {
		return fabricante;
	}
	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(PessoaJuridica fabricante) {
		this.fabricante = fabricante;
	}
	/**
	 * @return the fornecedor
	 */
	public PessoaJuridica getFornecedor() {
		return fornecedor;
	}
	/**
	 * @param fornecedor the fornecedor to set
	 */
	public void setFornecedor(PessoaJuridica fornecedor) {
		this.fornecedor = fornecedor;
	}
	/**
	 * @return the qtdCaixaEmbarque
	 */
	public int getQtdCaixaEmbarque() {
		return qtdCaixaEmbarque;
	}
	/**
	 * @param qtdCaixaEmbarque the qtdCaixaEmbarque to set
	 */
	public void setQtdCaixaEmbarque(int qtdCaixaEmbarque) {
		this.qtdCaixaEmbarque = qtdCaixaEmbarque;
	}
	/**
	 * @return the pesoBrutoTotal
	 */
	public BigDecimal getPesoBrutoTotal() {
		return pesoBrutoTotal;
	}
	/**
	 * @param pesoBrutoTotal the pesoBrutoTotal to set
	 */
	public void setPesoBrutoTotal(BigDecimal pesoBrutoTotal) {
		this.pesoBrutoTotal = pesoBrutoTotal;
	}
	/**
	 * @return the pesoLiquidoTotal
	 */
	public BigDecimal getPesoLiquidoTotal() {
		return pesoLiquidoTotal;
	}
	/**
	 * @param pesoLiquidoTotal the pesoLiquidoTotal to set
	 */
	public void setPesoLiquidoTotal(BigDecimal pesoLiquidoTotal) {
		this.pesoLiquidoTotal = pesoLiquidoTotal;
	}
	/**
	 * @return the tara
	 */
	public BigDecimal getTara() {
		return tara;
	}
	/**
	 * @param tara the tara to set
	 */
	public void setTara(BigDecimal tara) {
		this.tara = tara;
	}
	/**
	 * @return the valorUnitario
	 */
	public double getValorUnitario() {
		return valorUnitario;
	}
	/**
	 * @param valorUnitario the valorUnitario to set
	 */
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataFabricacao == null) ? 0 : dataFabricacao.hashCode());
		result = prime * result + ((dataValidade == null) ? 0 : dataValidade.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((numeroLoteFabricante == null) ? 0 : numeroLoteFabricante.hashCode());
		result = prime * result + ((numeroLoteFornecedor == null) ? 0 : numeroLoteFornecedor.hashCode());
		result = prime * result + ((numeroLoteInterno == null) ? 0 : numeroLoteInterno.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoteMaterial other = (LoteMaterial) obj;
		if (dataFabricacao == null) {
			if (other.dataFabricacao != null)
				return false;
		} else if (!dataFabricacao.equals(other.dataFabricacao))
			return false;
		if (dataValidade == null) {
			if (other.dataValidade != null)
				return false;
		} else if (!dataValidade.equals(other.dataValidade))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (numeroLoteFabricante == null) {
			if (other.numeroLoteFabricante != null)
				return false;
		} else if (!numeroLoteFabricante.equals(other.numeroLoteFabricante))
			return false;
		if (numeroLoteFornecedor == null) {
			if (other.numeroLoteFornecedor != null)
				return false;
		} else if (!numeroLoteFornecedor.equals(other.numeroLoteFornecedor))
			return false;
		if (numeroLoteInterno == null) {
			if (other.numeroLoteInterno != null)
				return false;
		} else if (!numeroLoteInterno.equals(other.numeroLoteInterno))
			return false;
		return true;
	}
	
	
	
}
