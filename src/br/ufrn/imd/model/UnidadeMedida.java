package br.ufrn.imd.model;

public class UnidadeMedida {
	private String nome;
	private String abreviacao;
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the abreviacao
	 */
	public String getAbreviacao() {
		return abreviacao;
	}
	/**
	 * @param abreviacao the abreviacao to set
	 */
	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abreviacao == null) ? 0 : abreviacao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		UnidadeMedida other = (UnidadeMedida) obj;
		if (abreviacao == null) {
			if (other.abreviacao != null)
				return false;
		} else if (!abreviacao.equals(other.abreviacao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}
