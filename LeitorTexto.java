/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leitortexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jaqueline Oliveira
 */
public class LeitorTexto {

    public static void main(String[] args) {
        
        
        Scanner ler = new Scanner(System.in);

        //caminho do arquivo
        System.out.printf("Informe o caminho do arquivo texto:\n");
        String nome = ler.nextLine();

        System.out.printf("\nConteudo do arquivo de texto:\n");
        try {
            FileReader arq = new FileReader(nome);
            
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha
            // a variável "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto
            while (linha != null) {
                System.out.printf("%s\n", linha);

                linha = lerArq.readLine(); // lê da segunda até a última linha
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        System.out.println();
    }

}
