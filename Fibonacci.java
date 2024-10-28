import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int posN = 0, valorFibo=0;
        int a=0,b=1;

        System.out.println("Insira o número maior ou igual a zero para visualizar " +
                "seu correspondente em Fibonacci: ");
        posN = read.nextInt();

        while (posN<0){
            System.out.println("Por favor, insira um número maior ou igual a 0");
            posN = read.nextInt();
        }

        if (posN == 0){
            valorFibo = 0;
        } else if (posN ==1 ) {
            valorFibo = 1;
        }
        else {
            for (int i=0;i<=posN;i++){
                valorFibo= a+b;
                b = a;
                a = valorFibo;
                //System.out.println("f"+i+"("+valorFibo+")");

            }
        }

        System.out.println("Na posição "+ posN+ " o valor é: " + valorFibo );
        System.out.println("\nf("+posN+")="+valorFibo);
    }

}
