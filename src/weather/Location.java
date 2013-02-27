package weather;

import java.io.Serializable;

//import android.content.Context;
//import android.location.LocationManager;


//Stores a location by lat and long.
public class Location implements Serializable{
	private static final long serialVersionUID = 1L;
	public double lat;
	public double lon;


	 //Constructor creates a new Location object from a specified lat/lon location
	public Location(double lat, double lon) {
		this.lat = lat;
		this.lon = lon;
	}


	 //Constructor creates a new Location object from an android location
	public Location(android.location.Location loc) {
		this(loc.getLatitude(), loc.getLongitude());
	}

	//goes with hash
	public int hashCode() {
		return new Double(lat).hashCode() ^ new Double(lon).hashCode();
	}

	public boolean equals(Object aThat) {
		if (this == aThat)
			return true;
		if (!(aThat instanceof Location))
			return false;
		Location that = (Location) aThat;
		return this.lat == that.lat && this.lon == that.lon;
	}
	
	private static android.location.Location myCurrentLocation;
	
	
	 //uses the user's current Lat/Long location as shown by the phone
	public static Location getCurrentLocation()
	{
		return new Location(myCurrentLocation.getLatitude(),myCurrentLocation.getLongitude());
	}

	//loc=new location to assign as the phone's current location
	public static void setCurrentLocation(android.location.Location loc)
	{
		myCurrentLocation=loc;
	}
	
}
