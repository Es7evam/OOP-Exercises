class InvalidOperationException extends Exception{
    public InvalidOperationException(){
        System.out.println("Operação Invalida");
        this.printStackTrace();
    }
    
    public InvalidOperationException(String msg){
        super(msg);
        this.printStackTrace();
    }
    //System.out.println("Não existe log de número negativo");
}