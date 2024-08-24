/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.solutis_heranca_polimorfismo;

import ClassesQuestoes1a4.Cachorro;
import ClassesQuestoes1a4.Cavalo;
import ClassesQuestoes1a4.Preguica;
import ClassesQuestoes1a4.Veterinario;
import ClassesQuestoes1a4.Zoologico;

/**
 *
 * @author bsgom
 */
public class Questoes1a4 {
    public static void resposta(){
        //Novas Instancias de animais
        Cachorro cachorroTeste = new Cachorro("Maylon", 10);
        Cavalo cavaloTeste = new Cavalo("Raio de Sol", 5);
        Preguica preguicaTeste = new Preguica("Bernardo", 3);
        
        //Animais emitindo um som
        cachorroTeste.emitirSom();
        cavaloTeste.emitirSom();
        //OBS: Preguiças nao tem um som especifico, por isso ficou o padrao da classe abstrata
        preguicaTeste.emitirSom();
        
        System.out.println("========================");
        
        //Nova instancia de Veterinario
        Veterinario veterinarioTeste = new Veterinario("Roberto");
        
        //Veterinario examina os animais
        veterinarioTeste.examinar(cachorroTeste);
        veterinarioTeste.examinar(cavaloTeste);
        veterinarioTeste.examinar(preguicaTeste);
        
        //Nova instancia de Zoologico
        Zoologico zoologicoTeste = new Zoologico();
        zoologicoTeste.jaulas[0] = new Cachorro("Maylon", 14);
        zoologicoTeste.jaulas[1] = new Cachorro("Pluto", 3);
        zoologicoTeste.jaulas[2] = new Cavalo("Pocoto", 2);
        zoologicoTeste.jaulas[3] = new Cavalo("Pangare", 1);
        zoologicoTeste.jaulas[4] = new Preguica("Rodrigo", 9);
        zoologicoTeste.jaulas[5] = new Preguica("Marquete", 2);
        zoologicoTeste.jaulas[6] = new Preguica("Rodrigo", 9);
        zoologicoTeste.jaulas[7] = new Cavalo("Roda Moinho", 7);
        zoologicoTeste.jaulas[8] = new Preguica("Rodrigo", 9);
        zoologicoTeste.jaulas[9] = new Cachorro("Princesa", 8);
        
        //Açao de percorrer as aulas
        zoologicoTeste.percorrerJaulas();
    }
}
