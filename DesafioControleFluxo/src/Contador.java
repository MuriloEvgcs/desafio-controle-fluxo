
import java.util.Locale;
import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite um número");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite um número que seja maior que o primeiro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
            System.out.println("Contagem realizada com sucesso!");
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: 30O segundo parâmetro deve ser maior que o primeiro!");
        }



    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for(int numAtual = 0; numAtual <= contagem; numAtual ++){
            System.out.println("Imprimindo o número: " + numAtual);
        }

    }
}
