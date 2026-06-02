package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais;

import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Nado;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Ave;

public class Pinguim extends Ave implements Nado, Predacao {

    public Pinguim(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("peixes");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está grasnando");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando pra escapar das orcas");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando peixes pequenos no gelo!");
    }

}