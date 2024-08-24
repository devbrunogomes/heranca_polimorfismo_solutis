/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesQuestoes1a4;

/**
 *
 * @author bsgom
 */
public class Veterinario {

    private String nome;

    public Veterinario(String nome) {
        this.nome = nome;
    }

    public void examinar(Animal animal) {
        String tipoAnimal = animal.getClass().getSimpleName();
        System.out.println("========================");
        System.out.println("Medico(a) " + this.nome + " esta examinando o(a) " + tipoAnimal + " " + animal.getNome());
        animal.emitirSom();
        System.out.println("========================");
    }

}
