package br.ufrn.imd.model;

import java.math.BigDecimal;
import java.util.Date;

import br.ufrn.imd.RH.PessoaJuridica;

public class NotaFiscal {
	private int serieNF;
	private int numeroNF;
	private PessoaJuridica transportadora;
	private String motorista;
	private String placaVeiculo;
	private Date dataEmissao;
	private PessoaJuridica emitente;
	private PessoaJuridica destinatario;
	private BigDecimal valorTotal;
		

}
