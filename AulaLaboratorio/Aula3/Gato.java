public class Gato extends Animal{
    private String corPelo;
    
    public Gato(String nomeGato, int numeroPatas){
        super(nomeGato, numeroPatas);
        corPelo = "Preto";
    }
    
    public Gato(String nomeGato, int numeroPatas, String corPelo){
        super(nomeGato, numeroPatas);     
        this.corPelo = corPelo;
    }
    
    public void emitirSom(){
        System.out.println("Miau");
    }
    
    public void toStr(){
        characteristics();
        System.out.println("A cor do pelo é: " + corPelo);
    }
}