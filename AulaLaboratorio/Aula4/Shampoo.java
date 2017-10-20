class Shampoo extends Produto{
    private int irritabilidade;
    private double custoBeneficio;
    
    public Shampoo(String nome, double preco, int irritabilidade){
        super(nome, preco);
        this.irritabilidade = irritabilidade;
        this.custoBeneficio = 1/(preco*((double)irritabilidade * 2));
    }
    
    public int getIrritabilidade(){
        return this.irritabilidade;
    }
    public void setIrritabilidade(int irritabilidade){
        this.irritabilidade = irritabilidade;
    }
    
    public int compareTo(Object prod){
        Shampoo prodCast = (Shampoo)prod;
        if(this.custoBeneficio == prodCast.custoBeneficio)
            return 0;
        else if(this.custoBeneficio > prodCast.custoBeneficio)
            return 1;
        else
            return -1;
    }
}