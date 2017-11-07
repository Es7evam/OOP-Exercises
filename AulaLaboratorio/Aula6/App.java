import java.util.Scanner;
import java.io.Console;

class App{
    public static void main(String[] args) {
    
		User user = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 1 para logar e 2 para cadastrar");
		int option = sc.nextInt();
		Console cnsl = null;
		cnsl = System.console();
	
		if(option == 1){
            user.setLogin(cnsl.readLine("Digite o seu login: "));            
            String pswd = cnsl.readPassword("Digite a sua senha: ").toString();
            user.setPass(user.getCrypto(pswd));
            ReadObject obj = new ReadObject();
            if(obj.readObj(user))
                System.out.println("Login com sucesso");
            else
                System.out.println("Falha no login");
		}else if(option == 2){
	    	WriteObject obj = new WriteObject();
		    obj.serializeAddress(user); //salva user no arquivo
		    user.setName(cnsl.readLine("Digite o seu nome completo: "));            
		    user.setLogin(cnsl.readLine("Digite o seu login desejado: "));            
            String pswd = cnsl.readPassword("Digite a sua senha desejada: ").toString();
            user.setPass(user.getCrypto(pswd));
		}else{
		    System.out.println("Opcao Invalida!!!11!");
		}
    }
}