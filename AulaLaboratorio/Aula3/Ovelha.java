public class Ovelha extends Animal{
    private String corLan;
    
    public Ovelha(String nomeOvelha, int numeroPatas){
        super(nomeOvelha, numeroPatas);  
        corLan = "Branco";
    }
    public Ovelha(String nomeOvelha, int numeroPatas, String corLan){
        super(nomeOvelha, numeroPatas);  
        this.corLan = corLan;
    }
    public void emitirSom(){
        System.out.println("Meeeh");
    }
    
    public void toStr(){
        characteristics();
        System.out.println("A cor da lã é: " + corLan);
    }
}