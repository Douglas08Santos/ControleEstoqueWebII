package br.ufrn.imd.model;

public class DadosPagamento {
	private String banco;
	private String agencia;
	private String conta;
	private String codigoIdentificacaoDV;
	/**
	 * @return the banco
	 */
	public String getBanco() {
		return banco;
	}
	/**
	 * @param banco the banco to set
	 */
	public void setBanco(String banco) {
		this.banco = banco;
	}
	/**
	 * @return the agencia
	 */
	public String getAgencia() {
		return agencia;
	}
	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	/**
	 * @return the conta
	 */
	public String getConta() {
		return conta;
	}
	/**
	 * @param conta the conta to set
	 */
	public void setConta(String conta) {
		this.conta = conta;
	}
	/**
	 * @return the codigoIdentificacaoDV
	 */
	public String getCodigoIdentificacaoDV() {
		return codigoIdentificacaoDV;
	}
	/**
	 * @param codigoIdentificacaoDV the codigoIdentificacaoDV to set
	 */
	public void setCodigoIdentificacaoDV(String codigoIdentificacaoDV) {
		this.codigoIdentificacaoDV = codigoIdentificacaoDV;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + ((banco == null) ? 0 : banco.hashCode());
		result = prime * result + ((codigoIdentificacaoDV == null) ? 0 : codigoIdentificacaoDV.hashCode());
		result = prime * result + ((conta == null) ? 0 : conta.hashCode());
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
		DadosPagamento other = (DadosPagamento) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (banco == null) {
			if (other.banco != null)
				return false;
		} else if (!banco.equals(other.banco))
			return false;
		if (codigoIdentificacaoDV == null) {
			if (other.codigoIdentificacaoDV != null)
				return false;
		} else if (!codigoIdentificacaoDV.equals(other.codigoIdentificacaoDV))
			return false;
		if (conta == null) {
			if (other.conta != null)
				return false;
		} else if (!conta.equals(other.conta))
			return false;
		return true;
	}
	
	
	
}
