class Biscoito extends Produto{
    private int qntCancerigeno;
    private double custoBeneficio;
    
    public Biscoito(String nome, double preco, int qntCancerigeno){
        super(nome, preco);
        this.qntCancerigeno = qntCancerigeno;
        this.custoBeneficio = 1/((double)qntCancerigeno * 10)*preco;
    }
    
    public int getQntCancerigeno(){
        return this.qntCancerigeno;
    }
    public void setQntCancerigeno(int qntCancerigeno){
        this.qntCancerigeno = qntCancerigeno;
        this.custoBeneficio = 1/((double)qntCancerigeno * 10)*getPreco();
    }
    
    public int compareTo(Object prod){
        Biscoito prodCast = (Biscoito)prod;
        if(this.custoBeneficio == prodCast.custoBeneficio)
            return 0;
        else if(this.custoBeneficio > prodCast.custoBeneficio)
            return 1;
        else
            return -1;
    }
}