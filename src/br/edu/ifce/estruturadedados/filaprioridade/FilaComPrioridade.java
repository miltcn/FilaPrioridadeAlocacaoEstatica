package br.edu.ifce.estruturadedados.filaprioridade;

public class FilaComPrioridade<T> implements TADFilaPrioridade<T>{

	private T[] fila;
	public int posicao;
	
	public FilaComPrioridade(int tamanho) {
		fila = (T[]) new Object[tamanho];
		posicao = -1;
		
	}
	
	@Override
	public void enfileira(T valor) {
		// TODO Auto-generated method stub
		Comparable<T> chave = (Comparable<T>) valor;
		
		int i;
		for (i = 0; i <= this.posicao; i++) {
			if (chave.compareTo(this.fila[i]) < 0) {
				break;
			}
		}
		adicionaMeio(valor, i);
	}
	
	@Override
	public T removeInicio() {
		//Realiza as validações
		if(filaVazia()) {
			System.out.println("Fila Vazia. Elemento não removido.");
			return null;
		}
		
		T elementoRemovido = fila[0];
		
		for (int i = 0; i < posicao; i++) {
			fila[i] = fila[i + 1];
		}
		
		fila[posicao--] = null;
		
		return elementoRemovido;
	}

	@Override
	public boolean filaCheia() {
		if (posicao == fila.length - 1) {
			return true;
		}
		return false;
	}


	@Override
	public boolean filaVazia() {
		return posicao == -1 ? true : false;
	}


	@Override
	public void imprimeFila() {
	//Realiza validações
		if (filaVazia()) {
			System.out.println("Fila Vazia. Não há elementos para impressão.");
			return;
		}
		
		for (int i = 0; i <= posicao; i++) {
			System.out.print(fila[i] + "\t");
		}
		
		System.out.println();
	}

	@Override
	public void adicionaMeio(T valor, int posicao) {
		if (posicao == (fila.length - 1)) {
			System.out.println("Não foi possível adicionar elemento no meio pois a lista está cheia.");
		}
		else if (posicao < 0 ||posicao > this.posicao + 1) {
			System.out.println("Elemento não adicionado. Posicão " + posicao + " Inválida");
		}
		else {
			for (int i = fila.length - 1; i > posicao; i--) {
				fila[i] = fila[i-1];
			}
			fila[posicao] = valor;
			this.posicao++;
	
		}
		
	}


		
}
