package Classes;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class Mago extends Personagem{
    private List<String> magia;
    private final Random numeroRandomico = new Random();

    public Mago() {
        magia = new ArrayList<>();
    }


    @Override
    public void lvlUp() {
        setMana(getMana() + 1);
        setInteligencia(getInteligencia() + 1);
    }

    public void attack() {

        setForca(getForca() / 2 * (getLevel() * getLevel()) + numeroRandomico.nextInt(180));
        magia.add("F: " + getForca() + " I: " + getInteligencia() + " L: " + getLevel() + " M: " + getMana());

    }

    public void apresentaMagia(String mag) {

        System.out.println("Magias");

        for (String x : magia) {
            System.out.println(x);
        }

    }
}
