package br.ufrn.imd.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import br.ufrn.imd.RH.Documento;
import br.ufrn.imd.RH.Endereco;
import br.ufrn.imd.model.material.Material;

public class ChecklistTransferencia {
	private Material material;
	private BigDecimal qtd;
	private Endereco local;
	private Date dataConferencia;
	private String observacoes;
	private List<Documento> anexoFotos;
	boolean aprovado;
	
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
	 * @return the qtd
	 */
	public BigDecimal getQtd() {
		return qtd;
	}
	/**
	 * @param qtd the qtd to set
	 */
	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}
	/**
	 * @return the local
	 */
	public Endereco getLocal() {
		return local;
	}
	/**
	 * @param local the local to set
	 */
	public void setLocal(Endereco local) {
		this.local = local;
	}
	/**
	 * @return the dataConferencia
	 */
	public Date getDataConferencia() {
		return dataConferencia;
	}
	/**
	 * @param dataConferencia the dataConferencia to set
	 */
	public void setDataConferencia(Date dataConferencia) {
		this.dataConferencia = dataConferencia;
	}
	/**
	 * @return the observacoes
	 */
	public String getObservacoes() {
		return observacoes;
	}
	/**
	 * @param observacoes the observacoes to set
	 */
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	/**
	 * @return the anexoFotos
	 */
	public List<Documento> getAnexoFotos() {
		return anexoFotos;
	}
	/**
	 * @param anexoFotos the anexoFotos to set
	 */
	public void setAnexoFotos(List<Documento> anexoFotos) {
		this.anexoFotos = anexoFotos;
	}
	/**
	 * @return the aprovado
	 */
	public boolean isAprovado() {
		return aprovado;
	}
	/**
	 * @param aprovado the aprovado to set
	 */
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anexoFotos == null) ? 0 : anexoFotos.hashCode());
		result = prime * result + (aprovado ? 1231 : 1237);
		result = prime * result + ((dataConferencia == null) ? 0 : dataConferencia.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((observacoes == null) ? 0 : observacoes.hashCode());
		result = prime * result + ((qtd == null) ? 0 : qtd.hashCode());
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
		ChecklistTransferencia other = (ChecklistTransferencia) obj;
		if (anexoFotos == null) {
			if (other.anexoFotos != null)
				return false;
		} else if (!anexoFotos.equals(other.anexoFotos))
			return false;
		if (aprovado != other.aprovado)
			return false;
		if (dataConferencia == null) {
			if (other.dataConferencia != null)
				return false;
		} else if (!dataConferencia.equals(other.dataConferencia))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (observacoes == null) {
			if (other.observacoes != null)
				return false;
		} else if (!observacoes.equals(other.observacoes))
			return false;
		if (qtd == null) {
			if (other.qtd != null)
				return false;
		} else if (!qtd.equals(other.qtd))
			return false;
		return true;
	}
	
	
	
	
}
