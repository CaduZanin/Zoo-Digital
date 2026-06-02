package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;

import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Cachorro;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Aguia;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Camaleao;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Iguana;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Jacare;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Gato;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Golfinho;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Lagarto;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Pato;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Macaco;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Pinguim;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Palhaco;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Traira;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Pardal;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.animais.Tubarao;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Nado;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.comportamentos.Voo;
import br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies.Animal;

public class ZooDigitalApp {

    private static List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            IO.println("Zoo Digital");
            IO.println("1 - Cadastrar Animal");
            IO.println("2 - Listar Todos Animais");
            IO.println("3 - Listar Animais Corredores");
            IO.println("4 - Listar Animais Nadadores");
            IO.println("5 - Listar Animais Voadores");
            IO.println("6 - Listar Animais Predadores");
            IO.println("7 - Exibir Total de Animais");
            IO.println("0 - Sair");

            opcao = Input.scanInt("Opção: ");

            if (opcao == 1) {
                cadastrarAnimal();
            } else if (opcao == 2) {
                listarTodosAnimais();
            } else if (opcao == 3) {
                listarAnimaisCorredores();
            } else if (opcao == 4) {
                listarAnimaisNadadores();
            } else if (opcao == 5) {
                listarAnimaisVoadores();
            } else if (opcao == 6) {
                listarAnimaisPredadores();
            } else if (opcao == 7) {
                exibirTotalAnimais();
            } else if (opcao == 0) {
                IO.println("Saindo...");
            } else {
                IO.println("Opção inválida.");
            }

            IO.println("");
        }
    }

    private static void cadastrarAnimal() {
        IO.println("1 - Cachorro");
        IO.println("2 - Gato");
        IO.println("3 - Golfinho");
        IO.println("4 - Macaco");
        IO.println("5 - Aguia");
        IO.println("6 - Pato");
        IO.println("7 - Pinguim");
        IO.println("8 - Pardal");
        IO.println("9 - Tubarao");
        IO.println("10 - Peixe Palhaco");
        IO.println("11 - Traira");
        IO.println("12 - Jacare");
        IO.println("13 - Lagarto");
        IO.println("14 - Camaleao");
        IO.println("15 - Iguana");

        int tipo = Input.scanInt("Tipo: ");

        if (tipo < 1 || tipo > 15) {
            IO.println("Tipo inválido.");
            return;
        }

        String nome = Input.scanString("Nome: ");
        int idade = Input.scanInt("Idade: ");

        Animal animal = null;

        if (tipo == 1) {
            animal = new Cachorro(nome, idade);
        } else if (tipo == 2) {
            animal = new Gato(nome, idade);
        } else if (tipo == 3) {
            animal = new Golfinho(nome, idade);
        } else if (tipo == 4) {
            animal = new Macaco(nome, idade);
        } else if (tipo == 5) {
            animal = new Aguia(nome, idade);
        } else if (tipo == 6) {
            String corPenas = Input.scanString("Cor das penas: ");
            animal = new Pato(nome, idade, corPenas);
        } else if (tipo == 7) {
            String corPenas = Input.scanString("Cor das penas: ");
            animal = new Pinguim(nome, idade, corPenas);
        } else if (tipo == 8) {
            animal = new Pardal(nome, idade);
        } else if (tipo == 9) {
            animal = new Tubarao(nome, idade);
        } else if (tipo == 10) {
            animal = new Palhaco(nome, idade);
        } else if (tipo == 11) {
            animal = new Traira(nome, idade);
        } else if (tipo == 12) {
            animal = new Jacare(nome, idade);
        } else if (tipo == 13) {
            animal = new Lagarto(nome, idade);
        } else if (tipo == 14) {
            animal = new Camaleao(nome, idade);
        } else if (tipo == 15) {
            animal = new Iguana(nome, idade);
        }

        animais.add(animal);
        IO.println("Animal cadastrado com sucesso!");
    }

    private static void listarTodosAnimais() {
        if (animais.isEmpty()) {
            IO.println("Nenhum animal cadastrado.");
            return;
        }

        for (Animal animal : animais) {
            mostrarAnimal(animal);
            animal.emitirSom();
            animal.comer();
            IO.println("");
        }
    }

    private static void listarAnimaisCorredores() {
        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Corrida) {
                mostrarAnimal(animal);

                Corrida corredor = (Corrida) animal;
                corredor.correr();

                encontrou = true;
                IO.println("");
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal corredor cadastrado.");
        }
    }

    private static void listarAnimaisNadadores() {
        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Nado) {
                mostrarAnimal(animal);

                Nado nadador = (Nado) animal;
                nadador.nadar();

                encontrou = true;
                IO.println("");
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal nadador cadastrado.");
        }
    }

    private static void listarAnimaisVoadores() {
        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Voo) {
                mostrarAnimal(animal);

                Voo voador = (Voo) animal;
                voador.voar();

                encontrou = true;
                IO.println("");
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal voador cadastrado.");
        }
    }

    private static void listarAnimaisPredadores() {
        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Predacao) {
                mostrarAnimal(animal);

                Predacao predador = (Predacao) animal;
                predador.cacar();

                encontrou = true;
                IO.println("");
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal predador cadastrado.");
        }
    }

    private static void exibirTotalAnimais() {
        IO.println("Total de animais criados: " + Animal.getContador());
        IO.println("Total de animais na lista: " + animais.size());
    }

    private static void mostrarAnimal(Animal animal) {
        IO.println("Nome: " + animal.getNome());
        IO.println("Idade: " + animal.getIdade());
        IO.println("Espécie: " + animal.getEspecie());
    }
}