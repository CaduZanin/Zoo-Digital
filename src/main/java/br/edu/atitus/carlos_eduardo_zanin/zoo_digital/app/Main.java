package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.app;


import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Cachorro;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Gato;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Golfinho;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
void main() {

    IO.println("Zoo Digital");

    IO.println("Números de Animais no Início: " + Animal.getContador());

    Animal toto = new Cachorro("Totó", 5);
    Animal ariel = new Gato("Ariel", 8);
    Animal flipper = new Golfinho("Flipper", 20);

    List<Animal> animais = new ArrayList<>();
    animais.add(toto);
    animais.add(ariel);
    animais.add(flipper);

    listarAnimais(animais);
}

void listarAnimais(List<Animal> animais) {
    for (Animal animal : animais) {
        IO.println(animal.toString());
        animal.comer(); // De qual classe o método comer() será invocado?
                        // Depende do tipo concreto do objeto
        animal.emitirSom();
    }
}}