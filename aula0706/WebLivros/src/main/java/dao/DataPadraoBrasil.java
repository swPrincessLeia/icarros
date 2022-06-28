package dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataPadraoBrasil {

	public String data(Date data) {
	Date dataEntrada = data;
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    String dataFormatada = dateFormat.format(dataEntrada);
    return dataFormatada;
	}
	
	public String dataUSA(Date data) {
		Date dataEntrada = data;
	    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    String dataFormatada = dateFormat.format(dataEntrada);
	    return dataFormatada;
		}

}
