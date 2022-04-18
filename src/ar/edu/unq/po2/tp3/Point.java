package ar.edu.unq.po2.tp3;

public class Point {
	private double x;
	private double y;
	
	public Point() {
		this.setUbicacion(0,0);
	}
	
	public Point(double x, double y) {
		this.setUbicacion(x, y);
	}
	
	public void mover(double x, double y) {
		this.setUbicacion(x, y);
	}
	
	public void setUbicacion(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void sumarConOtroPunto(Point puntoNuevo) {
		this.setUbicacion(this.getX() + puntoNuevo.getX(), this.getY() + puntoNuevo.getY());
	}
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	
}
