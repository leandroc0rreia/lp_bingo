/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp_leandrocorreia_ruisilva;

import javax.swing.JOptionPane;

/**
 *
 * @author leandroc0rreia
 */
public class Verificar extends Cartao{
    
    private int num;
    private int confirm;
    private boolean ganhou;
    private boolean novojogo;
    private int cartao[][] = new int[9][3];
    private int cartaozero[][] = new int[9][3];

    public Verificar(int num) {
        this.num = 0;
        this.ganhou = false;
        this.novojogo = false;
    }

    public void setConfirm(int confirm) {
        this.confirm = confirm;
    }
    
    public void veriGanhou(){
    Numeros nu = new Numeros();
        do {
            do {
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (cartao[i][j] == num) {
                                cartaozero[i][j] = 0;
                            } else {

                            }
                        }
                    }

                    if (super.soma(cartaozero) == 0) {
                        ganhou = true;
                        JOptionPane.showMessageDialog(null, "Parabéns! Ganhas-te o jogo", "Bingo!", JOptionPane.INFORMATION_MESSAGE);

                        switch (confirm) {
                            case 1:
                                novojogo = false;
                                for (int i = 0; i < 9; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        if (cartao[i][j] != 0) {
                                            cartaozero[i][j] = 1;
                                        }
                                        if (cartao[i][j] == 0) {
                                            cartaozero[i][j] = 0;
                                        }
                                    }
                                }
                                nu.numAnt(num = 0);
                                break;
                            case 2:
                                novojogo = true;
                                nu.numAnt(num = 0);
                                break;
                            default:
                                novojogo = true;
                                nu.numAnt(num = 0);
                                break;
                        }
                    }
                } while (!novojogo);
            } while (!ganhou);
    }
    
}
