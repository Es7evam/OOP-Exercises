import java.util.*;

class Personagem{
	private String _nome;
	private String _nomeVidaReal;
	ArrayList<Superpoder> _poderes = new ArrayList<Superpoder>();

	private int _vida;
	
	public Personagem(String pNome, String pNomeVidaReal){
		this._nome = pNome;
		this._nomeVidaReal = pNomeVidaReal;
		this._vida = 100;
	}
	

	public String getNome(){
		return this._nome;
	}
	public String getNomeVidaReal(){
		return this._nomeVidaReal;
	}
	public void getTotalPoder(){ //MUDAR AQUI ______________________
		Superpoder tmp;
		for(int i=0;i < _poderes.size();i++){
			tmp = _poderes.get(i);
		}
	}

	public void setNome(String pNome){
		this._nome = pNome;
	}
	public void setNomeVidaReal(String pNomeVidaReal){
		this._nomeVidaReal = pNomeVidaReal;
	}

	public int getVida(){
		return this._vida;
	}

	public void setVida(int pVida){
		this._vida = pVida;
	}

	public boolean estaMorto(){
		if (this.getVida() == 0){
			this.setVida(0);
			return true;
		}
		else
			return false;
	}

	public void atacar(int intensidade, String nomePoder, Personagem alvo){
		int rand = (int)(2*Math.random());
		if(rand == 0){
			if(alvo instanceof SuperHeroi)
				System.out.println("O ataque do vilao falhou!");
			if(alvo instanceof Vilao)
				System.out.println("O ataque do heroi falhou!");
			return;
		}

		alvo._vida -= intensidade;
		System.out.print(alvo._nome + " foi atacado com um " + nomePoder);
		System.out.println(" e perdeu " + intensidade + " de vida!");
		
		if(alvo._vida < 0)
			alvo._vida = 0;
		if(alvo instanceof Vilao){
			System.out.println("O vilao agora resta com " + alvo._vida + " de hp.");
		}
		else if(alvo instanceof SuperHeroi){
			System.out.println("O heroi agora resta com " + alvo._vida + " de hp.");
		}
	}

	public void addPoder(int pCategoria, String pNomePoder, int pIntensidade){
		Superpoder pPoder = new Superpoder(pCategoria, pNomePoder, pIntensidade);
		this._poderes.add(pPoder);
	}
}