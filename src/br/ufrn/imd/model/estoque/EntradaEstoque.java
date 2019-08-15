package br.ufrn.imd.model.estoque;

import java.util.Date;
import java.util.List;

import br.ufrn.imd.RH.Documento;
import br.ufrn.imd.RH.Usuario;
import br.ufrn.imd.enu.StatusMovimentacao;
import br.ufrn.imd.enu.TipoEntrada;
import br.ufrn.imd.model.ChecklistRecebimentoComum;
import br.ufrn.imd.model.ChecklistTransferencia;
import br.ufrn.imd.model.ConferenciaPesagem;
import br.ufrn.imd.model.NotaFiscal;
/*
 * MovimentacaoEntrada == movimentacaoEstoque??
 * */
public class EntradaEstoque {
	private String codigo;
	private List<MovimentacaoEstoque> itens;
	private StatusMovimentacao status;
	private String observacao;
	private Usuario responsavel;
	private Date dataCriacao;
	private Date dataEntrada;
	private List<Documento> anexos;
	private boolean precisaConferenciaEstado;
	private boolean precisaPesagem;
	private boolean precisaAnalise;
	private NotaFiscal notaFiscal;
	private ChecklistRecebimentoComum checklistRecebimento;
	private ConferenciaPesagem conferenciaPesagem;
	private ChecklistTransferencia checklistTransferencia;
	private String justificativa;
	private TipoEntrada tipoEntrada;
	
}
