package br.edu.ifce.estruturadedados.filaprioridade;

public class TesteFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FilaComPrioridade<Integer> filaP = new FilaComPrioridade<>(10);
		filaP.enfileira(4);
		filaP.imprimeFila();
		
		filaP.enfileira(5);
		filaP.imprimeFila();
		
		filaP.enfileira(2);
		filaP.imprimeFila();
		
		filaP.enfileira(12);
		filaP.imprimeFila();
		
		filaP.enfileira(34);
		filaP.imprimeFila();
		
		filaP.removeInicio();
		filaP.imprimeFila();
		
		System.out.println();
		
		FilaComPrioridade<Paciente> filaP1 = new FilaComPrioridade<>(10);
		filaP1.enfileira(new Paciente("Rafael", 2));
		filaP1.enfileira(new Paciente("Romario", 1));
		filaP1.enfileira(new Paciente("Carlos", 3));
		
		filaP1.imprimeFila();
		
		filaP1.removeInicio();
		filaP1.imprimeFila();
		
	}

}
