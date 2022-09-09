package OpcionesConversion;


import javax.swing.JOptionPane;

import ConversorMonedas.ConversorMonedas;

public class OpcionesConversion {
	ConversorMonedas monedas = new ConversorMonedas();
	
	public void ConvertirMonedas(double valor) {
		if(true) {
			String opciones = JOptionPane.showInputDialog(null, "Elija el tipo de cambio", "Menú", 
					JOptionPane.PLAIN_MESSAGE, null, new Object[] 
					{	"Peso Argentino a Dólar", 
						"Peso Argentino a Euro", 
						"Peso Argentino a Libras Esterlinas",
						"Peso Argentino a Yen Japonés",
						"Peso Argentino a Won sul-coreano",
						"Dólar a Peso Argentino", 
						"Euro a Peso Argentino", 
						"Libras Esterlinas a Peso Argentino",
						"Yen Japonés a Peso Argentino",
						"Won sul-coreano a Peso Argentino"
						
					},
			"Selección").toString();
			
			switch(opciones) {
				case "Peso Argentino a Dólar":
					System.out.println("Peso Argentino a Dólar");
					monedas.Convertir_PesoArgentino_Dolar(valor);
					break;
				
				case "Peso Argentino a Euro":
					System.out.println("Peso Argentino a Euro");
					monedas.Convertir_PesosArgentino_Euros(valor);
					break;
				
				case "Peso Argentino a Libras Esterlinas":
					System.out.println("Libras Esterlinas");
					monedas.Convertir_PesosArgentino_LibrasEsterlinas(valor);
					break;
					
				case "Peso Argentino a Yen Japonés":
					System.out.println("Yen Japonés");
					monedas.Convertir_PesosArgentino_YenJapones(valor);
					break;
					
				case "Peso Argentino a Won sul-coreano":
					System.out.println("Peso Argentino a Won sul-coreano");
					monedas.Convertir_PesosArgentino_WonSulCoreano(valor);
					break;
					
				
				//conversion inversa
				
				case "Dólar a Peso Argentino":
					System.out.println("Dólar a Peso Argentino");
					monedas.Convertir_Dolar_PesoArgentino(valor);
					break;
				
				case "Euro a Peso Argentino":
					System.out.println("Euro a Peso Argentino");
					monedas.Convertir_Euros_PesosArgentino(valor);
					break;
					
				case "Libras Esterlinas a Peso Argentino":
					System.out.println("Libras Esterlinas a Peso Argentino");
					monedas.Convertir_LibrasEsterlinas_PesosArgentino(valor);
					break;
					
				case "Yen Japonés a Peso Argentino":
					System.out.println("Yen Japonés a Peso Argentino");
					monedas.Convertir_YenJapones_PesosArgentino(valor);
					break;
					
				case "Won sul-coreano a Peso Argentino":
					System.out.println("Won sul-coreano a Peso Argentino");
					monedas.Convertir_WonSulCoreano_PesosArgentino(valor);
					break;
				}	
		
		}
	}
}
		
		
			

		

