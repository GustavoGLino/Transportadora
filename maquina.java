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
				int tempopesado = 0, temponormal = 0, tempoleve = 0, tempoenxague = 0, tempocentrifugação = 0;
				double lavaçãopesada = 0 , lavaçãonormal = 0 , lavaçãoleve = 0, enxague = 0 , centrifugação = 0;
				int confirmação = 0;
				int i = 0;
				int continuacao = 0;
		
				String modelo ="";String nomemaquina = "";
		
		do {
				System.out.println("================================================");
				System.out.println("Menu de Simulação");
				System.out.println("================================================");
				System.out.println("1 - Configurar a sua máquina de lavar");
				System.out.println("2 - Simular a maquina de lavar");
				System.out.println("0 - Sair");
				System.out.println("Digite o código");
				codigomaquina = teclado.nextInt();
				
						if(codigomaquina >= 2) {
				do {
						System.out.println("Erro Tente novamente");
						System.out.println("================================================");
						System.out.println("Menu de Simulação");
						System.out.println("================================================");
						System.out.println("1 - Configurar a sua máquina de lavar");
						System.out.println("2 - Simular a maquina de lavar");
						System.out.println("0 - Sair");
						System.out.println("Digite o código");
						codigomaquina = teclado.nextInt();
						
				}while(codigomaquina >= 2 );
						}
				
				
				if(codigomaquina == 0) {
					System.out.println("Obrigado pela preferencia");
					break;
				}
				
				
				if(codigomaquina == 1) {
					
					System.out.println("================================================");
					System.out.println("CONFIGURAÇÃO DA MAQUINA DE LAVAR");
					System.out.println("================================================");
					System.out.println("Digite o Modelo sem espaço:");
					modelo = teclado.next();
					System.out.println("Digite o Nome sem espaço:");
					nomemaquina = teclado.next();
					
				do {
					System.out.println("Voltagem: (220 ou 110)");
					voltagemmaquina = teclado.nextInt();
				} while(voltagemmaquina != 220 && voltagemmaquina != 110);
					
					System.out.println("Quantos kg");
					kg = teclado.nextInt();
					System.out.println("Duração o estagio 1 - Lavação Pesada: ");
					tempopesado = teclado.nextInt();
					System.out.println("Duração do estagio 2 - Lavação Normal: ");
					temponormal = teclado.nextInt();
					System.out.println("Duração do estagio 3 - Lavação Leve: ");
					tempoleve = teclado.nextInt();
					System.out.println("Duração do Estagio 4 - Enxague: ");
					tempoenxague = teclado.nextInt();
					System.out.println("Duração do Estagio 5 - Centrifugação: ");
					tempocentrifugação = teclado.nextInt();
					
				}
					
					System.out.println("================================================");
					System.out.println("SIMULAÇÃO DA MAQUINA DE LAVAR");
					System.out.println("================================================");
					System.out.println("Simulando o modelo "+ modelo + "- Nome da maquina " + nomemaquina + "- tem capacidade para " + kg + "kg voltagem: "+ voltagemmaquina);
					System.out.println("Digite 2) para refazer as configurações ou 1) para continuar");
					confirmação = teclado.nextInt();
					
			
		
			
				if(confirmação > 3) {
				do {
					System.out.println("Erro tente novamente");
					System.out.println("Digite 2) para refazer as configurações ou 1) para continuar");
					confirmação = teclado.nextInt();
				}while(confirmação > 3);
				}
			
				while(confirmação == 2) {
				
					System.out.println("================================================");
					System.out.println("CONFIGURAÇÃO DA MAQUINA DE LAVAR");
					System.out.println("================================================");
					System.out.println("Digite o Modelo sem espaço:");
					modelo = teclado.next();
					System.out.println("Digite o Nome sem espaço:");
					nomemaquina = teclado.next();
				
				do {
					System.out.println("Voltagem: (220 ou 110)");
					voltagemmaquina = teclado.nextInt();
				} while(voltagemmaquina != 220 && voltagemmaquina != 110);
				
					System.out.println("Quantos kg");
					kg = teclado.nextInt();
					System.out.println("Duração o estagio 1 - Lavação Pesada: ");
					tempopesado = teclado.nextInt();
					System.out.println("Duração do estagio 2 - Lavação Normal: ");
					temponormal = teclado.nextInt();
					System.out.println("Duração do estagio 3 - Lavação Leve: ");
					tempoleve = teclado.nextInt();
					System.out.println("Duração do Estagio 4 - Enxague: ");
					tempoenxague = teclado.nextInt();
					System.out.println("Duração do Estagio 5 - Centrifugação: ");
					tempocentrifugação = teclado.nextInt();
				
					System.out.println("================================================");
					System.out.println("SIMULAÇÃO DA MAQUINA DE LAVAR");
					System.out.println("================================================");
					System.out.println("Simulando o modelo "+ modelo + "- Nome da maquina " + nomemaquina + "- tem capacidade para " + kg + "kg voltagem: "+ voltagemmaquina);
					System.out.println("Digite 2) para refazer as configurações ou 1) para continuar");
					confirmação = teclado.nextInt();
				}
			
		
			if(confirmação == 1) {
					System.out.println("================================================");
					System.out.println("QUAL ESTÁGIO VOCE DESEJA COMÊÇAR");
					System.out.println("================================================");
					System.out.println("1 - Lavação pessada:");
					System.out.println("2 - Lavação normal");
					System.out.println("3 - Lavação leve");
					System.out.println("4 - Enxague");
					System.out.println("5 - Centrifugação");
					System.out.println("selecione o estagio inicial: ");
					estagioinicial = teclado.nextInt();
			}
			
			
			switch (estagioinicial) {
				case 1:
					for (i = 0; i < 5; i++ ){	
						lavaçãopesada = lavaçãopesada + 20;
						System.out.println("Estagio 1 - Lavação pesada : " + lavaçãopesada + "%");
						Thread.sleep(tempopesado*1000);
					}
						System.out.println("");
				
				case 2:
					for (i = 0; i < 5; i++ ){
						lavaçãonormal = lavaçãonormal + 20;
						System.out.println("Estagio 2 - Lavação normal : " + lavaçãonormal + "%");
						Thread.sleep(temponormal*1000);
					}
						System.out.println("");
				
			case 3:
					for (i = 0; i < 5; i++ ){
						lavaçãoleve = lavaçãoleve + 20;
						System.out.println("Estagio 3 - Lavação leve : " + lavaçãoleve + "%");
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
						centrifugação = centrifugação + 20;
						System.out.println("Estagio 5 - Centrifugação : " + centrifugação + "%");
						Thread.sleep(tempocentrifugação*1000);
					}	
			}
							lavaçãopesada = 0;
							lavaçãonormal = 0;
							lavaçãoleve = 0;
							enxague = 0;
							centrifugação = 0;
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
