/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvbridge;

/**
 *
 * @author samue
 */
public class Cliente {

    public static void main(String[] args) {

        JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
        janela.desenhar();

        janela = new JanelaAviso(new JanelaLinux());
        janela.desenhar();

        janela = new JanelaDialogo(new JanelaWindows());
        janela.desenhar();

        janela = new JanelaDialogo(new JanelaMac());
        janela.desenhar();

    }

}
