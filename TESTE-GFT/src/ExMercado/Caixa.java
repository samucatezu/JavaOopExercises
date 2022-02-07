package ExMercado;

public class Caixa {
    public Double calculaValorFinal(int quantidade, Produto produto){

        double quantidadeTotal = 0;

        if(produto.getTipo() == 1){
            quantidadeTotal = (quantidade * produto.getValor())-(quantidade * produto.getValor()*0.1);
        }else if(produto.getTipo() == 2){
            quantidadeTotal = (quantidade * produto.getValor())-(quantidade * produto.getValor()*0.2);
        }else if(produto.getTipo() == 3 && quantidade > 5){
            quantidadeTotal = (quantidade * produto.getValor())-(quantidade * produto.getValor()*0.1);
        }
        return quantidadeTotal;
    }
}
