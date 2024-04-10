package es.rodal.cafetera;

public class Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;
	
	public Cafetera() {
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}
	
	public Cafetera(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		
		this.cantidadActual = this.capacidadMaxima;
	}
	
	public Cafetera(int capacidadMaxima, int capacidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = (capacidadMaxima < capacidadActual) ? this.capacidadMaxima : capacidadActual;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
	public void llenarCafetera() {
		this.cantidadActual = this.capacidadMaxima;
	}
	
	public void servirTaza(int cantidad) {
		this.cantidadActual = (cantidadActual < cantidad) ? 0 : this.cantidadActual-cantidad;
	}
	
	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}
	
	public void agregarCafe(int cantidad) {
		this.cantidadActual = (this.cantidadActual+cantidad > this.capacidadMaxima) ?
				this.capacidadMaxima : this.cantidadActual+cantidad;
	}

	@Override
	public String toString() {
		return "Cafetera de capacidadMaxima=" + capacidadMaxima + ", tiene cantidadActual=" + cantidadActual;
	}
	
	
}
