package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais;

import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Voo;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Ave;

public final class Aguia extends Ave implements Voo, Predacao {

    public Aguia(String nome, Integer idade) {
        super(nome, idade, "penas robustas e aerodinâmicas");
    }

    @Override
    public void comer() {
        this.comer("carne");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está gritando como uma águia!");
    }

    @Override
    public void voar() {
        IO.println(this.getNome() + " está voando alto nos céus!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando sua presa com garras afiadas!");
    }
}