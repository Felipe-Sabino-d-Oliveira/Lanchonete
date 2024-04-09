package utilitarios;

//Código que limpa a tela do console após selecionar uma opção do menu 
public class LimparTela{
	public static void DeixarVazio(){
		try { // Verifica se o sistema operacional é windows
			if (System.getProperty("os.name").contains("Windows")){
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}
			else { // Caso não seja Windows 
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}