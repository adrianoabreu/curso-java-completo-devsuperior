package curso_programacao_orientacao_a_objetos_main;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class TratandoCalendar {

	public static void main(String[] args) {
		
		//Somando uma unidade de tempo:
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //o hor�rio 12:42:07 se d� por conta do fuso hor�rio de 3h com o horario dos Estados Unidos.
		
		System.out.println(sdf.format(d));
		
		//Para adicionar anos, meses, dias, horas, minutos e segundos, usamos a classe Calendar.
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); //nesse momento est� adicionando 4 horas.
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		//------------------------------------------------------------------------------
		
		//Obtendo uma unidade de tempo:
		int minutos = cal.get(Calendar.MINUTE);   //Obtendo os minutos de um determinado hor�rio.
		int mes     = 1 + cal.get(Calendar.MONTH);//Obtendo o m�s de uma determinada data. Acrescenta-se + 1 por que Janeiro come�a com valor 0. 
		
		System.out.println("Minutos: " + minutos);
		System.out.println("M�s:     " + mes);
		
	}

}
