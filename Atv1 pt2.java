import java.util.Scanner;

public class pt2 extends pt3{
	public static void main(String[] args) {
		int numA;
		int numB;
		int op;

		Scanner sc = new Scanner(System.in);

		System.out.println("Primeiro numero: ");
		numA = sc.nextInt();
		System.out.println("Segundo numero: ");
		numB = sc.nextInt();
		System.out.println("1-Soma: ");
		System.out.println("2-Subtracao: ");
		System.out.println("Selecione uma operacao: ");
		op = sc.nextInt();
		switch(op){
		    case 1:
		        calcula(numA,numB);
		        System.out.println(res);
		        break;
		    case 2:
                calcula2(numA,numB);
		        break;
		    default:
		        System.out.println("Digite algo");
		        break;
		}
	}
}
