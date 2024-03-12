import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;
//import javax.swing.JFileChooser;
//import java.text.DecimalFormat;
//import java.util.InputMismatchException; //usado pra excecao de string no salario



public class Principal {

	public static void main(String[] args) throws IOException {

		//Scanner sc = new Scanner(System.in);
		//File diretorio = new File("d:\\java\\tmp");				
		//diretorio.mkdir();
		ArrayList<Medico> medicos = new ArrayList<Medico>();
		ArrayList<Enfermeiro> enfermeiros = new ArrayList<Enfermeiro>();
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		
		boolean cont = true;
		boolean cont2 = true;
		boolean cont3 = true;
		boolean cont4 = true;
		
		FileWriter fw = new FileWriter("Medicos.txt");
		FileWriter enfw = new FileWriter("Enfermeiros.txt");
		FileWriter pafw = new FileWriter("Pacientes.txt");
		PrintWriter pw = new PrintWriter(fw);
		PrintWriter ew = new PrintWriter(enfw);
		PrintWriter paw = new PrintWriter(pafw);
		
		//Inicializacao de auxiliares para tratamento de excecao
		int numMed = 0;
		int numEnf = 0;
		int numPac = 0;
		int sair = 1; 
		
		while (sair != 0){
			
			// Inicializacao de auxiliares para Indices
		int i = 0 ;
		int i2 = 0;
		int listar = 0;
			do{
				try{
					i = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha a Opcao: \n 1 - Adicionar \n 2 - Listar \n 3 - Sair \n"));
					cont2 = false;
				}
			catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Insira apenas números.");
				//System.out.println("Insira apenas números.");
			}
			}while(cont2 == true);

			if ( i == 1 ) {
				do {
					try {
						i2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha a Opcao: \n 1 - Medica(o) \n 2 - Enfermeira(o) \n 3 - Paciente \n"));
						cont3 = false;
					}
					catch(NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "Insira apenas números.");
						//System.out.println("Insira apenas números.");
					}
				}while(cont3 == true);
				
				if ( i2 == 1 ) {
						
						String nome = JOptionPane.showInputDialog(null,"Nome :");
					    String cpf = JOptionPane.showInputDialog(null,"CPF :");
					    String esp = JOptionPane.showInputDialog(null,"Especializacao :");
					    String crm = JOptionPane.showInputDialog(null,"CRM :");
					    double salario = 0;
					    int horaextra = 0;
					    cont = true;
					    do {
					    	try {
					    		salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Salario:"));
					    		if(salario < 0) throw new NegativeNumberException("O número é negativo.");
					    		cont = false; 
					    	}
					    	catch(NegativeNumberException nne){
					    		JOptionPane.showMessageDialog(null, "O número é negativo.");
								//System.out.println("Número negativo.");
							}
					    	catch(NumberFormatException nfe) {
					    		JOptionPane.showMessageDialog(null, "Insira apenas números.");
								//System.out.println("Insira apenas números.");
							}
					    }while(cont == true);
					    cont = true;
					    do {
					    	try {
					    		horaextra = Integer.parseInt(JOptionPane.showInputDialog(null, "Horas extras : "));
					    		if(horaextra < 0) throw new NegativeNumberException("O número é negativo.");
					    		cont = false; 
					    	}
					    	catch(NegativeNumberException nne){
					    		JOptionPane.showMessageDialog(null, "O número é negativo.");
					    		//System.out.println("Número negativo.");
							}
					    	catch(NumberFormatException nfe) {
					    		JOptionPane.showMessageDialog(null, "Insira apenas números.");
					    		//System.out.println("Insira apenas números.");
							}
					    }while(cont == true);
					    
					    Pessoa medico = new Medico(crm,salario,horaextra,esp,nome,cpf);
						medicos.add((Medico) medico);
						JOptionPane.showMessageDialog(null, "Medico(a) adicionado com sucesso");
					    pw.println(medicos.get(numMed).toString()); //Escrevendo no Arquivo
					    pw.flush();	//Necessario para funcionar a escrita
					    numMed++;
					    
					}
				if ( i2 == 2) {
						
				        String nome = JOptionPane.showInputDialog(null,"Nome :");
					    String cpf = JOptionPane.showInputDialog(null,"CPF :");
					    String crf = JOptionPane.showInputDialog(null,"CRF :");
					    double salario = 0;
					    int horaextra = 0;
					    cont = true;
					    do {
					    	try {
					    		salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Salario:"));
					    		if(salario < 0) throw new NegativeNumberException("O número é negativo.");
					    		cont = false; 
					    	}
					    	catch(NegativeNumberException nne){
					    		JOptionPane.showMessageDialog(null, "O número é negativo.");
					    		//System.out.println("Número negativo.");
							}
					    	catch(NumberFormatException nfe) {
					    		JOptionPane.showMessageDialog(null, "Insira apenas números.");
								//System.out.println("Insira apenas números.");
							}
					    }while(cont == true);
					    cont = true;
					    do {
					    	try {
					    		horaextra = Integer.parseInt(JOptionPane.showInputDialog(null, "Horas extras :"));
					    		if(horaextra < 0) throw new NegativeNumberException("O número é negativo.");
					    		cont = false; 
					    	}
					    	catch(NegativeNumberException nne){
					    		JOptionPane.showMessageDialog(null, "O número é negativo.");
					    		//System.out.println("Número negativo.");
							}
					    	catch(NumberFormatException nfe) {
					    		JOptionPane.showMessageDialog(null, "Insira apenas números.");
								//System.out.println("Insira apenas números.");
							}
					    }while(cont == true);
					   
					    Pessoa enfermeiro = new Enfermeiro(crf, salario, horaextra, nome,cpf);
					    enfermeiros.add((Enfermeiro) enfermeiro);
					    JOptionPane.showMessageDialog(null, "Enfermeiro(a) Adicionado com Sucesso");
					    ew.println(enfermeiros.get(numEnf).toString());
					    ew.flush();
					    numEnf++;
					    
				}
				if ( i2 == 3) {
						
				        String nome = JOptionPane.showInputDialog(null,"Nome :");
					    String cpf = JOptionPane.showInputDialog(null,"CPF :");
					    String condicao = JOptionPane.showInputDialog(null,"Condicao :");
					    String doenca = JOptionPane.showInputDialog(null,"Enfermidade :");
					    
					    Pessoa paciente = new Paciente(nome,cpf,condicao,doenca);
					    
					    pacientes.add((Paciente)paciente);
					    JOptionPane.showMessageDialog(null, "Paciente Adicionado Com Sucesso");
					    paw.println(pacientes.get(numPac).toString());
					    paw.flush();
				}	
			}else if ( i == 2 ) {
				
				do {
					try {
						listar = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha a Opcao: \n 1 - Medica(o) \n 2 - Enfermeira(o) \n 3 - Paciente \n"));
						cont4 = false;
					}
					catch(NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "Insira apenas números.");
						//System.out.println("Insira apenas números.");
					}
				}while(cont4 == true);
				
				
				
				if ( listar == 1 ) {
				
					 FileReader f = new FileReader("Medicos.txt");
					 BufferedReader in = new BufferedReader(f);
					 String linha = in.readLine();
					 while(linha !=null ){
						 System.out.println(linha);
						 linha = in.readLine();
					 }
					 in.close();
					}
				if ( listar == 2 ) {
					
					FileReader f = new FileReader("Enfermeiros.txt");
					 BufferedReader in = new BufferedReader(f);
					 String linha = in.readLine();
					 while(linha !=null ){
						 System.out.println(linha);
						 linha = in.readLine();
					 }
					 in.close();
					}
				
				if ( listar == 3 ) {
					
					FileReader f = new FileReader("Pacientes.txt");
					 BufferedReader in = new BufferedReader(f);
					 String linha = in.readLine();
					 while(linha !=null ){
						 System.out.println(linha);
						 linha = in.readLine();
					 }
					 in.close();
					}
			}else sair = 0;
		}
		//Fechando writers
		pw.close();
		paw.close();
		ew.close();
	}
	
	
}