package exercicio04_CT;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		float valor;
		conta Conta=new conta();
		do {
			System.out.println("---MENU---");
			System.out.println("digite 1 para depositar");
			System.out.println("digite 2 para sacar");
			System.out.println("digite 0 para sair");
			num=sc.nextInt();
			if(num==1){
				System.out.println("informe o valor para depositar");
				valor=sc.nextFloat();
				Conta.depositar(valor);
			}
			if(num==2) {
				System.out.println("informe o valor para sacar");
				valor=sc.nextFloat();
				if(Conta.sacar(valor)) {
					System.out.println("valor sacado com sucesso");
				}else {
					System.out.println("saldo insuficiente");
				}
				}
			}while(num!=0);
		}
	}
}
