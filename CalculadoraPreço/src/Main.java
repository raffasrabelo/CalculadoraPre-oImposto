import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int opcao = -1, margemLucro;
		double ipi, icms, iss, aliquotaIcms, aliquotaIss, valor, custoMercadoria, frete, seguro, precoFinal, custosTotais;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Digite o número correspondente ao cálculo que será efetuado:"
					+ "\n 1- Preço final de produto"
					+ "\n 2- Preço final de serviço"
					+ "\n 0- Sair");
			opcao = scan.nextInt();
			switch(opcao) {
			case 1: 
				System.out.println("Digite o preço de custo da mercadoria:");
				custoMercadoria = scan.nextDouble();
				System.out.println("Digite digite o valor do frete: ");
				frete = scan.nextDouble();
				System.out.println("Digite o valor do seguro da mercadoria:");
				seguro = scan.nextDouble();
				custosTotais = (custoMercadoria+seguro+frete);
				ipi = custosTotais * 0.15;
				System.out.println("Valor do IPI: R$"+ ipi);
				
				System.out.println("Digite a alíquota de ICMS a ser praticada:");
				aliquotaIcms = scan.nextDouble();
				icms = custoMercadoria * aliquotaIcms;
				System.out.println("ICMS = R$"+icms);
				
				System.out.println("Digite a margem de lucro esperada(espera-se um int):");
				margemLucro = scan.nextInt()/100;
				
				precoFinal =  custosTotais+icms+ipi+margemLucro;
				
				System.out.println("O preço final do seu produto é de R$"+precoFinal);
				break;
			case 2:
				System.out.println("Digite o preço de custo da mercadoria:");
				custoMercadoria = scan.nextDouble();
				System.out.println("Digite a alíquota de ICMS a ser praticada:");
				aliquotaIcms = scan.nextDouble();
				icms = custoMercadoria * aliquotaIcms;
				System.out.println("Valor do ICMS: R$ "+icms);
				
				System.out.println("Digite a alíquota de ISS a ser praticada:");
				aliquotaIss = scan.nextDouble();
				iss = custoMercadoria * aliquotaIss;
				System.out.println("Valor do ISS: R$ "+iss);
				
				System.out.println("Digite a margem de lucro esperada(espera-se um int):");
				margemLucro = scan.nextInt()/100;
				
				precoFinal = custoMercadoria + iss + icms + margemLucro;
				
				System.out.println("O preço final do serviço é de: R$"+precoFinal);
				break;
			}
		}while(opcao!=0);
	}
}
//IPI 15%
//ICMS colocar 2 ou 3 alíquotas diferentes


