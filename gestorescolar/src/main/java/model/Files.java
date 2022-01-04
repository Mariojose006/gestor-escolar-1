/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Files {
   //leitura
   public static ArrayList read(String path){
       //verificar se o arquivo existe
       ArrayList linesFile = new ArrayList();
       File file = new File(path);
       Scanner reader =null; //new Scanner(file);
       
       if(file.canRead()){
           while (reader.hasNextLine()) {              
              // conteudo.append(leitor.nextLine()).append("\r\n");
              linesFile.add((reader.nextLine()));
         }
           return linesFile;
       }
       else{
           System.out.println("O arquivo nao pode ser aberto");
       }
       return null;
   }
    //escrita
}
