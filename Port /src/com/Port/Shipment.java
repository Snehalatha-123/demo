package com.Port;

public class Shipment {
private int id;
private String shippername;
private String modeOfTransportation ;
private float totalweight;
private String arrivalPort;
private String departure;
private static int nextShipmentId = 1000;
public Shipment(int id, String shippername, String modeOfTransportation, float totalweight, String arrival,
		String departure) {
	super();
	this.id = id;
	this.shippername = shippername;
	this.modeOfTransportation = modeOfTransportation;
	this.totalweight = totalweight;
	this.arrivalPort = arrival;
	this.departure = departure;
}
@Override
public String toString() {
	return "Shipment [id=" + id + ", shippername=" + shippername + ", modeOfTransportation=" + modeOfTransportation
			+ ", totalweight=" + totalweight + ", arrivalPort=" + arrivalPort + ", departure=" + departure + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getShippername() {
	return shippername;
}
public void setShippername(String shippername) {
	this.shippername = shippername;
}
public String getModeOfTransportation() {
	return modeOfTransportation;
}
public void setModeOfTransportation(String modeOfTransportation) {
	this.modeOfTransportation = modeOfTransportation;
}
public float getTotalweight() {
	return totalweight;
}
public void setTotalweight(float totalweight) {
	this.totalweight = totalweight;
}
public String getArrivalPort() {
	return arrivalPort;
}
public void setArrivalPort(String arrivalPort) {
	this.arrivalPort = arrivalPort;
}
public String getDeparture() {
	return departure;
}
public void setDeparture(String departure) {
	this.departure = departure;
}

}

