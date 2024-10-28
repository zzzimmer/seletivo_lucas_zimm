import java.util.Scanner;
public class Primos {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, contadorPrimos=0;

        System.out.println(" Insira um número para retornar todos os números primos que o antecedem");

        num = read.nextInt();

        while (num<=1){
            System.out.println("Favor, inserir número maior ou igual a 1");
            num = read.nextInt();
        }

        int lista [] = new int[num];//armazenar os primos

        for (int i =2; i<=num; i++){
            boolean primo = true;

            for (int j =2; j<i;j++){
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }//!
            if (primo){
                lista[contadorPrimos] = i;
                contadorPrimos++;
            }

        }
        System.out.println("Os números primos até "+num+ " são: ");
        for (int i=0; i<contadorPrimos; i++){
            System.out.println(lista[i]+" ");
        }
    }
}



