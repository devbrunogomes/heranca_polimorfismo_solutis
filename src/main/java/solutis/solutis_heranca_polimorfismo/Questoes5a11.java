/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.solutis_heranca_polimorfismo;

import ClassesQuestoes5a11.Cargo;
import ClassesQuestoes5a11.Funcionario;
import ClassesQuestoes5a11.FuncionarioEnsinoBasico;
import ClassesQuestoes5a11.FuncionarioEnsinoMedio;
import ClassesQuestoes5a11.FuncionarioGraduacao;
import java.util.ArrayList;

/**
 *
 * @author bsgom
 */
public class Questoes5a11 {

    public static void resposta() {
        //Nova instancias de Funcionarios - 40% ensino basico, 40% ensino medio, 20% graduacao            
        // 7 Vendedores (70%)
        FuncionarioEnsinoBasico funcionario1 = new FuncionarioEnsinoBasico("Lucas", 1, Cargo.VENDEDOR, "Escola Menor");
        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Amanda", 1, Cargo.VENDEDOR, "Escola Raio de Sol");
        FuncionarioEnsinoBasico funcionario3 = new FuncionarioEnsinoBasico("Pedro", 1, Cargo.VENDEDOR, "Escola Pinguinho");
        FuncionarioEnsinoBasico funcionario4 = new FuncionarioEnsinoBasico("Juliana", 1, Cargo.VENDEDOR, "Escola Central");
        FuncionarioEnsinoMedio funcionario5 = new FuncionarioEnsinoMedio("Gabriel", 2, Cargo.VENDEDOR, "Colegio Evolucao");
        FuncionarioEnsinoMedio funcionario6 = new FuncionarioEnsinoMedio("Mariana", 2, Cargo.VENDEDOR, "Colegio Luz do Saber");
        FuncionarioEnsinoMedio funcionario7 = new FuncionarioEnsinoMedio("Rafael", 2, Cargo.VENDEDOR, "Colegio Jorge Calmon");
        // 2 Supervisores (20%)
        FuncionarioEnsinoMedio funcionario8 = new FuncionarioEnsinoMedio("Bianca", 2, Cargo.SUPERVISOR, "Colegio Centro do Saber");
        FuncionarioGraduacao funcionario9 = new FuncionarioGraduacao("Henrique", 3, Cargo.SUPERVISOR, "Faculdade Dom Pedro");
        // 1 Gerente (10%)
        FuncionarioGraduacao funcionario10 = new FuncionarioGraduacao("Camila", 3, Cargo.GERENTE, "Universidade Jorge Amado");

        //Novo array de Funcionarios que simula uma empresa
        ArrayList<Funcionario> empresaSquadTech = new ArrayList<>();
        empresaSquadTech.add(funcionario1);
        empresaSquadTech.add(funcionario2);
        empresaSquadTech.add(funcionario3);
        empresaSquadTech.add(funcionario4);
        empresaSquadTech.add(funcionario5);
        empresaSquadTech.add(funcionario6);
        empresaSquadTech.add(funcionario7);
        empresaSquadTech.add(funcionario8);
        empresaSquadTech.add(funcionario9);
        empresaSquadTech.add(funcionario10);
        
        
        //Variaveis para armazenar gastos totais com salario
        int gastosTotaisComFuncionariosEnsinoBasico = 0;
        int gastosTotaisComFuncionariosEnsinoMedio = 0;
        int gastosTotaisComFuncionariosGraduacao = 0;
        int gastosTotaisComSalario = 0;

        for (Funcionario funcionario : empresaSquadTech) {
            System.out.println(funcionario);

            //Se funcionario ter Ensino Basico incrementar gasto total especifico
            if (funcionario instanceof FuncionarioEnsinoBasico) {
                gastosTotaisComFuncionariosEnsinoBasico += funcionario.getRendaTotal();
            }

            //Se funcionario ter Ensino Medio incrementar gasto total especifico
            if (funcionario instanceof FuncionarioEnsinoMedio) {
                gastosTotaisComFuncionariosEnsinoMedio += funcionario.getRendaTotal();
            }

            //Se funcionario ter Ensino Medio incrementar gasto total especifico
            if (funcionario instanceof FuncionarioGraduacao) {
                gastosTotaisComFuncionariosGraduacao += funcionario.getRendaTotal();
            }
            
            //incrementar gasto total
            gastosTotaisComSalario += funcionario.getRendaTotal();
        }
        System.out.printf("\nGastos com Funcionarios com Ensino Basico: R$%.2f", (float) gastosTotaisComFuncionariosEnsinoBasico);
        System.out.printf("\nGastos com Funcionarios com Ensino Medio: R$%.2f", (float) gastosTotaisComFuncionariosEnsinoMedio);
        System.out.printf("\nGastos com Funcionarios com Graduacao: R$%.2f", (float) gastosTotaisComFuncionariosGraduacao);
        System.out.print("\n=========================================");
        System.out.printf("\nA empresa tem um gasto total com Salarios de: R$%.2f", (float) gastosTotaisComSalario);

    }
}
