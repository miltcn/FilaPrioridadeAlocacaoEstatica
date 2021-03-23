package br.edu.ifce.estruturadedados.filaprioridade;

public interface TADFilaPrioridade<T> {
	/**
	 * Opera��es principais
	 */
	public void enfileira(T valor);
	public T removeInicio();
	public void adicionaMeio(T valor, int posicao);
	
	/**
	 * Opera��es secund�rias
	 */
	public boolean filaCheia();
	public boolean filaVazia();
	
	public void imprimeFila();
}
