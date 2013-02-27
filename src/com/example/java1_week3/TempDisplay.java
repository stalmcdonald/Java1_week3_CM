package com.example.java1_week3;

import android.content.Context;
import android.widget.GridLayout;
import android.widget.TextView;

public class TempDisplay extends GridLayout{

	
	TextView _city;
	TextView _state;
	TextView _time;
	TextView _date;
	TextView _weather;
	TextView _temp;
	Context _context;
	
	
	public TempDisplay(Context context){
		super(context);
		
		//assigning a value
		_context = context;
		
		//columns/rows  1 for labels and one for values
		this.setColumnCount(2);
		
		TextView cityLabel = new TextView(_context);
		cityLabel.setText("City: ");
		_city = new TextView(_context);
		
		TextView stateLabel = new TextView(_context);
		stateLabel.setText("State: ");
		_state = new TextView(_context);
		
		TextView timeLabel = new TextView(_context);
		timeLabel.setText("Time: ");
		_time = new TextView(_context);
		
		TextView dateLabel = new TextView(_context);
		dateLabel.setText("Date: ");
		_date = new TextView(_context);
		
		TextView weatherLabel = new TextView(_context);
		weatherLabel.setText("Weather Forecast: ");
		_weather = new TextView(_context);
		
		TextView tempLabel = new TextView(_context);
		tempLabel.setText("Current Temperature: ");
		_temp = new TextView(_context);
		
		
		//add views to display
		this.addView(cityLabel);
		this.addView(_city);
		this.addView(stateLabel);
		this.addView(_state);
		this.addView(timeLabel);
		this.addView(_time);
		this.addView(dateLabel);
		this.addView(_date);
		this.addView(weatherLabel);
		this.addView(_weather);
		this.addView(tempLabel);
		this.addView(_temp);
		
		
		
	}
}
