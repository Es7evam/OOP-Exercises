public class Animal{
    private String nome;
    private int numeroPatas;
    
    public Animal(String nome, int numeroPatas){
        this.nome = nome;
        this.numeroPatas = numeroPatas;
    }
    
    public void emitirSom(){
        System.out.println("FALAI GALERA AQUI É O LUAN GAMEPLAYS");
    }
    
    final public void characteristics(){
        System.out.println("Nome: " + nome + "; Tem " + numeroPatas + " patas.");
        System.out.print("Emite o som: ");
        emitirSom();
    }
    public void toStr(){
        characteristics();
    }
}
