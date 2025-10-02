import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[8];
        System.out.println("Digite as 8 notas anuais (duas por bimestre):");

        // Receber as 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // Calcular médias bimestrais (2 notas por bimestre)
        double[] mediasBimestrais = new double[4];
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2.0;
        }

        // Calcular médias semestrais
        double primeiroSemestre = (mediasBimestrais[0] + mediasBimestrais[1]) / 2.0;
        double segundoSemestre = (mediasBimestrais[2] + mediasBimestrais[3]) / 2.0;

        // Média final
        double mediaFinal = (primeiroSemestre + segundoSemestre) / 2.0;

        // Apresentar os resultados
        System.out.println("\nPráticas");

        System.out.println("1o Bimestre: " + mediasBimestrais[0]);
        System.out.println("2o Bimestre: " + mediasBimestrais[1]);
        System.out.println("1o Semestre: " + primeiroSemestre);
        System.out.println("----------------------");
        System.out.println("3o Bimestre: " + mediasBimestrais[2]);
        System.out.println("4o Bimestre: " + mediasBimestrais[3]);
        System.out.println("2o Semestre: " + segundoSemestre);
        System.out.println("-----------------------");
        System.out.println("Média Final: " + mediaFinal);

        sc.close();
    }
}
