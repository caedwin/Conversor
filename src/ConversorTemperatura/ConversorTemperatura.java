package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	double gradosCelsius = -17.7778;
	double gradosFahrenheit = 32;
	double gradosKelvin = 273.15;
	
	public void ConvertirTemperatura_Celsius_Fahrenheit(double valor) {
		double calculoCelsius_Fahrenheit = (valor * 9/5) + gradosFahrenheit;
		calculoCelsius_Fahrenheit = (double) Math.round(calculoCelsius_Fahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + calculoCelsius_Fahrenheit + " Grados °F");
	}
	
	public void ConvertirTemperatura_Celsius_Kelvin(double valor) {
		double calculoCelsius_Kelvin = valor + gradosKelvin;
		calculoCelsius_Kelvin = (double) Math.round(calculoCelsius_Kelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + calculoCelsius_Kelvin + " Grados K");
	}
	
	public void ConvertirTemperatura_Fahrenheit_Celsius(double valor) {
		double calculoFahrenheit_Celsius = (valor - gradosFahrenheit)* 5/9;
		calculoFahrenheit_Celsius = (double) Math.round(calculoFahrenheit_Celsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + calculoFahrenheit_Celsius + " Grados °C");
	}
	
	public void ConvertirTemperatura_Fahrenheit_Kelvin(double valor) {
		double calculoFahrenheit_Kelvin = (valor - gradosFahrenheit)* 5/9 + gradosKelvin;
		calculoFahrenheit_Kelvin = (double) Math.round(calculoFahrenheit_Kelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + calculoFahrenheit_Kelvin + " Grados K");
	}
	
	public void ConvertirTemperatura_Kelvin_Fahrenheit(double valor) {
		double calculoKelvin_Fahrenheit = (valor - gradosKelvin)*5/9 + gradosFahrenheit;
		calculoKelvin_Fahrenheit = (double) Math.round(calculoKelvin_Fahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + calculoKelvin_Fahrenheit + " Grados °F");
	}
	
	public void ConvertirTemperatura_Kelvin_Celsius(double valor) {
		double calculoKelvin_Celsius = (valor - gradosKelvin);
		calculoKelvin_Celsius = (double) Math.round(calculoKelvin_Celsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + calculoKelvin_Celsius + " Grados °C");
	}	

}
