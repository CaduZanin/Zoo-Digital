package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais;

import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Mamifero;

public final class Macaco extends Mamifero implements Corrida {

    public Macaco(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("banana");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está gritando!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo entre as árvores!");
    }
}