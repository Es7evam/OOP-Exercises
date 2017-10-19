class Superpoder{
	protected int _categoria;
	protected String _nome;
	protected int _intensidade;

	public Superpoder(int pCategoria, String pNome, int pIntensidade){
		this._categoria = pCategoria;
		this._nome = pNome;
		this._intensidade = pIntensidade;
	}

	public int getCategoria(){
		return this._categoria;
	}

	public String getNome(){
		return this._nome;
	}

	public void setCategoria(int pCategoria){
		this._categoria = pCategoria;
	}

	public void setNome(String pNome){
		this._nome = pNome;
	}
}