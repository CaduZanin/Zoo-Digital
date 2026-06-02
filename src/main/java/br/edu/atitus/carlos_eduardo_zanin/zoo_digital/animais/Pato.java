package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais;

import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Nado;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Voo;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Ave;

public class Pato extends Ave implements Corrida, Nado, Voo {

    public Pato(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("plantas saborosas");
    }


    @Override
    public void emitirSom() {
        IO.println(getNome() + " está fazendo Quack");
    }


    @Override
    public void voar() {
        IO.println(this.getNome() + " está voando!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando na lagoa!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo engraçado!");
    }

}
