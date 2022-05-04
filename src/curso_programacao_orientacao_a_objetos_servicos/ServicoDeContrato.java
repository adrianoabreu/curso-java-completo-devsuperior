package curso_programacao_orientacao_a_objetos_servicos;

import java.util.Calendar;
import java.util.Date;

import curso_programacao_orientacao_a_objetos_entidades.Contrato;
import curso_programacao_orientacao_a_objetos_entidades.Parcelas;

public class ServicoDeContrato {
	
	// Associa��o da Interface
	private ServicoDePagamentoOnline spo; // invers�o de controle e inje��o de depend�ncia.
	
	public ServicoDeContrato(ServicoDePagamentoOnline spo) {
		this.spo = spo;
	}

	public void processarContrato(Contrato contrato, Integer meses) {
		Double valorParcelaBasica           = contrato.getValor() / meses;
		for(int i = 1; i <= meses; i++) {
			Double valorDaParcelaAtualizada = valorParcelaBasica       + spo.jurosMensal(valorParcelaBasica, i);
			Double valorTotalDaParcela      = valorDaParcelaAtualizada + spo.taxaDePagamento(valorDaParcelaAtualizada);
			Date dataVencimento             = adicionarMeses(contrato.getData(), i);
			contrato.getLista().add(new Parcelas(dataVencimento,valorTotalDaParcela));
		}
	}
	
	// Metodo auxiliar criado para incrementar m�ses a partir da data do Contrato.
	private Date adicionarMeses(Date data, Integer n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
				
		return cal.getTime();
	}
	
}
