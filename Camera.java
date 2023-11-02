package Finalproject;

public class Camera{
private int Cameraid;
private String Camerabrand;
private String Cameramodel;
private double CameraRent;
private boolean Camerarented;

public Camera(int id, String brand, String model, double perDayRent) {
	this.Cameraid = id;
	this.Camerabrand = brand;
	this.Cameramodel = model;
	this.CameraRent = perDayRent;
	this.Camerarented = false; //Initialize as not rented
}

// Getters and setters for the camera

public int getId() {
	return Cameraid;
}

public String getBrand() {
	return Camerabrand;
}

public String getModel() {
	return Cameramodel;
}

public double getPerDayRent() {
	return CameraRent;
}

public boolean isRented() {
	return Camerarented;
}

public void setRented(boolean rented) {
	this.Camerarented = rented;
}
}