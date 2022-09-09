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
						"Grados Celsius a Grados Kelvin",
						"Grados Fahrenheit a Grados Celsius",
						"Grados Fahrenheit a Grados Kelvin",
						"Grados Kelvin a Grados Celsius",
						"Grados Kelvin a Grados Fahrenheit"
					},
				"Selección").toString();
			switch(opciones) {
			case "Grados Celsius a Grados Fahrenheit":
				temperatura.ConvertirTemperatura_Celsius_Fahrenheit(valor);
				break;
			
			case "Grados Celsius a Grados Kelvin":
				temperatura.ConvertirTemperatura_Celsius_Kelvin(valor);
				break;
				
			case "Grados Fahrenheit a Grados Celsius":
				temperatura.ConvertirTemperatura_Fahrenheit_Celsius(valor);
				break;
				
			case "Grados Fahrenheit a Grados Kelvin":
				temperatura.ConvertirTemperatura_Fahrenheit_Kelvin(valor);
				break;
				
			case "Grados Kelvin a Grados Celsius":
				temperatura.ConvertirTemperatura_Kelvin_Celsius(valor);
				break;
				
			case "Grados Kelvin a Grados Fahrenheit":
				temperatura.ConvertirTemperatura_Kelvin_Fahrenheit(valor);
				break;
				
			}
		
		}
	
	
	}
}
