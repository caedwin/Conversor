package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConversorMonedas {
	
	double dolar = 140.75;
	double euro = 140.81;
	double LibrasEsterlinas = 162.39;
	double YenJapones = 0.98;
	double WonSurCoreano = 0.10;
	
	double pesoArgentinoDolar = 0.0071;
	double pesoArgentinoEuro = 0.0071;
	double pesoArgentinoLibrasEsterlinas = 0.0062;
	double pesoArgentinoYenJapones = 1.02;
	double pesoArgentinoWonSurCoreano = 9.81;

	public void Convertir_PesoArgentino_Dolar(double valor) {
		double monedaDolar = valor * pesoArgentinoDolar ;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Al cambio es U$D " + monedaDolar + " Dolares" );
	}
	
	public void Convertir_PesosArgentino_Euros(double valor) {
		double monedaEuro = valor * pesoArgentinoEuro ;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Al cambio es € " + monedaEuro + " Euros" );
	}
	
	public void Convertir_PesosArgentino_LibrasEsterlinas(double valor) {
		double monedaLibrasEsterlinas = valor * pesoArgentinoLibrasEsterlinas ;
		monedaLibrasEsterlinas = (double) Math.round(monedaLibrasEsterlinas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Al cambio es £ " + monedaLibrasEsterlinas + " Libras Esterlinas" );
	}
	
	public void Convertir_PesosArgentino_YenJapones(double valor) {
		double monedaYenJapones = valor * pesoArgentinoYenJapones ;
		monedaYenJapones  = (double) Math.round(monedaYenJapones  * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Al cambio es ¥ " + monedaYenJapones  + " Yen Japonés" );
	}
	
	public void Convertir_PesosArgentino_WonSulCoreano(double valor) {
		double monedaWonSurCoreano = valor * pesoArgentinoWonSurCoreano ;
		monedaWonSurCoreano  = (double) Math.round(monedaWonSurCoreano  * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Al cambio es ₩ " + monedaWonSurCoreano  + " Won surcoreano" );
	}
	
	//Conversion Inversa
	
	public void Convertir_Dolar_PesoArgentino(double valor) {
		double monedaPesoArgentino = dolar * valor;
		monedaPesoArgentino = (double) Math.round(monedaPesoArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Al cambio es $ " + monedaPesoArgentino + " Pesos Argentino" );
	}
	
	public void Convertir_Euros_PesosArgentino(double valor) {
		double monedaEuro = valor * euro ;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Al cambio es $ " + monedaEuro + " Pesos Argentino" );
	}
	
	public void Convertir_LibrasEsterlinas_PesosArgentino(double valor) {
		double monedaLibrasEsterlinas = valor * LibrasEsterlinas ;
		monedaLibrasEsterlinas = (double) Math.round(monedaLibrasEsterlinas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Al cambio es $ " + monedaLibrasEsterlinas + " Pesos Argentino" );
	}
	
	public void Convertir_YenJapones_PesosArgentino(double valor) {
		double monedaYenJapones = valor * YenJapones ;
		monedaYenJapones  = (double) Math.round(monedaYenJapones  * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Al cambio es $ " + monedaYenJapones  + " Pesos Argentino" );
	}
	
	public void Convertir_WonSulCoreano_PesosArgentino(double valor) {
		double monedaWonSurCoreano = valor * WonSurCoreano ;
		monedaWonSurCoreano  = (double) Math.round(monedaWonSurCoreano  * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Al cambio es $ " + monedaWonSurCoreano  + " Pesos Argentino" );
	}
	

}
