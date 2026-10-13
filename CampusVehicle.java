package edu.monmouth.campusvehicle;

public class CampusVehicle {
	private String id;
	private String location;
	private boolean available;
	
	private final String DEFAULT_ID="UNKNOWN", DEFAULT_LOCATION="UNKNOWN";
	private final boolean DEFAULT_AVAILABLE=true;
	
	public CampusVehicle() {
		setId(DEFAULT_ID);
		setLocation(DEFAULT_LOCATION);
		setAvailable(DEFAULT_AVAILABLE);
	}
	public CampusVehicle(String id, String location, boolean available) {
		setId(id);
		setLocation(location);
		setAvailable(available);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		
	
		if (id == null) {
            this.id = DEFAULT_ID;
        }
        else if (id.length() < 4) {
            this.id = DEFAULT_ID;
        }
        else if (id.length() > 12) {
            this.id = DEFAULT_ID;
        }
        else if (id.startsWith("MU") || id.startsWith("mu") || id.startsWith("Mu") ||
        		id.startsWith("mU")) {
            this.id = id;
        }
        else {
            this.id =DEFAULT_ID;
        }
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		if (location == null) {
			this.location = DEFAULT_LOCATION;
		}
		else if (location.equals("Library") || location.equals("University Bluffs") ||
				location.equals("Parking Lot") || location.equals("Spruce Hall") ||
				location.equals("Laurel Hall")) {
					this.location = location;
				}
				else {
					this.location = DEFAULT_LOCATION;
				}
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public void checkOut() {
		if (available == true) {
		available = false;
		}
		
	}
	public void returnVehicle() {
		available = true;
	}

}
