/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesQuestoes1a4;

/**
 *
 * @author bsgom
 */
public class Zoologico {

    public Animal[] jaulas;

    public Zoologico() {
        this.jaulas = new Animal[10];
    }

    public void percorrerJaulas() {
        System.out.println("""
                           
                           Percorrendo Jaulas
                           """);
        
        
        String tipoAnimal;
        //Loop pra iterar nas Jaulas
        for (int i = 0; i < jaulas.length; i++) {
            tipoAnimal = jaulas[i].getClass().getSimpleName(); //Armazenar o tipo de animal
            System.out.println("Jaula [" + (i + 1) + "]");
            System.out.println(jaulas[i].getNome() + " - " + tipoAnimal);

            //Emitir um som
            jaulas[i].emitirSom();

            //Se houver o comportamento de correr, entao, animal corre
            if (jaulas[i] instanceof Cavalo || jaulas[i] instanceof Cachorro) {
                jaulas[i].seMovimentar();
            }
            System.out.println(""); //Pular Linha
        }
    }

}
