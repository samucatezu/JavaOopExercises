package ExImpostos;

public class COFINS {
    public Double calculaImposto(double valor) {
        if (valor > 17000)
            return valor * 0.08;
        else
            return valor * 0;
    }
}
