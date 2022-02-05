package ExOlimpiada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Atleta a[] = new Atleta[10];
        String nome, pais;
        int dist;
        int Brasil = 0, Alemanha = 0, EUA = 0;
        Scanner ler = new Scanner(System.in);

        for(int i = 0; i <10; i++){
            System.out.println("Digite o nome do "+(i+1) +"° atleta: ");
            nome = ler.next();
            System.out.println("Digite o pais do "+(i+1) +"° atleta: (Brasil, Alemanha ou EUA)");
            pais = ler.next();
            System.out.println("Digite o resultado em metros do "+(i+1) +"° atleta: ");
            dist = ler.nextInt();

            if (pais.equalsIgnoreCase("Brasil")){
                Brasil++;
            }
            else if (pais.equalsIgnoreCase("Alemanha")){
                Alemanha++;
            }
            else if (pais.equalsIgnoreCase("EUA")){
                EUA++;
            }

        }
        System.out.println("Total de Atletas");

        System.out.println("Brasil: "+Brasil);
        System.out.println("Alemanha: "+Alemanha);
        System.out.println("EUA: "+EUA);
    }
}
