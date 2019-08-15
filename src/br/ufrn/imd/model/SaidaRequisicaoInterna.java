package br.ufrn.imd.model;

import java.util.List;

import br.ufrn.imd.RH.Setor;
import br.ufrn.imd.RH.Usuario;
import br.ufrn.imd.enu.StatusRequisicao;
import br.ufrn.imd.model.estoque.SaidaEstoque;

public class SaidaRequisicaoInterna {
	private String codigo;
	private Usuario requisitante;
	private Setor setorRequisitante;
	private Usuario responsavelSetor;
	private StatusRequisicao statusRequisicao;
	private List<ItemRequisicao> itensRequisicao;
	private List<HistoricoRequisicao> historicoRequisicao;
	private SaidaEstoque saidaEstoque;
}
