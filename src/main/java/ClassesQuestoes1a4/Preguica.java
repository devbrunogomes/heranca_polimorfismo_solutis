/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesQuestoes1a4;

/**
 *
 * @author bsgom
 */
public class Preguica extends Animal {

    public Preguica(String name, int idade) {
        super(name, idade);
    }

    @Override
    public void seMovimentar() {
        System.out.println(this.getNome() + " esta subindo na arvore!");
    }

}
