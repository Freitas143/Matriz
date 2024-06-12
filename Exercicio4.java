package matriz;

public class Exercicio4 {
	public static void main(String[] args) {
		int mA[][]= new int [3] [3];
		int mB [] [] = new int [3] [3];
		int mC [] []= new int [3][3];
		
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
			mA[l][c]= (int)Math.round(Math.random()*100);
			mB[l][c]= (int)Math.round(Math.random()*100);
			mB[l][c] += mA [l][c] *  mB[l][c] ;
			System.out.println("");
			}
		}
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
			System.out.print("["+mA[l][c]+"]");
			}
			System.out.println("\n-------------------");		
		}
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
			System.out.print("["+mB[l][c]+"]");
			}
			System.out.println("\n-------------------");		
		}
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
			System.out.print("["+mC[l][c]+"]");
			
			}
			
		System.out.println("\n-------------------");	
		}
		
	}
}
