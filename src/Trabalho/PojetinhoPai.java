package Trabalho;

public class PojetinhoPai {
	public static void main(String[] args) {
		int c;
		int b=1;
		int a=0;
		
		for (int i=1; i<10; i++) {
			c=b;
			b=b+a;
			a=c;
		}
		System.out.println(b);
		
		
	}
	

}
