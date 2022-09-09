package MenuPrincipal;

import javax.swing.*;

import ConversorMonedas.ConversorMonedas;
import ConversorTemperatura.ConversorTemperatura; 
import ConversorVolumen.ConversorVolumen;
import OpcionesConversion.OpcionesConversion;
import OpcionesConversion.OpcionesConversionTemperatura;
import OpcionesConversion.OpcionesConversionVolumen;

public class MenuPrincipal {

	public static void main(String[] args) {
		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesConversionTemperatura conversionTemperatura = new OpcionesConversionTemperatura();
		OpcionesConversionVolumen conversionVolumen = new OpcionesConversionVolumen();
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[] {"Conversor de Monedas", "Conversor de Temperatura", "Conversor de Volumen"},"Elegir").toString();
			switch (opciones) {
				case "Conversor de Monedas": 
					String inputMoneda = JOptionPane.showInputDialog(null, "Ingrese un Valor");
					double valorMoneda = Double.parseDouble(inputMoneda);
					conversion.ConvertirMonedas(valorMoneda);
					
					int respuestaMoneda = JOptionPane.showConfirmDialog(null, "¿ Desea Realizar Otra Consulta ?");
					if (JOptionPane.OK_OPTION == respuestaMoneda) {
							
						}else {
							JOptionPane.showMessageDialog(null, "Programa Terminado");
						}
					
					break;
					
				case "Conversor de Temperatura":
					String inputTemparatura = JOptionPane.showInputDialog(null, "Ingrese una Temperatura");
					double valorTemperatura = Double.parseDouble(inputTemparatura);
					conversionTemperatura.ConvertirTemperatura(valorTemperatura);
					
					int respuestaTemperatura = JOptionPane.showConfirmDialog(null, "¿ Desea Realizar Otra Consulta ?");
					if (JOptionPane.OK_OPTION == respuestaTemperatura) {
							
						}else {
							JOptionPane.showMessageDialog(null, "Programa Terminado");
						}
					break;
					
				case "Conversor de Volumen":
					String inputVolumen = JOptionPane.showInputDialog(null, "Ingrese una Medida");
					double valorVolumen = Double.parseDouble(inputVolumen);
					conversionVolumen.ConvertirVolumen(valorVolumen);
					
					
				int respuestaVolumen = JOptionPane.showConfirmDialog(null, "¿ Desea Realizar Otra Consulta ?");
				if (JOptionPane.OK_OPTION == respuestaVolumen) {
						
					}else {
						JOptionPane.showMessageDialog(null, "Programa Terminado");
					}
				break;
			}
	
		}	
	}

}
