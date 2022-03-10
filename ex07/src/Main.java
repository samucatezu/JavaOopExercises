import Models.Gerente;
import Models.Supervisor;
import Models.Vendedor;

public class Main {
    public static void main(String[] args) {
        Gerente ger = new Gerente();
        ger.setIdade(19);
        ger.setNome("Samuel");
        ger.setSalario(15000.00);
        System.out.println(ger.toString());
        System.out.println( "Bonificação de gerente é R$ 10000.00. O salário total é R$: " + ger.Bonificacao());


        Supervisor sup = new Supervisor();
        sup.setIdade(20);
        sup.setNome("clecio");
        sup.setSalario(7000.00);
        System.out.println(sup.toString());
        System.out.println("Bonificação de supervisor é R$ 5000.00. O salário total é R$: " + sup.Bonificacao());

        Vendedor ven = new Vendedor();
        ven.setIdade(20);
        ven.setNome("Bira");
        ven.setSalario(3000.00);
        System.out.println(ven.toString());
        System.out.println("Bonificação de supervisor é R$ 3000.00. O salário total é R$: " + ven.Bonificacao());



    }
}
