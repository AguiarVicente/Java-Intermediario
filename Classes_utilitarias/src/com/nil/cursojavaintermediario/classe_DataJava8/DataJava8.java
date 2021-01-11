package com.nil.cursojavaintermediario.classe_DataJava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;


public class DataJava8 {

	public static void main(String[] args) {
		
		// data dd MM yyyy
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		System.out.println(LocalDate.of(2021, 1, 10));
		System.out.println(LocalDate.parse("2021-01-10"));
		
		System.out.println(agora.plusDays(30));
		
		System.out.println(agora.minus(1, ChronoUnit.MONTHS));
		
		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.getDayOfMonth());
		System.out.println(agora.getDayOfYear());
		
		System.out.println(LocalDate.parse("2020-01-10").isLeapYear());
		
		LocalTime hAgora = LocalTime.now();
		System.out.println(hAgora);
		
		System.out.println(LocalTime.of(20, 18));
		System.out.println(LocalTime.parse("20:58"));
		
		System.out.println(hAgora.plusMinutes(50));
		System.out.println(hAgora.minus(40, ChronoUnit.MINUTES));
		
		System.out.println(hAgora.getMinute());
		
		// data completa = data + hora
		LocalDateTime agoraCompleta = LocalDateTime.now();
		System.out.println(agoraCompleta);
		
		System.out.println(agoraCompleta.plusYears(30));
		
		System.out.println(LocalDateTime.of(2021, 1, 10, 22, 9));
		System.out.println(LocalDateTime.parse("2021-01-10T22:09"));
		System.out.println(agoraCompleta.plusYears(10));
		
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
//		Set<String> fusos = ZoneId.getAvailableZoneIds();
//		for( String fs : fusos) {
//			System.out.println(fs);
//		}
		
		ZoneId sp = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2021-01-10T22:09"), sp);
		System.out.println(zdt);
		System.out.println(ZonedDateTime.parse("2021-01-10T22:09-03:00[America/Sao_Paulo]"));
		
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleta, offset);
		System.out.println(offsetdt);

		Date date = new Date();
		Calendar c = Calendar.getInstance();
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
		
		System.out.println(ldtDate);
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
	}

}
