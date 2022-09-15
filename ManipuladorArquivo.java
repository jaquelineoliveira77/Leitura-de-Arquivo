/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizmultiplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jaqueline Oliveira
 */
public class ManipuladorArquivo {

    /*
    Esta classe contém dois métodos estáticos, 
    um para realizar a leitura (leitor) e outro para realizar a escrita(escritor) em arquivos txt.
    
    O método leitor tem como parâmetro de entrada o path (url/caminho) do arquivo 
    que será lido, como pode ser visto na assinatura do método:
     */

 /*
    public static void leitor(String path) throws IOException
    Esse método tem como principal objetos internos o BufferedReader que nada mais é que a classe responsável
    por gera o buffer que será utilizado para realizar a leitura do arquivo .txt.
     */
    public static void leitor(String path) throws IOException {

        Scanner input = new Scanner(System.in);

        // responsável por exibir na tela as linhas do arquivo txt
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        /*
        método utilizado para obter o valor de uma linha (string), 
        no exemplo utilizado o valor da linha foi atribuída a uma variável do tipo String 
         */
        String linha = "";
        while (true) {
            if (linha != null) {

                System.out.println(linha);

            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();

        /*
        É de suma importância fechar os arquivos quando o método termina de utilizar os mesmos, 
        para isso basta utilizar o método close contido na classe de leitura ou escrita de arquivos.
         */
    }

    /*
    O método escritor tem como parâmetro de entrada o path (url/caminho) do arquivo que será escrito, 
    como pode ser visto na assinatura do método:
    
    public static void escritor(String path) throws IOException
    Esse método tem como principal objeto interno o BufferedWriter, 
    que nada mais é que a classe responsável por gerar o bufferque será utilizado para realizar a escrita no arquivo .txt.
     */
    public static void escritor(String path) throws IOException {

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }

    public static void main(String args[]) throws IOException {
        String path = "C:\\Users\\Jaqueline Oliveira\\Desktop\\Ciência da Computação - IFSC\\6 ª Fase\\Sistemas Distribuídos/file.txt";

        ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path);
    }

}
