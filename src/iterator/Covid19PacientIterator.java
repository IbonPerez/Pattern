package iterator;

import java.util.Iterator;
import java.util.List;

import adapter.InvertedIterator;
import domain.Symptom;

public class Covid19PacientIterator implements InvertedIterator{
	List<Symptom> symptoms;
	int position=0;

	public Covid19PacientIterator(List<Symptom> s) {
		
		this.symptoms = s;
	}

	public boolean hasNext() {
		
		return position<5;
	}

	public Object next() {

		Symptom symptom=symptoms.get(position);
		position++;
		return symptom;
	}

	@Override
	public Object previous() {
		Symptom symptom=symptoms.get(position);
		position--;
		return symptom;
	}

	@Override
	public boolean hasPrevious() {

		if (position>-1) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void goLast() {
		// TODO Auto-generated method stub
		this.position = symptoms.size()-1;
	}

}
