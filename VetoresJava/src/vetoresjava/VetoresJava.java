package vetoresjava;

import java.util.Arrays;

/**
 * @since 15/11/2023
 * @author myckazs
 */
public class VetoresJava {

    public static void main(String[] args) {
        //Vetores
        //1. Adicione a Biblioteca Arrays do Java 
        //2. Tipo do Array + nome + qtd de casas
        //3. Adicione valores, em cada indice começando do 0
        int n[] = new int[3]; // Uma coleção é um objeto, ou seja seu Vetor também é um objeto
        n[0] = 1;
        n[1] = 2;
        n[2] = 3;
        System.out.println(Arrays.toString(n));

        System.out.println("\n=====================\n");

        //Forma mais fácil de criar um Array com vários valores 
        int v[] /* Ou int[] n */ = {1, 2, 3, 4}; //Adicionar vários valores dentro de um Array
        System.out.println(Arrays.toString(v));

        System.out.println("\n=====================\n");

        //Forma de criar vetores utilizando laço de repetição
        int f[] = {1, 2, 3, 4, 5};
        for (int c = 0; c <= 4; c++) {
            System.out.print(f[c] + " ");
        }
        System.out.println();

        System.out.println("\n=====================\n");

        //para saber o total de casas que seu vetor possui, basta colocar a função length
        System.out.println("O vetor n[], possui: " + n.length + " casas");
        System.out.println();
        System.out.println("O vetor v[], possui: " + v.length + " casas");
        System.out.println();
        System.out.println("O vetor f[], possui: " + f.length + " casas");

        System.out.println("\n=====================\n");
        
        //Ou seja dessa forma podemos criar um vetor com tamanho Genérico
        int g[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i <= g.length-1; i++){
            System.out.print(g[i] + " ");
        }
    }

}
