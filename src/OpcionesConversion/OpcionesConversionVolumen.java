package OpcionesConversion;

import javax.swing.JOptionPane;

import ConversorVolumen.ConversorVolumen;

public class OpcionesConversionVolumen {
	
	ConversorVolumen volumen = new ConversorVolumen();
	
	public void ConvertirVolumen(double valor) {
		
		if(true) {
			String opciones= JOptionPane.showInputDialog(null, "Elija el tipo de Volumen","Menú",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] 
					{   
						"Litros a Metros Cúbicos",
						"Litros a Mililitros",
						"Litros a Onzas",
						"Litros a Pie Cúbicos",
						"Litros a Pulgadas Cúbicas",
						"Litros a Taza",
						
						"Metros Cúbicos a Mililitros",
						"Metros Cúbitos a Onzas",
						"Metros Cúbitos a Pie Cúbico",
						"Metros Cúbitos a Pulgadas",
						"Metros Cúbicos a Litros",
						"Metros Cúbitos a Taza",
						
						"Mililitros a Metros Cúbicos",
						"Mililitros a Litros",
						"Mililitros a Onzas",
						"Mililitros a Pie Cúbico",
						"Mililitros a Pulgadas Cúbicas",
						"Mililitros a Taza",
						
						"Onzas a Metros Cúbitos",
						"Onzas a Mililitros",
						"Onzas a Litros",
						"Onza a Pie Cúbico",
						"Onza a Taza",
						
						"Pie Cúbico a Metros Cúbitos",
						"Pie Cúbico a Mililitros",
						"Pie Cúbicos a Litros",
						"Pie Cúbico a Onza",
						
						"Pulgadas a Metros Cúbitos",
						"Pulgadas Cúbicas a Mililitros",
						"Pulgadas Cúbicas a Litros",
						
						"Taza a Metros Cúbitos",
						"Taza a Mililitros",
						"Taza a Litros",
						"Taza a Onza",	
					},
				"Selección").toString();
			switch (opciones) {
			case "Litros a Mililitros":
				volumen.Convertir_Litros_Mililitros(valor);
				break;
			
			case "Mililitros a Litros":
				volumen.Convertir_Mililitros_Litros(valor);
				break;
				
			case "Litros a Metros Cúbicos":
				volumen.Convertir_Litros_MetrosCubicos(valor);
				break;
				
			case "Metros Cúbicos a Litros":
				volumen.Convertir_MetrosCubicos_Litros(valor);
				break;
				
			case "Litros a Pulgadas Cúbicas":
				volumen.Convertir_Litros_PulgadasCubicas(valor);
				break;
				
			case "Pulgadas Cúbicas a Litros":
				volumen.Convertir_PulgadasCubicas_Litros(valor);
				break;
				
			case "Litros a Onzas":
				volumen.Convertir_Litros_Onzas(valor);
				break;
				
			case "Onzas a Litros":
				volumen.Convertir_Onzas_Litros(valor);
				break;
				
			case "Litros a Pie Cúbicos":
				volumen.Convertir_Litros_PieCubico(valor);
				break;
				
			case "Pie Cúbicos a Litros":
				volumen.Convertir_PieCubico_Litros(valor);
				break;
				
			case "Litros a Taza":
				volumen.Convertir_Litros_Taza(valor);
				break;
				
			case "Taza a Litros":
				volumen.Convertir_Taza_Litros(valor);
				break;
				
			case "Mililitros a Metros Cúbicos":
				volumen.Convertir_Mililitros_MetrosCubicos(valor);
				break;
				
			case "Metros Cúbicos a Mililitros":
				volumen.Convertir_MetrosCubicos_Mililitros(valor);
				break;
				
			case "Mililitros a Pulgadas Cúbicas":
				volumen.Convertir_Mililitros_Pulgadas_Cubicas(valor);
				break;
				
			case "Pulgadas Cúbicas a Mililitros":
				volumen.Convertir_Pulgadas_Cubicas_Mililitros(valor);
				break;
				
			case "Mililitros a Onzas":
				volumen.Convertir_Mililitros_Onzas(valor);
				break;
				
			case "Onzas a Mililitros":
				volumen.Convertir_Onzas_Mililitros(valor);
				break;
				
			case "Mililitros a Pie Cúbico":
				volumen.Convertir_Mililitros_PieCubico(valor);
				break;
				
			case "Pie Cúbico a Mililitros":
				volumen.Convertir_PieCubico_Mililitros(valor);
				break;
				
			case "Mililitros a Taza":
				volumen.Convertir_Mililitros_Taza(valor);
				break;
				
			case "Taza a Mililitros":
				volumen.Convertir_Taza_Mililitros(valor);
				break;
				
			case "Metros Cúbitos a Pulgadas":
				volumen.Convertir_MetrosCubicos_PulgadasCubicas(valor);
				break;
				
			case "Pulgadas a Metros Cúbitos":
				volumen.Convertir_PulgadasCubicas_MetrosCubicos(valor);
				break;
				
			case "Metros Cúbitos a Onzas":
				volumen.Convertir_MetrosCubicos_Onzas(valor);
				break;
				
			case "Onzas a Metros Cúbitos":
				volumen.Convertir_Onzas_MetrosCubicos(valor);
				break;
				
			case "Metros Cúbitos a Pie Cúbico":
				volumen.Convertir_MetrosCubicos_PieCubico(valor);
				break;
				
			case "Pie Cúbico a Metros Cúbitos":
				volumen.Convertir_PieCubico_MetrosCubicos(valor);
				break;
				
			case "Metros Cúbitos a Taza":
				volumen.Convertir_MetrosCubicos_Taza(valor);
				break;
				
			case "Taza a Metros Cúbitos":
				volumen.Convertir_Taza_MetrosCubicos(valor);
				break;
				
			case "Onza a Pie Cúbico":
				volumen.Convertir_Onza_PieCubico(valor);
				break;
				
			case "Pie Cúbico a Onza":
				volumen.Convertir_PieCubico_Onza(valor);
				break;
				
			case "Onza a Taza":
				volumen.Convertir_Onza_PieCubico(valor);
				break;
				
			case "Taza a Onza":
				volumen.Convertir_Taza_Onza(valor);
				break;
				
			
			}
		}
		
		
		
	}

}
