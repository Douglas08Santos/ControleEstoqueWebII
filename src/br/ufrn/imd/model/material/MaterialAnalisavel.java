package br.ufrn.imd.model.material;

import java.math.BigDecimal;

import br.ufrn.imd.Producao.DenominacaoComumBrasileira;
import br.ufrn.imd.RH.Documento;

public class MaterialAnalisavel {
	private BigDecimal teorConcentracao;
	private int prazoEntrega;
	private DenominacaoComumBrasileira dcb;
	private String apresentacaoFarmaceutica;
	private BigDecimal volumeMinimo;
	private Documento fichaSeguranca;
	private long registroAnvisa;
	private BigDecimal qtdAmostraAnalise;
	private int tempoLimiteAnalise;
	private int testeMaquina;
	private Material material;
	/**
	 * @return the teorConcentracao
	 */
	public BigDecimal getTeorConcentracao() {
		return teorConcentracao;
	}
	/**
	 * @param teorConcentracao the teorConcentracao to set
	 */
	public void setTeorConcentracao(BigDecimal teorConcentracao) {
		this.teorConcentracao = teorConcentracao;
	}
	/**
	 * @return the prazoEntrega
	 */
	public int getPrazoEntrega() {
		return prazoEntrega;
	}
	/**
	 * @param prazoEntrega the prazoEntrega to set
	 */
	public void setPrazoEntrega(int prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}
	/**
	 * @return the dcb
	 */
	public DenominacaoComumBrasileira getDcb() {
		return dcb;
	}
	/**
	 * @param dcb the dcb to set
	 */
	public void setDcb(DenominacaoComumBrasileira dcb) {
		this.dcb = dcb;
	}
	/**
	 * @return the apresentacaoFarmaceutica
	 */
	public String getApresentacaoFarmaceutica() {
		return apresentacaoFarmaceutica;
	}
	/**
	 * @param apresentacaoFarmaceutica the apresentacaoFarmaceutica to set
	 */
	public void setApresentacaoFarmaceutica(String apresentacaoFarmaceutica) {
		this.apresentacaoFarmaceutica = apresentacaoFarmaceutica;
	}
	/**
	 * @return the volumeMinimo
	 */
	public BigDecimal getVolumeMinimo() {
		return volumeMinimo;
	}
	/**
	 * @param volumeMinimo the volumeMinimo to set
	 */
	public void setVolumeMinimo(BigDecimal volumeMinimo) {
		this.volumeMinimo = volumeMinimo;
	}
	/**
	 * @return the fichaSeguranca
	 */
	public Documento getFichaSeguranca() {
		return fichaSeguranca;
	}
	/**
	 * @param fichaSeguranca the fichaSeguranca to set
	 */
	public void setFichaSeguranca(Documento fichaSeguranca) {
		this.fichaSeguranca = fichaSeguranca;
	}
	/**
	 * @return the registroAnvisa
	 */
	public long getRegistroAnvisa() {
		return registroAnvisa;
	}
	/**
	 * @param registroAnvisa the registroAnvisa to set
	 */
	public void setRegistroAnvisa(long registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}
	/**
	 * @return the qtdAmostraAnalise
	 */
	public BigDecimal getQtdAmostraAnalise() {
		return qtdAmostraAnalise;
	}
	/**
	 * @param qtdAmostraAnalise the qtdAmostraAnalise to set
	 */
	public void setQtdAmostraAnalise(BigDecimal qtdAmostraAnalise) {
		this.qtdAmostraAnalise = qtdAmostraAnalise;
	}
	/**
	 * @return the tempoLimiteAnalise
	 */
	public int getTempoLimiteAnalise() {
		return tempoLimiteAnalise;
	}
	/**
	 * @param tempoLimiteAnalise the tempoLimiteAnalise to set
	 */
	public void setTempoLimiteAnalise(int tempoLimiteAnalise) {
		this.tempoLimiteAnalise = tempoLimiteAnalise;
	}
	/**
	 * @return the testeMaquina
	 */
	public int getTesteMaquina() {
		return testeMaquina;
	}
	/**
	 * @param testeMaquina the testeMaquina to set
	 */
	public void setTesteMaquina(int testeMaquina) {
		this.testeMaquina = testeMaquina;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apresentacaoFarmaceutica == null) ? 0 : apresentacaoFarmaceutica.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + prazoEntrega;
		result = prime * result + ((qtdAmostraAnalise == null) ? 0 : qtdAmostraAnalise.hashCode());
		result = prime * result + (int) (registroAnvisa ^ (registroAnvisa >>> 32));
		result = prime * result + tempoLimiteAnalise;
		result = prime * result + ((teorConcentracao == null) ? 0 : teorConcentracao.hashCode());
		result = prime * result + testeMaquina;
		result = prime * result + ((volumeMinimo == null) ? 0 : volumeMinimo.hashCode());
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
		MaterialAnalisavel other = (MaterialAnalisavel) obj;
		if (apresentacaoFarmaceutica == null) {
			if (other.apresentacaoFarmaceutica != null)
				return false;
		} else if (!apresentacaoFarmaceutica.equals(other.apresentacaoFarmaceutica))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (prazoEntrega != other.prazoEntrega)
			return false;
		if (qtdAmostraAnalise == null) {
			if (other.qtdAmostraAnalise != null)
				return false;
		} else if (!qtdAmostraAnalise.equals(other.qtdAmostraAnalise))
			return false;
		if (registroAnvisa != other.registroAnvisa)
			return false;
		if (tempoLimiteAnalise != other.tempoLimiteAnalise)
			return false;
		if (teorConcentracao == null) {
			if (other.teorConcentracao != null)
				return false;
		} else if (!teorConcentracao.equals(other.teorConcentracao))
			return false;
		if (testeMaquina != other.testeMaquina)
			return false;
		if (volumeMinimo == null) {
			if (other.volumeMinimo != null)
				return false;
		} else if (!volumeMinimo.equals(other.volumeMinimo))
			return false;
		return true;
	}
	
	
}
