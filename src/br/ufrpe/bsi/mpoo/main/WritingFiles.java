package br.ufrpe.bsi.mpoo.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) {
		
		String nomeArquivo = "temp.txt";
		
		try {
			//assumindo a codifica��o padr�o
			FileWriter escritorArquivo = new FileWriter(nomeArquivo);
			
			//always wrap FileWrite in BufferedWriter
			BufferedWriter bw = new BufferedWriter(escritorArquivo);
			
			//Perceba que write() n�o adiciona caractere de nova linha automaticamente
			bw.write("Ol� galera,");
			bw.write("aqui temos algum texto.\n\n\n\n\n\n");
			bw.newLine();
			bw.write("Estamos escrevendo");
			bw.write(" o texto no arquivo.");
			
			//sempre feche arquivos.
			bw.close();
			
		
		}
		catch(IOException e) {
			System.out.println("Erro ao tentar escrever no arquivo " + nomeArquivo);
		}
		
	}

}
