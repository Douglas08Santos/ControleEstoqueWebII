package br.ufrn.imd.model.estoque;

import java.util.Date;
import java.util.List;

import br.ufrn.imd.RH.Documento;
import br.ufrn.imd.RH.MovimentacaoSaida;
import br.ufrn.imd.RH.PessoaJuridica;
import br.ufrn.imd.RH.Usuario;
import br.ufrn.imd.enu.StatusMovimentacao;
import br.ufrn.imd.model.GuiaRemessa;

public class SaidaEstoque {
	private Usuario responsavel;
	private Date dataEnvio;
	private Date dataCriacao;
	private List<MovimentacaoSaida> itens;
	private StatusMovimentacao status;
	private String observacoes;
	private PessoaJuridica transportadora;
	private List<Documento> anexos;
	private GuiaRemessa guiaRemessa;
	private PessoaJuridica pjDestinatario;
	private String justificativa;
	
}
