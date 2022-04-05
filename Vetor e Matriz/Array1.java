package Familia51;

public class Array1 {

	public static void main(String[] args) {
		
		int A[] = new int[6], somaVetor=0,x;
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;

		somaVetor = A[0] + A[1] + A[5];
		
		A[4] = 100;
		
		for(x=0; x<6; x++)
		{
			System.out.print(" "+A[x]);
		}
	}

}
