/**
 * 
 */
package maquinadelavar;
import java.io.*;
import java.util.Scanner;
import java.lang.Thread;
/**
 * @author Gustavo
 *
 */
public class maquina {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
				int codigomaquina = 0,  voltagemmaquina = 0, kg = 0, estagioinicial = 0;
				int tempopesado = 0, temponormal = 0, tempoleve = 0, tempoenxague = 0, tempocentrifuga��o = 0;
				double lava��opesada = 0 , lava��onormal = 0 , lava��oleve = 0, enxague = 0 , centrifuga��o = 0;
				int confirma��o = 0;
				int i = 0;
				int continuacao = 0;
		
				String modelo ="";String nomemaquina = "";
		
		do {
				System.out.println("================================================");
				System.out.println("Menu de Simula��o");
				System.out.println("================================================");
				System.out.println("1 - Configurar a sua m�quina de lavar");
				System.out.println("2 - Simular a maquina de lavar");
				System.out.println("0 - Sair");
				System.out.println("Digite o c�digo");
				codigomaquina = teclado.nextInt();
				
						if(codigomaquina >= 2) {
				do {
						System.out.println("Erro Tente novamente");
						System.out.println("================================================");
						System.out.println("Menu de Simula��o");
						System.out.println("================================================");
						System.out.println("1 - Configurar a sua m�quina de lavar");
						System.out.println("2 - Simular a maquina de lavar");
						System.out.println("0 - Sair");
						System.out.println("Digite o c�digo");
						codigomaquina = teclado.nextInt();
						
				}while(codigomaquina >= 2 );
						}
				
				
				if(codigomaquina == 0) {
					System.out.println("Obrigado pela preferencia");
					break;
				}
				
				
				if(codigomaquina == 1) {
					
					System.out.println("================================================");
					System.out.println("CONFIGURA��O DA MAQUINA DE LAVAR");
					System.out.println("================================================");
					System.out.println("Digite o Modelo sem espa�o:");
					modelo = teclado.next();
					System.out.println("Digite o Nome sem espa�o:");
					nomemaquina = teclado.next();
					
				do {
					System.out.println("Voltagem: (220 ou 110)");
					voltagemmaquina = teclado.nextInt();
				} while(voltagemmaquina != 220 && voltagemmaquina != 110);
					
					System.out.println("Quantos kg");
					kg = teclado.nextInt();
					System.out.println("Dura��o o estagio 1 - Lava��o Pesada: ");
					tempopesado = teclado.nextInt();
					System.out.println("Dura��o do estagio 2 - Lava��o Normal: ");
					temponormal = teclado.nextInt();
					System.out.println("Dura��o do estagio 3 - Lava��o Leve: ");
					tempoleve = teclado.nextInt();
					System.out.println("Dura��o do Estagio 4 - Enxague: ");
					tempoenxague = teclado.nextInt();
					System.out.println("Dura��o do Estagio 5 - Centrifuga��o: ");
					tempocentrifuga��o = teclado.nextInt();
					
				}
					
					System.out.println("================================================");
					System.out.println("SIMULA��O DA MAQUINA DE LAVAR");
					System.out.println("================================================");
					System.out.println("Simulando o modelo "+ modelo + "- Nome da maquina " + nomemaquina + "- tem capacidade para " + kg + "kg voltagem: "+ voltagemmaquina);
					System.out.println("Digite 2) para refazer as configura��es ou 1) para continuar");
					confirma��o = teclado.nextInt();
					
			
		
			
				if(confirma��o > 3) {
				do {
					System.out.println("Erro tente novamente");
					System.out.println("Digite 2) para refazer as configura��es ou 1) para continuar");
					confirma��o = teclado.nextInt();
				}while(confirma��o > 3);
				}
			
				while(confirma��o == 2) {
				
					System.out.println("================================================");
					System.out.println("CONFIGURA��O DA MAQUINA DE LAVAR");
					System.out.println("================================================");
					System.out.println("Digite o Modelo sem espa�o:");
					modelo = teclado.next();
					System.out.println("Digite o Nome sem espa�o:");
					nomemaquina = teclado.next();
				
				do {
					System.out.println("Voltagem: (220 ou 110)");
					voltagemmaquina = teclado.nextInt();
				} while(voltagemmaquina != 220 && voltagemmaquina != 110);
				
					System.out.println("Quantos kg");
					kg = teclado.nextInt();
					System.out.println("Dura��o o estagio 1 - Lava��o Pesada: ");
					tempopesado = teclado.nextInt();
					System.out.println("Dura��o do estagio 2 - Lava��o Normal: ");
					temponormal = teclado.nextInt();
					System.out.println("Dura��o do estagio 3 - Lava��o Leve: ");
					tempoleve = teclado.nextInt();
					System.out.println("Dura��o do Estagio 4 - Enxague: ");
					tempoenxague = teclado.nextInt();
					System.out.println("Dura��o do Estagio 5 - Centrifuga��o: ");
					tempocentrifuga��o = teclado.nextInt();
				
					System.out.println("================================================");
					System.out.println("SIMULA��O DA MAQUINA DE LAVAR");
					System.out.println("================================================");
					System.out.println("Simulando o modelo "+ modelo + "- Nome da maquina " + nomemaquina + "- tem capacidade para " + kg + "kg voltagem: "+ voltagemmaquina);
					System.out.println("Digite 2) para refazer as configura��es ou 1) para continuar");
					confirma��o = teclado.nextInt();
				}
			
		
			if(confirma��o == 1) {
					System.out.println("================================================");
					System.out.println("QUAL EST�GIO VOCE DESEJA COM��AR");
					System.out.println("================================================");
					System.out.println("1 - Lava��o pessada:");
					System.out.println("2 - Lava��o normal");
					System.out.println("3 - Lava��o leve");
					System.out.println("4 - Enxague");
					System.out.println("5 - Centrifuga��o");
					System.out.println("selecione o estagio inicial: ");
					estagioinicial = teclado.nextInt();
			}
			
			
			switch (estagioinicial) {
				case 1:
					for (i = 0; i < 5; i++ ){	
						lava��opesada = lava��opesada + 20;
						System.out.println("Estagio 1 - Lava��o pesada : " + lava��opesada + "%");
						Thread.sleep(tempopesado*1000);
					}
						System.out.println("");
				
				case 2:
					for (i = 0; i < 5; i++ ){
						lava��onormal = lava��onormal + 20;
						System.out.println("Estagio 2 - Lava��o normal : " + lava��onormal + "%");
						Thread.sleep(temponormal*1000);
					}
						System.out.println("");
				
			case 3:
					for (i = 0; i < 5; i++ ){
						lava��oleve = lava��oleve + 20;
						System.out.println("Estagio 3 - Lava��o leve : " + lava��oleve + "%");
						Thread.sleep(tempoleve*1000);
					}
						System.out.println("");
				
			case 4 :
					for (i = 0; i < 5; i++ ){
						enxague = enxague + 20;
						System.out.println("Estagio 4 - Em Enxague : " + enxague + "%");
						Thread.sleep(tempoenxague*1000);
					}
					System.out.println("");
			
			case 5 :
					for (i = 0; i < 5; i++ ){
						centrifuga��o = centrifuga��o + 20;
						System.out.println("Estagio 5 - Centrifuga��o : " + centrifuga��o + "%");
						Thread.sleep(tempocentrifuga��o*1000);
					}	
			}
							lava��opesada = 0;
							lava��onormal = 0;
							lava��oleve = 0;
							enxague = 0;
							centrifuga��o = 0;
							tempopesado= 0;
							tempoenxague= 0;
							tempoleve= 0;
							temponormal= 0;
							tempopesado= 0;
			
			
					
						System.out.println("Digite 2) para continuar e 0) para encerra");
						continuacao = teclado.nextInt();
					if (continuacao != 2 && continuacao != 0) {
						do {
							System.out.println("Erro tente novamente");
							System.out.println("Digite 2) para continuar e 0) para encerra");
							continuacao = teclado.nextInt();
							}while(continuacao != 2 && continuacao != 0);
					}
					
				
					
					if(continuacao ==0) {
						System.out.println("Volte sempre");
						break;
					}
						
	
	}while(continuacao == 2);
		
		
		
		
		
	
		
		
		
		
		
			
		}
		
	}
