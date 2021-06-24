package myapp.metodos;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Calendario {
	public static void main(String[] args) {

		
		Date hoje = new Date();
		String relogio = DateFormat.getInstance().format(hoje);
		String calendario = DateFormat.getInstance().format(hoje);
		
		relogio = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(relogio);
		
		
		calendario = DateFormat.getDateInstance(DateFormat.SHORT).format(hoje);
		System.out.println(calendario);
		
		System.out.println(calendario +" "+ relogio);
		
		//String padrao = "##.###.###/####-##"; //99.999.999/0001-01
		//DecimalFormat df = new DecimalFormat (padrao);
		
		//DATA
		//LocalDate agora = LocalDate.now();
		//System.out.println(agora);
		
		//HORARIO
		//LocalTime hAgora = LocalTime.now();
		//System.out.println(hAgora);
		
		// Data completa
		//LocalDateTime agoraCompleto = LocalDateTime.now();
		//System.out.println(agoraCompleto);
		
		//Data ordem correta 19-jun.-2021 12:17:10 PM
		//Calendar agora2 = Calendar.getInstance();
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		//System.out.println(sdf.format(agora2.getTime()));
		
		//Date hoje = new Date();
		//String relogio = DateFormat.getInstance().format(hoje);
		//String calendario = DateFormat.getInstance().format(hoje);
		//System.out.println(hojeFormatado);
		
		//hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		//System.out.println(hojeFormatado);
		
		
	}

}
