package iterator;

import java.util.Comparator;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.Adaptadorea;
import adapter.InvertedIterator;
import adapter.Sorting;
import domain.Covid19Pacient;
import domain.Symptom;

	public class Main {

		public static void main(String[] args) {
			Covid19Pacient p=new Covid19Pacient("Ane", 29);
			p.addSymptom(new Symptom("vomitos", 10, 7), 1);
			p.addSymptom(new Symptom("tos", 10, 4), 2);
			p.addSymptom(new Symptom("hi", 10, 6), 3);
			p.addSymptom(new Symptom("mareos", 10, 8), 4);
			p.addSymptom(new Symptom("fiebre", 10, 10), 5);
			
			Adaptadorea a = new Adaptadorea(p.getName(),p.getAge(),p);
			Comparator bat = new symptomNameComparator();
			
			Iterator<Symptom> iteratorName= Sorting.sortedIterator(a.iterator(), bat);
			
			while(iteratorName.hasNext()) {
				System.out.println(iteratorName.next());
			}
			
			System.out.println("--------------------------------");
			
			Comparator severity = new severityIndexComparator();
			
			Iterator<Symptom> iteratorSeverity= Sorting.sortedIterator(a.iterator(), severity);

			while(iteratorSeverity.hasNext()) {
				System.out.println(iteratorSeverity.next());
			}
		}
}