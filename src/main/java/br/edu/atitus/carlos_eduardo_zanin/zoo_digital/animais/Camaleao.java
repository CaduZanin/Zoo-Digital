package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais;


import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Reptil;

public final class Camaleao extends Reptil implements Predacao {

    public Camaleao(String nome, Integer idade) {
        super(nome, idade, "escamas granulares e cristas na cabeça");
    }

    @Override
    public void comer() {
        this.comer("insetos como grilos e moscas");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está emitindo sons suaves e sibilantes!");
    }


    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando com sua língua pegajosa e rápida!");
    }
}