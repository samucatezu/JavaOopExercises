package papaiNoel;
import java.util.Scanner;

enum Personality {
    Nice,
    Naughty
}

public class Main {


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int presentsGiven = 0;
        int presentsNotGiven = 0;
        while (true) {
            Crianca crianca = new Crianca();
            System.out.println("Qual o seu nome?");
            String name = in.nextLine();
            crianca.name(name);
            System.out.println("Qual a sua personalidade? [0] Boazinha; [1] Malvada");
            String personality = in.nextLine();
            while(!personality.equals("0") && !personality.equals("1"))
            {
                System.out.println(personality + " Não entendi... Qual a sua personalidade? [0] Boazinha; [1] Malvada;");
                personality = in.nextLine();
            }
            if (personality.equals("0")) {
                crianca.personality(Personality.Nice);
                presentsGiven++;
            } else {
                crianca.personality(Personality.Naughty);
                presentsNotGiven++;
            }
            System.out.println("Entrevistar mais uma crinca fedida? [0] Não; [1] Sim;");
            String continuar = in.nextLine();
            while(!continuar.equals("0") && !continuar.equals("1"))
            {
                System.out.println("Não entendi... Entrevistar mais uma crinca fedida? [0] Não; [1] Sim;");
                continuar = in.nextLine();
            }
            if (continuar.equals("0")) {
                break;
            }
        }
        System.out.println("Foram entregues " + presentsGiven + " presentes;");
        System.out.println("Não foram entregues " + presentsNotGiven + " presentes;");
    }
}
