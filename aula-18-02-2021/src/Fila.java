public class Fila {
	private int colecao[];
	private int comeco;
	private int fim;

	Fila() {
		comeco = -1;
		fim = -1;
		colecao = new int[20];
	}

	public boolean inserir(int novo) {
		int aux;
		aux = (fim + 1) % colecao.length;
		if (comeco != aux) {
			fim = aux;
			colecao[aux] = novo;
			if (comeco < 0) {
				comeco = 0;
			}
			return true;
		}
		return false;
	}

	public int retirar() {
		int volta = -999;
		if (comeco >= 0) {
			volta = colecao[comeco];
			if (comeco == fim) {
				comeco = -1;
				fim = -1;
			} else {
				comeco = (comeco + 1) % colecao.length;
			}
		}
		return volta;
	}

	public boolean procurar(int procurado) {
		for(int i=0; i<colecao.length;i++) {
			if (procurado == colecao[i]) {
				return true;
			}
		}
		return false;
	}

	public void detonar() {
		comeco = -1;
		fim = -1;
	}

	public void mostrar() {
		if (comeco == -1 && fim == -1) {
			System.out.println("A colecao esta vazia");
		} else if(comeco < fim) {
			for (int i=comeco; i<=fim; i++) {
				System.out.println(colecao[i]);
			}
		} else {
			for (int i=comeco; i < colecao.length; i++) {
				System.out.println(colecao[i]);
			} 
			for (int i=0; i <= fim; i++) {
				System.out.println(colecao[i]);
			}
		}
	}
}
