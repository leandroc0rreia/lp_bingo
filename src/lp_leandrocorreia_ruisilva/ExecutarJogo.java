/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp_leandrocorreia_ruisilva;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author leandroc0rreia
 */
public class ExecutarJogo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu m = new Menu();
        
        JOptionPane.showMessageDialog(null, "\n"
                + "Bem-vindo à plataforma do Bingo\n"
                + "Desenvolvido por: Leandro Correia e Rui Silva\n\n"
                + "Bingo é um jogo de azar divertido no qual todos podem participar.\n"
                + "Nele, usa-se um cartão de quinze posições em que os números são sorteados\n"
                + "aleatoriamente, se conseguir preencher todos os quadrados do jogo, GANHA!\n\n"
                + "Regras:\n\n"
                + "         1. Visualize os números do seu cartão;\n"
                + "         2. Introduza o número sorteado exteriormente;\n"
                + "         3. Grite 'Bingo' se tiver o cartão completo;\n"
                + "         4. Boa sorte e divirta-se!\n\n",
                 "Bingo v2.0", JOptionPane.PLAIN_MESSAGE);
        
        m.setVisible(true);
        
        
    }
}

/*

*/