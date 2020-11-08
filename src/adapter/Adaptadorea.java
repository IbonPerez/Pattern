package adapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import domain.Covid19Pacient;
import domain.Symptom;
import iterator.Covid19PacientIterator;

public class Adaptadorea extends Covid19Pacient{
	Covid19Pacient p;

	public Adaptadorea(String name, int years, Covid19Pacient p) {
		super(name, years);
		this.p = p;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public InvertedIterator iterator() {
		return new Covid19PacientIterator(new ArrayList<Symptom>(p.getSymptoms()));
	}

}
