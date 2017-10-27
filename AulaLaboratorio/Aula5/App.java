class App{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        double answ;
        double a, b;
        
        a = 5; b = 2;
        
        try{
            answ = calc.div(a, b);
            System.out.print(a + " / " + b + " = ");
            System.out.println(answ);
        } catch (InvalidOperationException e){}
        
        try{
            System.out.println("");
            b = 0;
            answ = calc.div(a, b);
            System.out.print(a + "/ " + b + " = ");
            System.out.println(answ);
        } catch (InvalidOperationException e){}
        
        try{
            System.out.println("");
            a = 0;
            answ = calc.div(a, b);
            System.out.print(a + "/ " + b + " = ");
            System.out.println(answ);
        } catch (InvalidOperationException e){}
        
        a = 0;
        try{
            System.out.println("");
            answ = calc.log10(a);
            System.out.print("Log[10]" + a + " = ");
            System.out.println(answ);
        } catch (InvalidOperationException e){}
        
        a = 10;
        try{
            System.out.println("");
            answ = calc.log10(a);
            System.out.print("Log[10]" + a + " = ");
            System.out.println(answ);
        } catch (InvalidOperationException e){}
        
        a = 5;
        try{
            System.out.println("");
            answ = calc.log10(a);
            System.out.print("Log[10]" + a + " = ");
            System.out.println(answ);
        } catch (InvalidOperationException e){}


        try{
            System.out.println("");
            answ = calc.log10(-a);
            System.out.print("Log[10]" + a + " = ");
            System.out.println(answ);
        } catch (InvalidOperationException e){}      
    }
}