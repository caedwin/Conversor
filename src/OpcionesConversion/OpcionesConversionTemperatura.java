package OpcionesConversion;

import javax.swing.JOptionPane;

import ConversorTemperatura.ConversorTemperatura;

public class OpcionesConversionTemperatura {
	ConversorTemperatura temperatura  = new ConversorTemperatura();
	
	public void ConvertirTemperatura(double valor) {
		if(true) {
			String opciones = JOptionPane.showInputDialog(null, "Elija una Opción", "Menú", 
					JOptionPane.PLAIN_MESSAGE, null, new Object[] 
					{	"Grados Celsius a Grados Fahrenheit", 
						"Grados Celsius a Grados Kelvi",
						"Grados Fahrenhei a Grados Celsius",
						"Grados Fahrenhei a Grados Kelvi",
						"Grados Kelvi a Grados Celsius",
						"Grados Kelvi a Grados Fahrenhei"
					},
				"Selección").toString();
			switch(opciones) {
			case "Grados Celsius a Grados Fahrenheit":
				temperatura.ConvertirTemperatura_Celsius_Fahrenheit(valor);
				break;
			
			case "Grados Celsius a Grados Kelvi":
				temperatura.ConvertirTemperatura_Celsius_Kelvin(valor);
				break;
				
			case "Grados Fahrenhei a Grados Celsius":
				temperatura.ConvertirTemperatura_Fahrenheit_Celsius(valor);
				break;
				
			case "Grados Fahrenhei a Grados Kelvi":
				temperatura.ConvertirTemperatura_Fahrenheit_Kelvin(valor);
				break;
				
			case "Grados Kelvi a Grados Celsius":
				temperatura.ConvertirTemperatura_Kelvin_Celsius(valor);
				break;
				
			case "Grados Kelvi a Grados Fahrenhei":
				temperatura.ConvertirTemperatura_Kelvin_Fahrenheit(valor);
				break;
				
			}
		
		}
	
	
	}
}
