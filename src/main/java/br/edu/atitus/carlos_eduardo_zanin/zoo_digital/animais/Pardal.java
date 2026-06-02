package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais;

import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Voo;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Ave;

public final class Pardal extends Ave implements Voo {

    public Pardal(String nome, Integer idade) {
        super(nome, idade, "penas pequenas e macias");
    }

    @Override
    public void comer() {
        this.comer("sementes");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está cantando: Piu Piu!");
    }

    @Override
    public void voar() {
        IO.println(this.getNome() + " está voando baixo entre os galhos!");
    }
}