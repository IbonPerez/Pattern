package iterator;

import java.util.Comparator;

import domain.Symptom;

public class severityIndexComparator implements Comparator<Symptom>{

	@Override
	public int compare(Symptom s1, Symptom s2) {
		if(s1.getSeverityIndex()>s2.getSeverityIndex()) {
			return 1;
		}
		else if(s1.getSeverityIndex()==s2.getSeverityIndex()) {
			return 0;
		}
		else {
			return -1;
		}
	}
}
