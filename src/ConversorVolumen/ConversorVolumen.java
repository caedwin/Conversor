package ConversorVolumen;

import javax.swing.JOptionPane;

public class ConversorVolumen {
	
	public void Convertir_Litros_Mililitros(double valor) {
		double calculoLitrosMililitros = valor * 1000;
		calculoLitrosMililitros = (double) Math.round(calculoLitrosMililitros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoLitrosMililitros  + " Mililitros");
	}
	
	public void Convertir_Mililitros_Litros(double valor) {
		double calculoMililitrosLitros = valor / 1000;
		calculoMililitrosLitros = (double) Math.round(calculoMililitrosLitros *100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoMililitrosLitros  + " Litros");
	}
	
	public void Convertir_Litros_MetrosCubicos(double valor) {
		double calculoLitrosMetrosCubicos = valor / 1000;
		calculoLitrosMetrosCubicos = (double) Math.round(calculoLitrosMetrosCubicos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoLitrosMetrosCubicos  + " Metros Cúbicos");
	}
	
	public void Convertir_MetrosCubicos_Litros(double valor) {
		double calculoMetrosCubicosLitros = valor * 1000;
		calculoMetrosCubicosLitros = (double) Math.round(calculoMetrosCubicosLitros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoMetrosCubicosLitros  + " Litros");
	}
	
	public void Convertir_Litros_PulgadasCubicas(double valor) {
		double calculoLitrosPulgadasCubicas = valor * 61.024;
		calculoLitrosPulgadasCubicas = (double) Math.round(calculoLitrosPulgadasCubicas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoLitrosPulgadasCubicas  + " Pulgadas Cúbicas");
	}
	
	public void Convertir_PulgadasCubicas_Litros(double valor) {
		double calculoPulgadasCubicasLitros = valor / 61.024;
		calculoPulgadasCubicasLitros = (double) Math.round(calculoPulgadasCubicasLitros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoPulgadasCubicasLitros  + " Litros");
	}
	
	public void Convertir_Litros_Onzas(double valor) {
		double calculoLitrosOnzas = valor * 33.814;
		calculoLitrosOnzas = (double) Math.round(calculoLitrosOnzas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoLitrosOnzas  + " Onzas");
	}
	
	public void Convertir_Onzas_Litros(double valor) {
		double calculoOnzasLitros = valor / 33.814;
		calculoOnzasLitros = (double) Math.round(calculoOnzasLitros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoOnzasLitros  + " Litros");
	}
	
	public void Convertir_Litros_PieCubico(double valor) {
		double calculoLitrosPieCubico = valor / 28.317;
		calculoLitrosPieCubico = (double) Math.round(calculoLitrosPieCubico * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoLitrosPieCubico  + " Pie Cúbicos");
	}
	
	public void Convertir_PieCubico_Litros(double valor) {
		double calculoPieCubicoLitros = valor * 28.317;
		calculoPieCubicoLitros = (double) Math.round(calculoPieCubicoLitros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoPieCubicoLitros  + " Litros");
	}
	
	public void Convertir_Litros_Taza(double valor) {
		double calculoLitrosTaza = valor * 4.167;
		calculoLitrosTaza = (double) Math.round(calculoLitrosTaza * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoLitrosTaza  + " Taza");
	}
	
	public void Convertir_Taza_Litros(double valor) {
		double calculoTazaLitros = valor / 4.167;
		calculoTazaLitros = (double) Math.round(calculoTazaLitros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoTazaLitros  + " Litros");
	}
	
	public void Convertir_Mililitros_MetrosCubicos(double valor) {
		double calculoMililitrosMetrosCubicos = valor / 1e+6;
		calculoMililitrosMetrosCubicos = (double) Math.round(calculoMililitrosMetrosCubicos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoMililitrosMetrosCubicos + " Metros Cúbicos");
	}
	
	public void Convertir_MetrosCubicos_Mililitros(double valor) {
		double calculoMetrosCubicosMililitros = valor * 1e+6;
		calculoMetrosCubicosMililitros = (double) Math.round(calculoMetrosCubicosMililitros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoMetrosCubicosMililitros + " Mililitros");
	}
	
	public void Convertir_Mililitros_Pulgadas_Cubicas(double valor) {
		double calculoMililitrosPulgadasCubicas = valor / 16.387;
		calculoMililitrosPulgadasCubicas = (double) Math.round(calculoMililitrosPulgadasCubicas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoMililitrosPulgadasCubicas + " Pulgadas Cúbicas");
	}
	
	public void Convertir_Pulgadas_Cubicas_Mililitros(double valor) {
		double calculoPulgadasCubicasMililitros = valor * 16.387;
		calculoPulgadasCubicasMililitros = (double) Math.round(calculoPulgadasCubicasMililitros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoPulgadasCubicasMililitros + " Mililitros");
	}
	
	public void Convertir_Mililitros_Onzas(double valor) {
		double calculoMililitrosOnzas = valor / 29.574;
		calculoMililitrosOnzas = (double) Math.round(calculoMililitrosOnzas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoMililitrosOnzas + " Onzas");
	}
	
	public void Convertir_Onzas_Mililitros(double valor) {
		double calculoOnzasMililitros = valor * 29.574;
		calculoOnzasMililitros = (double) Math.round(calculoOnzasMililitros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoOnzasMililitros + " Mililitros");
	}
	
	public void Convertir_Mililitros_PieCubico(double valor) {
		double calculoMililitrosPieCubico = valor / 28320;
		calculoMililitrosPieCubico = (double) Math.round(calculoMililitrosPieCubico * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoMililitrosPieCubico + " Pie Cúbicos");
	}
	
	public void Convertir_PieCubico_Mililitros(double valor) {
		double calculoPieCubicoMililitros = valor * 28320;
		calculoPieCubicoMililitros = (double) Math.round(calculoPieCubicoMililitros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoPieCubicoMililitros + " Mililitros");
	}
	
	public void Convertir_Mililitros_Taza(double valor) {
		double calculoMililitrosTaza = valor / 240;
		calculoMililitrosTaza = (double) Math.round(calculoMililitrosTaza * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoMililitrosTaza + " Taza");
	}
	
	public void Convertir_Taza_Mililitros(double valor) {
		double calculoTazaMililitros = valor * 240;
		calculoTazaMililitros = (double) Math.round(calculoTazaMililitros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoTazaMililitros + " Mililitros");
	}
	
	public void Convertir_MetrosCubicos_PulgadasCubicas(double valor) {
		double calculoMetrosCubicosPulgadasCubicas = valor * 61020;
		calculoMetrosCubicosPulgadasCubicas = (double) Math.round(calculoMetrosCubicosPulgadasCubicas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoMetrosCubicosPulgadasCubicas + " Pulgadas Cúbicas");
	}
	
	public void Convertir_PulgadasCubicas_MetrosCubicos(double valor) {
		double calculoPulgadasCubicasMetrosCubicos = valor / 61020;
		calculoPulgadasCubicasMetrosCubicos = (double) Math.round(calculoPulgadasCubicasMetrosCubicos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoPulgadasCubicasMetrosCubicos + " Metros Cúbicos");
	}
	
	public void Convertir_MetrosCubicos_Onzas(double valor) {
		double calculoMetrosCubicosOnzas = valor * 33810;
		calculoMetrosCubicosOnzas = (double) Math.round(calculoMetrosCubicosOnzas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoMetrosCubicosOnzas + " Onzas");
	}
	public void Convertir_Onzas_MetrosCubicos(double valor) {
		double calculoMetrosCubicosOnzas = valor / 33810;
		calculoMetrosCubicosOnzas = (double) Math.round(calculoMetrosCubicosOnzas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoMetrosCubicosOnzas + " Metros Cúbicos");
	}
	
	public void Convertir_MetrosCubicos_PieCubico(double valor) {
		double calculoMetrosCubicosPieCubico = valor * 35.315;
		calculoMetrosCubicosPieCubico = (double) Math.round(calculoMetrosCubicosPieCubico * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoMetrosCubicosPieCubico + " Pie Cúbico");
	}
	
	public void Convertir_PieCubico_MetrosCubicos(double valor) {
		double calculoPieCubicoMetrosCubicos = valor / 35.315;
		calculoPieCubicoMetrosCubicos = (double) Math.round(calculoPieCubicoMetrosCubicos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoPieCubicoMetrosCubicos + " Metros Cúbicos");
	}
	
	public void Convertir_MetrosCubicos_Taza(double valor) {
		double calculoMetrosCubicosPieCubico = valor * 4167;
		calculoMetrosCubicosPieCubico = (double) Math.round(calculoMetrosCubicosPieCubico * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoMetrosCubicosPieCubico + " Taza");
	}
	
	public void Convertir_Taza_MetrosCubicos(double valor) {
		double calculoMetrosCubicosPieCubico = valor / 4167;
		calculoMetrosCubicosPieCubico = (double) Math.round(calculoMetrosCubicosPieCubico * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoMetrosCubicosPieCubico + " Metros Cúbicos");
	}
	
	public void Convertir_Onza_PieCubico(double valor) {
		double calculoOnzaPieCubico = valor / 957.5;
		calculoOnzaPieCubico = (double) Math.round(calculoOnzaPieCubico * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoOnzaPieCubico + " Pie Cúbico");
	}
	
	public void Convertir_PieCubico_Onza(double valor) {
		double calculoPieCubicoOnza = valor * 957.5;
		calculoPieCubicoOnza = (double) Math.round(calculoPieCubicoOnza * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoPieCubicoOnza + " Onzas");
	}
	
	public void Convertir_Onza_Taza(double valor) {
		double calculoOnzaTaza = valor / 8.115;
		calculoOnzaTaza = (double) Math.round(calculoOnzaTaza * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoOnzaTaza + " Taza");
	}
	
	public void Convertir_Taza_Onza(double valor) {
		double calculoTazaOnza = valor * 8.115;
		calculoTazaOnza = (double) Math.round(calculoTazaOnza * 100d) / 100;
		JOptionPane.showMessageDialog(null, "El valor es " + calculoTazaOnza + " Onzas");
	}
	
	
}
