class Vilao extends Personagem{
	protected int _anosDePrisao;

	public Vilao(String pNome, String pNomeVidaReal){
		super(pNome, pNomeVidaReal);
	}

	public int getAnosDePrisao(){
		return this._anosDePrisao;
	}

	public void setAnosDePrisao(int pAnosDePrisao){
		this._anosDePrisao = pAnosDePrisao;
	}
	
}