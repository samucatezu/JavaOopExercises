package ExImpostos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor:");
        String num1 = leitor.next();


        Double numero1 = Double.parseDouble(num1);

        ICMS icms = new ICMS();
        Double vaalorIcms = icms.calculaImposto(numero1);
        System.out.println("ICMS: " + vaalorIcms);

        IPI ipi = new IPI();
        Double vaalorIpi = ipi.calculaImposto(numero1);
        System.out.println("IPI: " + vaalorIpi);

        COFINS cofins = new COFINS();
        Double vaalorCofins = cofins.calculaImposto(numero1);
        System.out.println("COFINS: " + vaalorCofins);

        Double total = numero1 + vaalorIcms + vaalorIpi + vaalorCofins;

        System.out.println("Total: " + total);

    }
}
