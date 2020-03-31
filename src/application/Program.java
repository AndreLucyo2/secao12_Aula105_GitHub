/**
 * @author Andre
 * 
 * @date 29/03/2020 12:37:45
 */
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class Program
{
	/**
	 * @param args
	 * 
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException
	{
		//-----------------------------------------------------------------------------
		//Somando uma unidade de tempo
		//-----------------------------------------------------------------------------
		// Definindo formato de data no objeto:
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2020-03-30T00:00:00Z"));//UTC - ver diferença em 
		
		//printa a data:
		System.out.println(sdf.format(d));
		
		//Chama uma instancia do calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);//definir a data do calendar
		cal.add(Calendar.HOUR_OF_DAY, 4);//adiciona a unidade que quiser, nesta caso +4hs
		
		//atualiza a data com a alteração		
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		System.out.println("==============================================");
		//-----------------------------------------------------------------------------
		//Obtendo uma unidade de tempo
		//-----------------------------------------------------------------------------
		//Mostra a data:
		System.out.println(sdf.format(d));
		
		//Chama uma instancia do calendar
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d);//definir a data do calendar
		
		//Pegar somente o valor dos minutos da data:
		int minutes = cal2.get(Calendar.MINUTE);
		//Pegar somente o mes dos minutos da data:
		int month = 1 + cal2.get(Calendar.MONTH);//no calendar janeiro é o mes 0, por isso soma-se 1
		
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
						
	}
}
