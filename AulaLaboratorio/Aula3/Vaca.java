public class Vaca extends Animal{
    private boolean deCorte;
    
    public Vaca(String nomeVaca, int numeroPatas){
        super(nomeVaca, numeroPatas);     
        deCorte = false;
    }
    
    public Vaca(String nomeVaca, int numeroPatas, boolean deCorte){
        super(nomeVaca, numeroPatas);     
        this.deCorte = deCorte;
    }
    
    public void emitirSom(){
        System.out.println("Muuu");
    }
    public void toStr(){
        characteristics();
        if(deCorte)
            System.out.println("Vaca de corte");
        else
            System.out.println("Vaca leiteira");
    }
}