class Date{
	private int mes, dia, ano;

	public Date(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		//assumido que valores são válidos
	}
	public Date(){
		this.dia = 1;
		this.mes = 1;
		this.ano = 2001;
		//assumido que valores são válidos
	}

	public int getDia(){
		return this.dia;	
	}
	
	public int getMes(){
		return this.mes;
	}
	
	public int getAno(){
		return this.ano;
	}
	
	public void setDia(int dia){
		this.dia = dia;
	}

	public void setMes(int mes){
		this.mes = mes;
		
	}

	public void setAno(int ano){
		this.ano = ano;
	}

	public void displayDate(){
		System.out.println("Data:");
		System.out.println(this.dia + "/" + this.mes + "/"  + this.ano);
	}
}