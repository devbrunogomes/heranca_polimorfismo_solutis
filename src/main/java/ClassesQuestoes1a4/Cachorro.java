/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesQuestoes1a4;

/**
 *
 * @author bsgom
 */
public class Cachorro extends Animal {

    //Construtor
    public Cachorro(String name, int idade) {
        super(name, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " esta latindo!");
    }

    @Override
    public void seMovimentar() {
        System.out.println(this.getNome() + " esta correndo!");
    }

}
