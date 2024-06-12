package matriz;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[][]= new int [3][3];
		
		//Entrada
		
		for(int i = 0; i < 3; i++) {
			for(int j=0; j<3; j++) {
				m[i][j] = (int)Math.round(Math.random()*100);
			}
		}
		//Saida de dados
		for(int i = 0;i<3;i++) {
			for(int j=0; j<3;j++) {
				System.out.println("Os valores são: "+m[i][j]);
			}
		}
	}

}
