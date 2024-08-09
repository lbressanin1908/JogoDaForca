/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jogoforca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luan Bressanin
 */
public class Jogo {
    private final Palavra palavra;
    private final Jogador jogador;

    //Por mais que as classes não sejam final quando eu crio o construtor eu obrigo que passe tanto nome e a palavra
    public Jogo(Palavra palavra, Jogador jogador) {
        this.palavra = palavra;
        this.jogador = jogador;
    }
    
    public void iniciarJogo(){
        var numeroChutes = 15;
        var chutes = new ArrayList<String>();
        
        this.palavra.gerarPalavraSecreta();
        
        var scanner = new Scanner(System.in);
        System.out.println("Olá "+ this.jogador.getNome() + " Bem-Vindo ao Forca do LOL");
        System.out.println("Você tem " + numeroChutes + " Chutes para advinhar a palavra secreta.");
        System.out.println(this.palavra.getPalavraComChute()+"\n");
        
        //Enquanto a não estiver completa e tiver chutes vai continuar
        while (!this.palavra.palavraCompleta() && chutes.size()<numeroChutes) {            
            System.out.println("Digite seu chute: ");
            var chute = scanner.nextLine();
            
            if (chutes.contains(chute)) {
                System.out.println(" Você já chutou essa letra !! Tente novamente");
                continue;
            }
            chutes.add(chute);
            
            this.palavra.revelarLetra(chute);
            
            System.out.println("Palavra: " +this.palavra.getPalavraComChute());
            
            if (this.palavra.palavraCompleta()) {
                System.out.println("Parabéns " + this.jogador.getNome() + " ! Você venceu !");
            }else if(chutes.size() == numeroChutes){
                System.out.println("Poxa " + this.jogador.getNome() + " Poxa você perdeu !!"+"\n"+" A palavra secreta era " + this.palavra.getPalavraSecreta());
            }
        }
    }
}
