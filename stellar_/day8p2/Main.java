import java.util.Scanner;

interface Minmax {
	void diagonal(int a[][]);

}
class Matr implements Minmax{
	public void diagonal(int a[][]) {
		int min=a[0][0];
		int max =a[0][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if((i==j)||(i+j==a.length+1)) {
					if(a[i][j]<min) {
						min=a[i][j];
					}
					if(max<a[i][j])
					{
						max=a[i][j];
					}
				}
			}
			
		}
				System.out.println("Min element "+min);
				System.out.println("Max element "+max);
	}
	
}
class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Matr m=new Matr();
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		m.diagonal(a);
	}
}