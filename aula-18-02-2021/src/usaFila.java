import javax.swing.JOptionPane;

public class usaFila {
	
	public static void main(String[] args) {
		Fila fifo = new Fila();
		int opt;
		do {
			String input = JOptionPane.showInputDialog("Menu "
					+ "\n1 - inserir "
					+ "\n2 - retirar "
					+ "\n3 - mostrar"
					+ "\n4 - procurar"
					+ "\n5 - detonar"
					+ "\n9 - sair");
			opt = Integer.parseInt(input);
			
			switch(opt) {
			case 1:
				String novo = JOptionPane.showInputDialog("Digite o novo elemento da pilha");
				int novoInt = Integer.parseInt(novo);
				if(fifo.inserir(novoInt)==false) {
					System.out.println("Não há espaco na fila.");
				};
				break;
			case 2:
				if (fifo.retirar() == -999) {
					System.out.println("Não há elementos para retirar da fila.");
				} else {
					System.out.println("O primeiro elemento da fila foi retirado.");
				}
				break;
			case 3:
				fifo.mostrar();
				break;
			case 4:
				String input01 = JOptionPane.showInputDialog("Digite o elementoque deseja procurar");
				int procurado = Integer.parseInt(input01);
				if(fifo.procurar(procurado)) {
					System.out.println("Elemento encontrado.");
				}else {
					System.out.println("Elemento não encontrado.");
				}
				break;
			case 5:
				fifo.detonar();
				break;
			}
		
		} while(opt != 9);
		

	}
}