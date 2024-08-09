/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jogoforca;


import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Luan Bressanin
 */
public class Palavra {
    private final List<String> palavras = Arrays.asList("lucian","senna","viktor","leona","alistar","xerath","teemo","urgot","katarina");
    private String palavraSecreta;
    private String palavraComChute;
    
    public void gerarPalavraSecreta(){
        //pega o tamanho da palavra e sorteia .. casting necessario pois random retorna com ponto flutuante
        var range = this.palavras.size() -1;
        var index = (int) (Math.random() * range);
        //Salvando a palavra q foi selecionada
        this.palavraSecreta = this.palavras.get(index);
        this.palavraComChute = "_".repeat(this.palavraSecreta.length());
    }
    
    public void revelarLetra(String letra){
        for (int i = 0; i < this.palavraSecreta.length(); i++) {
            //condição pra ver se a letra bate com alguma que tenha na palavra
            if (this.palavraSecreta.charAt(i) == letra.charAt(0)) {
                this.palavraComChute = this.palavraComChute.substring(0, i) + letra +
                        this.palavraComChute.substring(i+1);
            }
        }
    }
    
    public boolean palavraCompleta(){
        return !this.palavraComChute.contains("_");
        
    }
    
     public List<String> getPalavras() {
        return palavras;
    }

    public String getPalavraSecreta(){
        return palavraSecreta;
    }

    public String getPalavraComChute() {
        return palavraComChute;
    }

    public void setPalavraComChute(String palavraComChute) {
        this.palavraComChute = palavraComChute;
    }
    
    
}
