package ExMercado;

public class Main {

    public static void main(String[] args) {

        Caixa caixa = new Caixa();
        Produto produto1 = new Produto("Banana", 0.99, 2);
        Produto produto2 = new Produto("Energetico", 5.49, 3);
        Produto produto3 = new Produto("Arroz", 20.00, 1);
        Produto produto4 = new Produto("Chocolate", 4.50, 1);
        Produto produto5 = new Produto("Leite", 3.73, 3);
        Produto produto6 = new Produto("Abacaxi", 2.40, 2);

        caixa.calculaValorFinal(3, produto1);
        caixa.calculaValorFinal(7, produto2);
        caixa.calculaValorFinal(1, produto3);
        caixa.calculaValorFinal(12, produto4);
        caixa.calculaValorFinal(5, produto5);
        caixa.calculaValorFinal(2, produto6);

        System.out.println(caixa.calculaValorFinal(3, produto1));
        System.out.println(caixa.calculaValorFinal(7, produto2));
        System.out.println(caixa.calculaValorFinal(1, produto3));
        System.out.println(caixa.calculaValorFinal(12, produto4));
        System.out.println(caixa.calculaValorFinal(3, produto5));
        System.out.println(caixa.calculaValorFinal(4, produto6));
    }

}

