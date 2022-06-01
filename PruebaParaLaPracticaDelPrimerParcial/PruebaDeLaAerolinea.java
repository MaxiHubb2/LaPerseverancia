package ar.edu.unlam.pb2.PruebaParaLaPracticaDelPrimerParcial;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Test;

import ar.edu.unlam.pb2.PracticaDelPrimerParcial.Aerolinea;
import ar.edu.unlam.pb2.PracticaDelPrimerParcial.Pasaje;
import ar.edu.unlam.pb2.PracticaDelPrimerParcial.Pasajeros;
import ar.edu.unlam.pb2.PracticaDelPrimerParcial.Vuelo;

public class PruebaDeLaAerolinea {

	//Creando la Aerolinea donde va el vuelo
	@Test
	public void crearAerolinea() {
		
		String nombreDeAerolinea = "flybondi";
		String nombreDeAerolinea2 = "flybondi";
		
		Aerolinea primerAerolinea = new Aerolinea(nombreDeAerolinea2);
		
		String nombreEsperado = nombreDeAerolinea;
		String nombreObtenido = primerAerolinea.crearAerolinea(nombreDeAerolinea2).getNombreDeAerolinea();
		
		assertEquals(nombreEsperado,nombreObtenido);
	}
	
	//Crear un Vuelo
	@Test
	public void crearUnVuelo() {
		
	LocalDate fechaDeVuelo = LocalDate.now();
	LocalTime horaDeVuelo = LocalTime.now();
	String destino = "Buenos Aires";
	String destino2 = "Buenos Aires";
			
	Vuelo primerVuelo = new Vuelo();
	
	String destinoEsperado = destino;
	String destinoObtenido = primerVuelo.crearVuelo(fechaDeVuelo,horaDeVuelo,destino2).getDestino();
	
	assertEquals(destinoEsperado,destinoObtenido);
	
	}
	
	//1. Que se pueda comprar un pasaje para un pasajero en un vuelo.
	//2. Que no se pueda comprar 2 pasajes para el mismo pasajero y vuelo.

	
	@Test
	public void QueSePuedaComprarUnPasajeYQueNoSeRepitaElUsuarioYVuelo() {
		
		String nombreDeLaAerolinea = "flybondi";
		
		String nombreDelPasajero = "Maxi";
		String apellidoDelPasajero = "Rabenko";
		Integer dniDelPasajero = 37609434;
		Double numeroDePasaporte1 = 1.0;
		Double numeroDePasaporte2 = 1.0;
		
		
		Aerolinea primerAerolinea = new Aerolinea(nombreDeLaAerolinea);
		Vuelo primerVuelo = new Vuelo();
		
		Pasajeros nuevoPasajero1 = new Pasajeros(nombreDelPasajero, apellidoDelPasajero, dniDelPasajero);
		Pasajeros nuevoPasajero2 = new Pasajeros(nombreDelPasajero, apellidoDelPasajero, dniDelPasajero);
		
		Pasaje nuevoPasaje = new Pasaje(nuevoPasajero1, primerVuelo, numeroDePasaporte1);
		Pasaje nuevoPasaje1 = new Pasaje(nuevoPasajero1, primerVuelo,numeroDePasaporte2);
		
		
		primerAerolinea.comprarPasaje(nuevoPasaje.crearPasajero(nuevoPasajero1), primerVuelo);
		primerAerolinea.comprarPasaje(nuevoPasaje1.crearPasajero(nuevoPasajero2), primerVuelo);
		
		
		Integer valorEsperado = 2;
		Integer valorObtenido = primerAerolinea.getPasajes();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	//3. Que a los pasajeros VIP se les aplique un 5% de descuento.

	@Test

	public void QueALosPasajerosVipSeLesApliqueUn5DeDescuento() {
		
		
		String nombreDeLaAerolinea = "flybondi";
		
		String nombreDelPasajero = "Maxi";
		String apellidoDelPasajero = "Rabenko";
		Integer dniDelPasajero = 37609434;
		Double numeroDePasaporte = 1.0;		
		
		Double precio = 100.0;
		LocalDate fecha = LocalDate.now();
		LocalTime hora = LocalTime.now();
		String destino = "Buenos Aires";
		
		
		Aerolinea primerAerolinea = new Aerolinea(nombreDeLaAerolinea);
		Vuelo primerVuelo = new Vuelo(fecha,hora,destino,precio);
		Pasajeros nuevoPasajero = new Pasajeros(nombreDelPasajero, apellidoDelPasajero, dniDelPasajero);
		Pasaje nuevoPasaje = new Pasaje(nuevoPasajero, primerVuelo, numeroDePasaporte);
		
		nuevoPasaje.crearPasajero(nuevoPasajero);
		primerAerolinea.comprarPasaje(nuevoPasaje, primerVuelo);
		
		Double valorEsperado = precio;
		Double valorObtenido = primerAerolinea.aplicarDescuento(primerVuelo, nuevoPasajero, nuevoPasaje);
		
		assertEquals(valorEsperado, valorObtenido);
		
		
	}
}
