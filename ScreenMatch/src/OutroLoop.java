import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0, nota = 0;
        int totalDeNotas = 0;

        while(nota != -1) {
            System.out.println("Informe sua avaliação do filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if(nota != -1) {
                mediaAvaliacao =  mediaAvaliacao + nota;
                totalDeNotas++;
            }

        }

        System.out.println("Média de avaliações é: " + mediaAvaliacao/totalDeNotas);

    }
}
