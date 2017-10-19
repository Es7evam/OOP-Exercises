class Batalha{

    public static void main(String[] args) {
		Vilao theVillain = new Vilao("Setnara", "Arantes");
		SuperHeroi theHero = new SuperHeroi("Mavetse", "Estevam");
		theHero.addPoder(2, "Explosao", 15);
		theHero.addPoder(2, "Telecinese", 20);
		theHero.addPoder(3, "LaserBeam", 23);

		theVillain.addPoder(1, "Soco", 2);
		theVillain.addPoder(1, "Chute", 5);
		theVillain.addPoder(4, "RaioLetal", 38);

		System.out.println("A luta comeca!");
		System.out.println();

		while(!(theHero.estaMorto()) && !(theVillain.estaMorto())){
			Superpoder ataque;

			//ataque heroi
			ataque = theHero._poderes.get((int)(3*Math.random()) % 3);
			theHero.atacar(ataque._intensidade, ataque._nome, theVillain);

			//ataque vilão
			ataque = theVillain._poderes.get((int)(3*Math.random()) % 3);
			theVillain.atacar(ataque._intensidade, ataque._nome, theHero);

			System.out.println();
		}

		if(theHero.estaMorto())
			System.out.println("O vilao venceu :(");
		else
			System.out.println("O heroi venceu :D");
	}
}