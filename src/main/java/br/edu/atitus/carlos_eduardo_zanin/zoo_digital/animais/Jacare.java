package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais;

import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Nado;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Reptil;

public final class Jacare extends Reptil implements Nado, Predacao, Corrida {

    public Jacare(String nome, Integer idade) {
        super(nome, idade, "escamas grossas");
    }

    @Override
    public void comer() {
        this.comer("peixes, aves e mamíferos");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está grunindo!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando silenciosamente na água!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está espreitando sua presa na margem!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo rapidamente em terra firme!");
    }
}