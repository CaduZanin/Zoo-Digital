package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais;

import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Nado;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Peixe;

public final class Palhaco extends Peixe implements Nado {

    public Palhaco(String nome, Integer idade) {
        super(nome, idade, "escamas finas e coloridas");
    }

    @Override
    public void comer() {
        this.comer("algas e pequenos crustáceos");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " faz barulhos estalantes!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando entre os corais!");
    }
}