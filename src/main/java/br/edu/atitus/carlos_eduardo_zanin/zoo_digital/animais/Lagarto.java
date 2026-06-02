package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais;

import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Reptil;

public final class Lagarto extends Reptil implements Corrida, Predacao {

    public Lagarto(String nome, Integer idade) {
        super(nome, idade, "escamas pequenas e sobrepostas");
    }

    @Override
    public void comer() {
        this.comer("insetos e pequenos invertebrados");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está emitindo sons de estalo!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo rapidamente no chão!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando insetos com sua língua rápida!");
    }
}