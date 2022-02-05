package ExImposto;

public class COFINS implements Imposto {

    public Double calculaImposto(double valor) {
        if (valor > 13000)
            return valor * 0.04;

        return 0.0;
    }
}
