package weather;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ForecastData {
	// TODO : include everything, verify units, add constructor, add accessors
	private double temperature_hourly; // in degrees F
	
	private double hourly_qpf; // inches 
		
	// Time
	private Calendar dateTime;
	
	 
	//Constructor for a new ForecastData object 
	public ForecastData(
			Calendar dateTime,
			double temperature_hourly,
			
			double hourly_qpf){
		this.dateTime=dateTime;
		this.temperature_hourly=temperature_hourly;
	
		this.hourly_qpf=hourly_qpf;
	}
	
	//gets the current temp
	public double getTemperature() {
		return this.temperature_hourly;
	}
	
	
	//gets day of week
	public int getDayOfWeek() {
		return dateTime.get(Calendar.DAY_OF_WEEK);
	}

	//time in miliseconds
	public long getMillisTime(){
		return dateTime.getTimeInMillis();
	}
	
	//gives timezone
	public TimeZone getTimeZone() {
		return dateTime.getTimeZone();
	}
	
	//string representing time
	public String getTimeString(){
		long standardOffset = dateTime.getTimeZone().getRawOffset();
		String zone = "";
		if (standardOffset == -36000000) {
			zone = "HA";
		} else if (standardOffset == -28800000) {
			zone = "AK";
		} else if (standardOffset == -25200000) {
			zone = "PT";
		} else if (standardOffset == -21600000) {
			zone = "MT";
		} else if (standardOffset == -18000000) {
			zone = "CT";
		} else if (standardOffset == -14400000) {
			zone = "ET";
		}
		
		SimpleDateFormat f=new SimpleDateFormat("EEE MM/dd hh a");
		f.setTimeZone(dateTime.getTimeZone());
		Date d=dateTime.getTime();
		String s=d.toString();;
		s=f.format(d);
		return s + " " + zone;
	}

	public double getQPF() {
		return this.hourly_qpf;
	}
}
