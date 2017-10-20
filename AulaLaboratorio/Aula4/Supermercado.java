class Supermercado{
    public static void main(String[] args) {
        int N = 3;
        
        Shampoo[] shampoo = new Shampoo[N];
        //nome, preco, irrit
        shampoo[0] = new Shampoo("Dove", 10.50, 3);
        shampoo[1] = new Shampoo("Loreal", 9.30, 2);
        shampoo[2] = new Shampoo("HeadShoulders", 14.99, 4);
        
        //nome,preco, qntCanc
        Biscoito[] biscoito = new Biscoito[N];
        biscoito[0] = new Biscoito("Mabel", 4.50, 2);
        biscoito[1] = new Biscoito("Bauduco", 3.00, 4);
        biscoito[2] = new Biscoito("Nesfit", 8.00, 1);
            
        //nome, preco, val
        Leite[] leite = new Leite[N];
        leite[0] = new Leite("Paulista", 3.50, 4);
        leite[1] = new Leite("Mineiro", 4.00, 10);
        leite[2] = new Leite("Outro", 2.00, 4);
        
        Shampoo melhorShampoo = shampoo[0];
        for(int i=1;i<N;i++){
            if(shampoo[i].compareTo(melhorShampoo) == 1)
                melhorShampoo = shampoo[i];
        }
        
        Leite melhorLeite = leite[0];
        for(int i=1;i<N;i++){
            if(leite[i].compareTo(melhorLeite) == 1)
                melhorLeite = leite[i];
        }
        
        Biscoito melhorBiscoito = biscoito[0];
        for(int i=1;i<N;i++){
            if(biscoito[i].compareTo(melhorBiscoito) == 1)
                melhorBiscoito = biscoito[i];
        }
        
        System.out.println("O melhor leite é o " + melhorLeite.getNome());
        System.out.println("O melhor shampoo é o " + melhorShampoo.getNome());
        System.out.println("O melhor biscoito é o " + melhorBiscoito.getNome());
    }
}