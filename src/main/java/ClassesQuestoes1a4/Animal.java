/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesQuestoes1a4;

/**
 *
 * @author bsgom
 */
public abstract class Animal {

    //Atributos
    private String nome;
    private int idade;

    //construtor
    public Animal(String name, int idade) {
        this.nome = name;
        this.idade = idade;

    }

    //getter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //métodos
    public void emitirSom() {
        System.out.println(this.nome + " esta emitindo um som!");
    }
    
    public void seMovimentar(){
        System.out.println(this.nome + " esta se movimentando!");
    }
}
