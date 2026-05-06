package com.practica.genericas;

import java.time.LocalDateTime;
import java.util.Objects;

public class FechaHora implements Comparable<FechaHora> {
	private Fecha fecha;
	private Hora hora;

	public FechaHora(int dia, int mes, int anio, int hora, int minuto) {
		this.fecha = new Fecha(dia, mes, anio);
		this.hora = new Hora(hora, minuto);
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	@Override
	public int compareTo(FechaHora o) {
		// IMPORTANTE: Acceder siempre a través de los getters de 'o' y de los atributos
		// propios
		LocalDateTime dt1 = LocalDateTime.of(this.fecha.getAnio(), this.fecha.getMes(),
				this.fecha.getDia(), this.hora.getHora(),
				this.hora.getMinuto());
		LocalDateTime dt2 = LocalDateTime.of(o.getFecha().getAnio(), o.getFecha().getMes(),
				o.getFecha().getDia(), o.getHora().getHora(),
				o.getHora().getMinuto());
		return dt1.compareTo(dt2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		FechaHora other = (FechaHora) obj;
		// Comparamos los valores internos de los objetos Fecha y Hora
		return Objects.equals(this.fecha.getDia(), other.getFecha().getDia())
				&& Objects.equals(this.fecha.getMes(), other.getFecha().getMes())
				&& Objects.equals(this.fecha.getAnio(), other.getFecha().getAnio())
				&& Objects.equals(this.hora.getHora(), other.getHora().getHora())
				&& Objects.equals(this.hora.getMinuto(), other.getHora().getMinuto());
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha.getDia(), fecha.getMes(), fecha.getAnio(),
				hora.getHora(), hora.getMinuto());
	}
}
