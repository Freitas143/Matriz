package matriz;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[][]= new int [5][5];
		
		//Entrada
		
		for(int i = 0; i < 5; i++) {
			for(int j=0; j<5; j++) {
				int aVerificar= (int)Math.round(Math.random()*100);
				if (aVerificar %2 == 0) {
					m[i][j] = aVerificar;
				}
				else {
					j = 0;
				}
			}
		}
		//Saida de dados
		for(int i = 0;i<5;i++) {
			for(int j=0; j<5;j++) {
				System.out.println("Os valores são: "+m[i][j]);
			}
		}
	}

	}


