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
		this.dayofMonth = month;

	Date(int day, int month, int year) throws Excepcion
	{
		StringBuffer msg = new StringBuffer();
		if(day > 31 || day <= 0)
		{
			msg.appened("Error");
		}
		if(month <= 0 || month > 12)
		{
			msg.appened("Error");		
		}
		if(day > this.dayofMonth(month))
		{
			msg.appened("Error");
		}
		if(year < 0)
		{
			msg.appened("Error");	
		}
		if(msg.length()!=0)
		{
	
		}
	}	
		
	
		public int getDay ()
		{
			return this.day;
		}
		void setDay(int Day)
		{
			this.day = day;
		}
		boolean sameYear(DateotherDate)
		{
			return(this.year==otherDate.setYear())
			{
			return true;
			}
			else
			{
			return false;
			}			

		}
	}
}


	//Fin de la modificación Apartado01 "if




	//Inicio de la modificación Apartado0201 "if"


	public boolean isSameYear(DateotherDate)
	{
		boolean result = false;
	}
	if(this.year == otherDate.getYear())
	{
		result = time;	
	}	
	return result;		
	}

	//Fin de la modificación Apartado0201 "if"





	//Inicio de la modificación Apartado0202 "if"



	//Fin de la modificación Apartado0202 "if"





	
	//Inicio de la modificación Apartado0203 "if"


	//Fin de la modificación Apartado0203 "if"

	







	//Inicio de la modificación Apartado0204 "if"



	//Fin de la modificación Apartado0204 "if"




























	//Inicio de la modificación Apartado01 "switch"



	switch (month)
	{	
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
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
	




