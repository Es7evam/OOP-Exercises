class Leite extends Produto{
    private int validade;
    private double custoBeneficio;
    
    public Leite(String nome, double preco, int validade){
        super(nome, preco);
        this.validade = validade;
        this.custoBeneficio = preco/2 + (double)validade/preco;
    }
    
    public int getValidade(){
        return this.validade;
    }
    public void setValidade(int validade){
        this.validade = validade;
    }
    
    public int compareTo(Object prod){
        Leite prodCast = (Leite)prod;
        if(this.custoBeneficio == prodCast.custoBeneficio)
            return 0;
        else if(this.custoBeneficio > prodCast.custoBeneficio)
            return 1;
        else
            return -1;
    }
}