/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvbridge;

/**
 *
 * @author Grupo Samuel Alencar, Lays Maria, Antônio Eberton, Francisco Gabriel
 * e Daniel Araújo
 */
public class JanelaMac implements JanelaImplementada {

    @Override
    public void desenharJanela(String titulo) {
        System.out.println(titulo + " - Janela Mac");
    }

    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + " - Botão Mac");
    }
}
