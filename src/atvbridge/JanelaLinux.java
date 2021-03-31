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
public class JanelaLinux implements JanelaImplementada {

    @Override
    public void desenharJanela(String titulo) {
        System.out.println(titulo + " - Janela Linux");
    }

    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + " - Botão Linux");
    }
}
