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
                System.out.println();

        System.out.println("\n=====================\n");

        //For int -> simplificando a maneira de criar um vetor com laço for
        double r[] = {1.5, 2.3, -3.5, 4, 5.8};
        for (double valor : r) {
            System.out.print(valor + " ");
        }
        System.out.println();

        System.out.println("\n=====================\n");
        
        //Pesquisar valor no vetor
        int p[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int s = Arrays.binarySearch(p, 9);
        System.out.println("O valor foi encontrado na seguinte posição: " + s);
        
        System.out.println("\n=====================\n");
        
        //Criar um vetor utilizando a função fill
        int l[] = new int[10];
        Arrays.fill(l, 0); //Criando vetor com valores especificos 
        for(int valores:l){
            System.out.print(valores + " ");
        }
        System.out.println();
    }

}
