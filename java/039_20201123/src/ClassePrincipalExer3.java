import java.util.Scanner;

public class ClassePrincipalExer3 {

	public static void main(String[] args) {
	Scanner t = new Scanner (System.in);
	int r = (int) (100*Math.random()+1);
	int i=5;
	boolean b=false;
	do {
		System.out.print("Introdueix un nombre entre (1-100) "+i+" intents restants: ");
		int n = t.nextInt();
		if (n<=100 && n>=1) {
			if (n == r) {
				System.out.println("Has encertat el nombre amb");
				i=0;
				b=true;
			}else if (n<r){
				i--;
				System.out.println("No has encertat el nombre, el nombre es mes gran que el nombre introduit");
			}else if (n>r){
				i--;
				System.out.println("No has encertat el nombre, el nombre es mes petit que el nombre introduit");
			}
		}
	}while(i!=0);
	t.close();
	if (b==false){
		System.out.print("No has encertat el nombre amb 5 intents, el nombre aleatori era "+r);
	}
	}
}