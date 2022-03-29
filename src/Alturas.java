import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		
		double alturaMedia, pessoasMenor, totalAltura, percentMenor;
		int n;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qtade. de pessoas:");
		n = sc.nextInt();
		System.out.println();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			nomes[i] = sc.next();
			System.out.print("Idade:");
			idades[i] = sc.nextInt();
			System.out.print("Altura:");
			alturas[i] = sc.nextDouble();
		}
		pessoasMenor = 0;
		alturaMedia = 0;
		totalAltura = 0;
		percentMenor = 0;
		for (int i=0; i<n; i++) {
			if (idades[i] < 16) {
				pessoasMenor++;
			}
			totalAltura = totalAltura + alturas[i];
		}
		alturaMedia = totalAltura / n;
		percentMenor = ((double)pessoasMenor / n) * 100.0;
		
		System.out.printf("\nAltura media = %.2f\n", alturaMedia);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentMenor);

	    for(int i=0; i<n; i++) {
	        if (idades[i] < 16) {
	        	System.out.printf("%s\n", nomes[i]);
	        }
	    }

		sc.close();
	}
}
