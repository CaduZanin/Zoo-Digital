package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais;

import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Reptil;

public final class Iguana extends Reptil implements Corrida {

    public Iguana(String nome, Integer idade) {
        super(nome, idade, "escamas ásperas e crista dorsal serrilhada");
    }

    @Override
    public void comer() {
        this.comer("folhas, frutas e flores");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está balançando a cabeça e assobiando!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo sobre duas patas para fugir!");
    }
}