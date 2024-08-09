/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jogoforca;

/**
 *
 * @author Luan Bressanin
 */
public class main {
    public static void main(String[] args) {
        var jogador = new Jogador("Luan");
        var Palavra = new Palavra();
        var jogo = new Jogo(Palavra, jogador);
        
        jogo.iniciarJogo();
    }
}
