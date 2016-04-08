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
 
public String getMonthLeft(){
	StringBuffer output=new StringBuffer();
	int month=getMonth();
	output.append("The remaining months are: \n");
	for(int i=month+1;i<=12;i++){
		output.append(getMonthName(i)+"\n");
	}
	return output.toString();

	//Fin de la modificación Apartado030103 Ejercicio 1



	//Inicio de la modificación Apartado030103 Ejercicio 2

public String printDate(){
	StringBuffer date=new StringBuffer();
	date.append(getDay()+","+getMonthName(getMonth())+","+getYear());
	return date.toString();
}

	//Fin de la modificación Apartado030103 Ejercicio 2





	//Inicio de la modificación Apartado030103 Ejercicio 3

public String untilTheEnd(){
	int i;
	StringBuffer dates=new StringBuffer();
	dates.append("The days to the end of the month;\n");
	for(i=getDay()+1;i<=daysOfMonth(getMonth());i++){
		dates.append(i+","+getMonthName(getMonth())+","+getYear()+"\n");
	}
	return dates.toString();
}


	//Fin de la modificación Apartado030103 Ejercicio 3



	//Inicio de la modificación Apartado030103 Ejercicio 4
	
public String sameDaysMonth(){
	StringBuffer months=new StringBuffer();;
	int days=daysOfMonth(getMonth());
	int i;
	months.append("The months with same days are: \n");
	for(i=1;i<=12;i++){
		if(daysOfMonth(i)==days){
			months.append(getMonthName(i)+", ");	
		}
	}
	return months.toString();

	//Fin de la modificación Apartado030103 Ejercicio 4

	//Inicio de la modificación Apartado030103 Ejercicio 5

public String untilTheFirst(){
	StringBuffer dates = new StringBuffer();
	int i, j, k;
	dates.append("The days since the first day of the year:\n");
	for(i=1;i<=getMonth();i++){
		if(i!=getMonth()){
			for(j=1;j<=daysOfMonth(i);j++){
				dates.append(j+","+getMonthName(i)+","+getYear()+"\n");
			}
		}
		else{
			for(k=1;k<getDay();k++){
				dates.append(k+","+getMonthName(i)+","+getYear()+"\n");
			}
		}
	}
	return dates.toString();
}

	//Fin de la modificación Apartado030103 Ejercicio 5

























































































