package ExImpostos;

public class ICMS implements Imposto {

    public Double calculaImposto(double valor) {

        return valor * 0.30;
    }

}