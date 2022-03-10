import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Main {

    public static void main(String[] args) throws Exception {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        Pessoa joao = new Pessoa("João", 15);
        Pessoa leandro = new Pessoa("Leandro", 21);
        Pessoa paulo = new Pessoa("Paulo", 17);
        Pessoa jessica = new Pessoa("Jessica", 18);

        pessoas.add(joao);
        pessoas.add(leandro);
        pessoas.add(jessica);
        pessoas.add(paulo);

        Pessoa.pessoaMaisVelha(pessoas);

        System.out.println("Quantidade de pessoas: " + pessoas.size());

        List<Pessoa> pessoasMaiores = pessoas.stream().filter(Pessoa::byMaiores).toList();

        System.out.println("Quantidade de pessoas maiores que 18 anos: " + pessoasMaiores.size());

        for (Pessoa pessoa : pessoasMaiores) {
            if (pessoa.getNome().equals("Jessica")) {
                System.out.println("Jessica encontrada, idade: " + pessoa.getIdade() + " anos");
                break;
            }

        }

    }

}