package br.edu.ifce.estruturadedados.filaprioridade;

public interface TADFilaPrioridade<T> {
	/**
	 * Operações principais
	 */
	public void enfileira(T valor);
	public T removeInicio();
	public void adicionaMeio(T valor, int posicao);
	
	/**
	 * Operações secundárias
	 */
	public boolean filaCheia();
	public boolean filaVazia();
	
	public void imprimeFila();
}
