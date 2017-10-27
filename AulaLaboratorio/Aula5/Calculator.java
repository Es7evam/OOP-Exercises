class Calculator{
    
    double div(double a, double b) throws InvalidOperationException{
        double answ = 0;
        if(b == 0)
                throw new InvalidOperationException("Divisão inválida");
                
        answ = a / b;
        return answ;
            
        
    }
    double log10(double x) throws InvalidOperationException{
        double answ = 0;
        if(x <= 0)
            throw new InvalidOperationException("Não existe log menor ou igual a 0");
        
        answ = Math.log10(x);
        return answ;
    }
}