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
	
	
}
