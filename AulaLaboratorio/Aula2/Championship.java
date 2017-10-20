import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Championship{
    public static void main(String[] args) throws IOException {    
        Scanner sc = new Scanner(System.in);
        int nroMotos = sc.nextInt();
        Motorcycle[] motos = new Motorcycle[nroMotos]; 
        
        int nroInputs = sc.nextInt(); //nro de linhas que vai dar de input
        for( int i=0; i<nroMotos; i++ )
            motos[i] = new Motorcycle();
        
        for(int j=0;j<nroInputs;j++){
            BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
    
            int idMoto, varSpeed;
            String[] strNums;
            String line = bi.readLine();
            //System.out.println(line);
            strNums = line.split(" ");
            
            for(int i=0; i<strNums.length; i+= 2) {
                idMoto = Integer.parseInt(strNums[i]);
                varSpeed = Integer.parseInt(strNums[i+1]);
                idMoto -= 1001;
                if(varSpeed > 0)
                    motos[idMoto].speedUp(varSpeed);
                else
                    motos[idMoto].applyBreak(varSpeed);
            }
            for(int i=0;i<nroMotos;i++){
                int idzin = i + 1001;
                System.out.println("Moto " + idzin + ": Velocidade=" + motos[i].getSpeed() + ", Marcha=" + motos[i].getGear() + ". ");
            }
            
            
        
        }
        

    }
}