package iterator;

import java.util.Comparator;

import domain.Symptom;

public class symptomNameComparator implements Comparator<Symptom>{


	@Override
	public int compare(Symptom s1, Symptom s2) {
		return s1.getName().compareTo(s2.getName());
	}

}
