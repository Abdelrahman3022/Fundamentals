package be.intecbrussel_AppVoorBiologen_DietAnalyser.AppPackage_Nature;

import be.intecbrussel_AppVoorBiologen_DietAnalyser.digitale_boek.ForestNotebook;
import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.animals.Animal;
import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.animals.Carnivore;
import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.animals.Herbivore;
import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.animals.Omnivore;
import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants.Flower;
import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants.Plant;
import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants.Tree;
import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants.Weed;

import java.util.Collections;
import java.util.Comparator;

public class NatureApp {
    public static void main(String[] args) {



        ForestNotebook firstNotebook = new ForestNotebook();

        Plant Maize = new Tree("Maize");
        Plant Batat = new Plant("batat");
        Plant Banana = new Tree("Banana");
        Plant LupinusVarius = new Weed("Lupinus Varius");
        Plant NeriumOleander = new Weed("Nerium Oleander");
        Plant feed = new Flower("feed");


        firstNotebook.addPlant(Maize);
        firstNotebook.addPlant(Batat);
        firstNotebook.addPlant(Banana);
        firstNotebook.addPlant(LupinusVarius);
        firstNotebook.addPlant(NeriumOleander);
        firstNotebook.addPlant(feed);

        Omnivore lion = new Omnivore("Lion");
        Omnivore shark = new Omnivore("Shark");
        Omnivore catfish = new Omnivore("Cat Fish");
        Herbivore cow = new Herbivore("A Cow");
        Herbivore Sheep = new Herbivore("Sheep");
        Herbivore Rabbit = new Herbivore("Rabbit");
        Carnivore puma = new Carnivore("Puma");
        Carnivore loup = new Carnivore("Loup");
        Carnivore lynx = new Carnivore("Lunx");

        firstNotebook.addAnimal(lion);
        firstNotebook.addAnimal(shark);
        firstNotebook.addAnimal(catfish);
        firstNotebook.addAnimal(cow);
        firstNotebook.addAnimal(Sheep);
        firstNotebook.addAnimal(Rabbit);
        firstNotebook.addAnimal(puma);
        firstNotebook.addAnimal(loup);
        firstNotebook.addAnimal(lynx);

        System.out.println(firstNotebook.getCarnivores());
        System.out.println(firstNotebook.getHerbivores());
        System.out.println(firstNotebook.getOmnivores());

        System.out.println(firstNotebook.getAnimalCount());
        System.out.println(firstNotebook.getPlantCount());


        firstNotebook.sortAnimalsByName();
        firstNotebook.sortPlantsByName();
        firstNotebook.sortPlantsByColour();

        Collections.reverse(firstNotebook.getAnimals());
        System.out.println("* From Loudest Animal to Least *\n"+
                firstNotebook.getAnimals());

        System.out.println("* Above 50 decibels for Animal's *");
        firstNotebook.getAnimals().stream().sorted(Comparator.comparing
                ((Animal::getDecibel)).reversed()).filter(animal -> animal
                .getDecibel()>50).forEach(System.out::println);





    }




}
