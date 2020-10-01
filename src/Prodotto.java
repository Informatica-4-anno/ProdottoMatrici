import java.util.Scanner;

public class Prodotto {

	public static void riempiMatrice(int m[][]) {
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length;j++) {
				m[i][j]=(int)(Math.random()*10);
			}
		}
	}
	
	public static void stampaMatrice(int m[][]) {
		for( int v[]: m) {
			for (int e: v) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] a, b, c;
		int ro, cr, co;

		System.out.println("Dimmi le righe e le colonne della prima matrice");
		ro=sc.nextInt();
		cr=sc.nextInt();
		System.out.println("Dimmi le colonne della seconda matrice");
		co=sc.nextInt();
		
		System.out.println("La terza matrice sara': "+ro+"x"+co);
		
		a=new int[ro][cr];
		b=new int[cr][co];
		c=new int[ro][co];
		riempiMatrice(a);
		riempiMatrice(b);
		
		System.out.println("Matrice A");
		stampaMatrice(a);
		
		System.out.println("Matrice B");
		stampaMatrice(b);
		
		
		
		
		

	}

}
