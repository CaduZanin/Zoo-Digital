package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais;

import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Nado;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Peixe;

public final class Tubarao extends Peixe implements Nado, Predacao {

    public Tubarao(String nome, Integer idade) {
        super(nome, idade, "escamas placoides (dérmicas)");
    }

    @Override
    public void comer() {
        this.comer("peixes menores e focas");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " é silencioso, mas imponente!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando rapidamente!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando com seus dentes afiados!");
    }
}