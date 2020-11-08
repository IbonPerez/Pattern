package observer;

import java.util.Observable;
import java.util.Observer;

import domain.Covid19Pacient;



public class NagusiaTermometroa {
	public static void main(String args[]){
		Observable pacient=new Covid19Pacient("aitor", 35);
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient);
		PacientSymptomGUI frame = new PacientSymptomGUI ((Covid19Pacient) pacient);
		PacientThermometerGUI thermometerGUI= new PacientThermometerGUI (pacient);
		SemaphorGUI semaforoGUI = new SemaphorGUI (pacient);
	}
}
