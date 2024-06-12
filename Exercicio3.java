package matriz;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[][]= new int [4][4];
		
		//Entrada
		
		for(int i = 0; i < 4; i++) {
			for(int j=0; j<4; j++) {
				if(i==j){
					m[i][j] = (int)Math.round(Math.random()*100); 
				}
				else {
					m[i][j] =0 ;
				}
			}
		}
		//Saida de dados
		for(int i = 0;i<4;i++) {
			for(int j=0; j<4;j++) {
				if(m[i][j] > 0){
					System.out.print("["+m[i][j]+"]");
				}
			}
		}
	}

		
	}


