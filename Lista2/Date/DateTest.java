public class DateTest {
    public static void main(String[] args) {
    	Date data1 = new Date();
    	Date data2 = new Date(24, 9, 1997);

    	//Prints usando método
    	data1.displayDate();
    	data2.displayDate();

    	//Testando o set
    	data1.setDia(20);
    	data1.setMes(10);
    	data1.setAno(2003);
    	data1.displayDate();

    	//Testando o get
    	System.out.print("Dia = " + data1.getDia());
        System.out.print("; Mes = " + data1.getMes());
        System.out.println("; Ano = " + data1.getAno() + ";");
   	}
}