import java.time.LocalDateTime;
import java.util.*;


public abstract class JulianDates {
	
	private int year;
	private int month;
	private int date;
	private int hrs;
	private int min;
	private int sec;
	private double julianDate;
	
	private static final LocalDateTime START_Date = LocalDateTime.of(-4712,1,1,12,0,0,0);
	
	public JulianDates() {
		
	}
	
	public JulianDates(int year, int month, int date, int hrs) {
		year = this.year;
		month = this.month;
		date = this.date;
		hrs = this.hrs;
		min = 0;
		sec = 0;
	}
	//@CONSTRUCTOR
	public JulianDates(int year, int month, int date, int hrs, int min) {
		year = this.year;
		month = this.month;
		date = this.date;
		hrs = this.hrs;
		min = this.min;
		sec = 0;
	}
	
	public JulianDates(int year, int month, int date, int hrs, int min, int sec) {
		year = this.year;
		month = this.month;
		date = this.date;
		hrs = this.hrs;
		min = this.min;
		sec = this.sec;
	}
	
	public JulianDate(LocalDateTime date) {
		
	}
	
	public JulianDate(String date) {
		
	}
	

	public double daysBetween(LocalDateTime otherDate) {
		return 0d;
	}
	
	public LocalDateTime getGregorianDate() {
		return null;
	}
	
	public int getYear() {
		return 0;
	}

}
