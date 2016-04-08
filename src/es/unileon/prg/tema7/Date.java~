package es.unileon.prg.tema7;


public class Date
{

	private int year;
	private int month;
	private int day;
	

	//Inicio de la modificación Apartado030101 Ejercicio 1
	
	public Date(int day, int month, int year)
	{
		today = new Date("fecha");
		this.day = day;
		this.month = month;
		this.year = year;
		this.dayofMonth = month; // MAL. No es un metodo

		Date(int day, int month, int year) throws Excepcion
		{
			StringBuffer msg = new StringBuffer();  //Almacenar un nuevo mensaje.
			if(day > 31 || day <= 0)
			{
				msg.appened("Error. Introduce un dia correcto");
			}
			if(month <= 0 || month > 12)
			{
				msg.appened("Error. Introduce un mes correcto");		
			}
			if(day > this.dayofMonth(month))
			{
				msg.appened("Error. Introduce el dia del mes correcto");
			}
			if(year < 0)
			{
				msg.appened("Error. Introduce un año correcto");	
			}
			if(msg.length()!=0)
			{
				throw new Excepcion(msg.toString());	
			}else
			{
				this.day = day;
				this.month = month;
				this.year = year;
		}
		
	}	
		
	public int getDay()
	{
		return this.day;
	}
	public int getMonth()
	{
		return this.month;
	}
	public int getYear()
	{
		return this.year;
	}
	void setDay(int Day)
	{
		this.day = day;
	}
	void setMonth(int Month)
	{
		this.month;
	}
	void setYear(int Year)
	{
		this.year;
	}

	public boolean isSameYear(Date otherDate)
	{
		boolean result = false;
	}
	if(this.year == otherDate.getYear())
	{
		v_return = time;	
	}	
	return v_return;		
	}
	


	public boolean isSameMonth(Date otherDate)
	{
		boolean result = false;
	}
	if(this.year == otherDate.getMonth())
	{
		v_return = time;	
	}	
	return v_return;		
	}

	
	public boolean isSameDay(Date otherDate)
	{
		boolean result = false;
	}
	if(this.year == otherDate.getDay())
	{
		v_return = time;	
	}	
	return v_return;		
	}
	

	public boolean isSame(Date otherDate)
	{
		boolean result = false;
	}
	if(this.date == otherDate.getdate())
	{
		v_return = time;	
	}	
	return v_return;		
	}



	//Fin de la modificación Apartado030101 Ejercicio 1




	


	//Inicio de la modificación Apartado030102 Ejercicio 1


public String getMonthName()
{
	String mes = new String("");
	switch (month)
	{	
		case 1:
			mes = "January";
			break;
		case 2:
			mes = "February"; 
			break;
		case 3:
			mes = "March"
			break;
		case 4:
			mes = "April";
			break;
		case 5:
			mes = "May";
			break;
		case 6:
			mes = "June";
			break;
		case 7:
			mes = "July";
			break;
		case 8:
			mes = "August";
			break;
		case 9;
			mes = "September";
			break;
		case 10;
			mes = "October";
			break;
		case 11;
			mes = "November";	
			break;
		case 12;
			mes = "December";
			break;
		default:
			System.out.println("Error");
	
	}
}	

	//Fin de la modificación Apartado030102 Ejercicio 1




	//Inicio de la modificación Apartado030102 Ejercicio 2

public String ()
{
	public int daysOfMonth = 0;
		switch (month)
		{
			case 1:
				daysOfMonth = 31;
				break;
			case 2:
				daysOfMonth = 28; 
				break;
			case 3:
				daysOfMonth = 31;
				break;
			case 4:
				daysOfMonth = 30;
				break;
			case 5:
				daysOfMonth = 31;
				break;
			case 6:
				daysOfMonth = 30;
				break;
			case 7:
				daysOfMonth = 31;
				break;
			case 8:
				daysOfMonth = 31;
				break;
			case 9;
				daysOfMonth = 30;
				break;
			case 10;
				daysOfMonth = 31;
				break;
			case 11;
				daysOfMonth = 30;	
				break;
			case 12;
				daysOfMonth = 31;
				break;
			default:
				System.out.println("Error");
	
		}
	return daysOfMonth;
	}
	
	public boolean isDayRight()
	{
		boolean result = false;
		if (day <= this.daysOfMonth())
		{
			result = true;
		}
		return result;
	}
	
} 	

	//Fin de la modificación Apartado030102 Ejercicio 2



	//Inicio de la modificación Apartado030102 Ejercicio 3
 


public String getSeason()
{
	String season = new String ("")
	{
		switch (season)
		{	
		System.out.print("Introduzca un mes del año: ");
			int day = 0;
			int month = 0;
		if((month == December && day >= 21)||(month == January) || (month == February) || (month == March && day << 21))
		{
		    season = "Winter";
		    System.out.println(season);
		}

		if ((month == March && day >= 21) || (month == April) || (month == May) || (month == June && day << 21))
		{
		    season = "Spring";
		    System.out.println(season);
		}

		if ((month == June && day >= 21) || (month == July) || (month == August) || (month == September && day << 21))
		{
		    season = "Summer";
		    System.out.println(season);
		}

		if ((month == September && day >= 21) || (month == October) || (November == May) || (month == December && day << 21))
		{
			season = "Autumn";
			System.out.println(season);
		}


	  	if (day < 1 || day > 31)
		{
			System.out.printl("Error dia incorrecto");
		}
	}
}


	//Fin de la modificación Apartado030102 Ejercicio 3




