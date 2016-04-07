package es.unileon.prg.tema7;


public class Date
{

	private int year;
	private int month;
	private int day;
	

	//Inicio de la modificación Apartado01 "if"
	
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



	//Fin de la modificación Apartado01 "if




	


	//Inicio de la modificación Apartado01 "switch"


public String getMonthName()
{
	String mes = new String("");
	switch (month)
	{	
		case 1:
			mes = "January"
			break;
		case 2:
			System.out.println("February"); // Corregir los demas
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9;
			System.out.println("September");
			break;
		case 10;
			System.out.println("October");
			break;
		case 11;
			System.out.println("November");	
			break;
		case 12;
			Syste.out.println("December");
			break;
		default:
			System.out.println("Error");
	
	}
}	


	//Fin de la modificación Apartado01 "switch"

