package br.ufrn.imd.model;

import java.math.BigDecimal;

import br.ufrn.imd.RH.UnidadeMedida;
import br.ufrn.imd.model.material.Material;

public class ItemRequisicao {
	private Material material;
	private BigDecimal qtdRequisitada;
	private BigDecimal qtdAtendida;
	private UnidadeMedida unidadeMedida;
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
	 * @return the qtdRequisitada
	 */
	public BigDecimal getQtdRequisitada() {
		return qtdRequisitada;
	}
	/**
	 * @param qtdRequisitada the qtdRequisitada to set
	 */
	public void setQtdRequisitada(BigDecimal qtdRequisitada) {
		this.qtdRequisitada = qtdRequisitada;
	}
	/**
	 * @return the qtdAtendida
	 */
	public BigDecimal getQtdAtendida() {
		return qtdAtendida;
	}
	/**
	 * @param qtdAtendida the qtdAtendida to set
	 */
	public void setQtdAtendida(BigDecimal qtdAtendida) {
		this.qtdAtendida = qtdAtendida;
	}
	/**
	 * @return the unidadeMedida
	 */
	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}
	/**
	 * @param unidadeMedida the unidadeMedida to set
	 */
	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((qtdAtendida == null) ? 0 : qtdAtendida.hashCode());
		result = prime * result + ((qtdRequisitada == null) ? 0 : qtdRequisitada.hashCode());
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
		ItemRequisicao other = (ItemRequisicao) obj;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (qtdAtendida == null) {
			if (other.qtdAtendida != null)
				return false;
		} else if (!qtdAtendida.equals(other.qtdAtendida))
			return false;
		if (qtdRequisitada == null) {
			if (other.qtdRequisitada != null)
				return false;
		} else if (!qtdRequisitada.equals(other.qtdRequisitada))
			return false;
		return true;
	}
	
	
	
	
}
