package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais;

import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Peixe;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Nado;

public class PeixeMorcego extends Peixe implements Nado, Predacao {

    public PeixeMorcego(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void comer() {
        this.comer("algas");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está borbulhando");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando crustáceos");
    }

}