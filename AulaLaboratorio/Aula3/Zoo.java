public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal("Bicho", 8);
        Vaca vaca = new Vaca("Mimosa",4, true);
        Gato gato = new Gato("Garfield",4, "Vermelho");
        Ovelha ovelha = new Ovelha("Dolly",4, "Preta");
        Animal bichos[] = {animal,  vaca, gato, ovelha};
        if(vaca instanceof Animal)
            System.out.println("vaca eh Animal");
        if(gato instanceof Animal)
            System.out.println("gato eh Animal");
        if(ovelha instanceof Animal) 
            System.out.println("ovelha eh Animal");
        
        System.out.println("__________________");
        for(int i = 0; i< bichos.length; i++) {
            //System.out.print(bichos[i].nome);
            /*if(bichos[i] instanceof Vaca)
                ((Vaca) bichos[i]).toStr();
            
            if(bichos[i] instanceof Gato)
                ((Gato) bichos[i]).toStr();
            
            if(bichos[i] instanceof Ovelha) 
                ((Ovelha) bichos[i]).toStr();
            */
            bichos[i].toStr();
            
            System.out.println();
        }
    }
}