package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais;

import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Mamifero;

public final class Onca extends Mamifero implements Corrida, Predacao {

    public Onca(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("carne");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está rugindo!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo pela floresta!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando sua presa!");
    }
}