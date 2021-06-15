package com.example.kubofinanciero.entity;

import java.sql.Date;
import javax.persistence.*;

@Entity
public class Pagare {
	@Id
    private int PagareID;
    private int CuentaID;
    private int ClienteID;
    private int TipoInversionID;
    private Date FechaInicio;
    private Date FechaVencimiento;
    private long MontoInversion;
    private int Plazo;
    private long Tasa;
    private long TasaISR;
    private long TasaNeta;
    private long InteresGenerado;
    private long InteresRecibir;
    private long InteresRetener;
    private String Estatus;
    private String Reinvertir;
    private int InversionRenovada;
    private int MonedaID;
    private String Etiqueta;
    private long SaldoProvision;
    private long ValorGat;
    private String Beneficiario;
    private long ValorGatReal;
    private Date FechaVenAnt;
    private String DireccionIP;
    
    public int getPagareID() {
		return PagareID;
	}
	public void setPagareID(int pagareID) {
		PagareID = pagareID;
	}
	public int getCuentaID() {
		return CuentaID;
	}
	public void setCuentaID(int cuentaID) {
		CuentaID = cuentaID;
	}
	public int getClienteID() {
		return ClienteID;
	}
	public void setClienteID(int clienteID) {
		ClienteID = clienteID;
	}
	public int getTipoInversionID() {
		return TipoInversionID;
	}
	public void setTipoInversionID(int tipoInversionID) {
		TipoInversionID = tipoInversionID;
	}
	public Date getFechaInicio() {
		return FechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		FechaInicio = fechaInicio;
	}
	public Date getFechaVencimiento() {
		return FechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
	}
	public long getMontoInversion() {
		return MontoInversion;
	}
	public void setMontoInversion(long montoInversion) {
		MontoInversion = montoInversion;
	}
	public int getPlazo() {
		return Plazo;
	}
	public void setPlazo(int plazo) {
		Plazo = plazo;
	}
	public long getTasa() {
		return Tasa;
	}
	public void setTasa(long tasa) {
		Tasa = tasa;
	}
	public long getTasaISR() {
		return TasaISR;
	}
	public void setTasaISR(long tasaISR) {
		TasaISR = tasaISR;
	}
	public long getInteresGenerado() {
		return InteresGenerado;
	}
	public void setInteresGenerado(long interesGenerado) {
		InteresGenerado = interesGenerado;
	}
	public long getTasaNeta() {
		return TasaNeta;
	}
	public void setTasaNeta(long tasaNeta) {
		TasaNeta = tasaNeta;
	}
	public long getInteresRecibir() {
		return InteresRecibir;
	}
	public void setInteresRecibir(long interesRecibir) {
		InteresRecibir = interesRecibir;
	}
	public long getInteresRetener() {
		return InteresRetener;
	}
	public void setInteresRetener(long interesRetener) {
		InteresRetener = interesRetener;
	}
	public String getEstatus() {
		return Estatus;
	}
	public void setEstatus(String estatus) {
		Estatus = estatus;
	}
	public String getReinvertir() {
		return Reinvertir;
	}
	public void setReinvertir(String reinvertir) {
		Reinvertir = reinvertir;
	}
	public int getInversionRenovada() {
		return InversionRenovada;
	}
	public void setInversionRenovada(int inversionRenovada) {
		InversionRenovada = inversionRenovada;
	}
	public int getMonedaID() {
		return MonedaID;
	}
	public void setMonedaID(int monedaID) {
		MonedaID = monedaID;
	}
	public String getEtiqueta() {
		return Etiqueta;
	}
	public void setEtiqueta(String etiqueta) {
		Etiqueta = etiqueta;
	}
	public long getSaldoProvision() {
		return SaldoProvision;
	}
	public void setSaldoProvision(long saldoProvision) {
		SaldoProvision = saldoProvision;
	}
	public long getValorGat() {
		return ValorGat;
	}
	public void setValorGat(long valorGat) {
		ValorGat = valorGat;
	}
	public String getBeneficiario() {
		return Beneficiario;
	}
	public void setBeneficiario(String beneficiario) {
		Beneficiario = beneficiario;
	}
	public long getValorGatReal() {
		return ValorGatReal;
	}
	public void setValorGatReal(long valorGatReal) {
		ValorGatReal = valorGatReal;
	}
	public Date getFechaVenAnt() {
		return FechaVenAnt;
	}
	public void setFechaVenAnt(Date fechaVenAnt) {
		FechaVenAnt = fechaVenAnt;
	}
	public String getDireccionIP() {
		return DireccionIP;
	}
	public void setDireccionIP(String direccionIP) {
		DireccionIP = direccionIP;
	}
}
