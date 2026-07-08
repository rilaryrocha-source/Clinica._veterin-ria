package clinicaVeterinaria;

import clinicaVeterinaria.*;

public class main {

    public static void main(String[] args) {

        // Polimorfismo
        animal animal1 = new cachorro(
            Nome: "Bolinha",
            Especie: "Mamífero",
            Idade: 3,
            Pelagem: "curto e liso",
            Patas: 4
        );

        animal animal2 = new papagaio(
            Nome: "Pirata",
            Especie: "ave",
            Idade: 7,
            bico: "médio e afinado",
            pena: "saudável",
            asa: "saudável"
        );

        animal animal3 = new peixe(
            Nome: "Nemo",
            Especie: "Tilápia",
            Idade: 3,
            escama: "resistente",
            cor: "azul",
            habitat: "água doce",
            tamanho: 20
        );

        animal[] acervo = {animal1, animal2, animal3};

        for (animal animal : acervo) {
            animal.exibirInformacoes();
            System.out.println("--------------------");
        }
    }
          }
