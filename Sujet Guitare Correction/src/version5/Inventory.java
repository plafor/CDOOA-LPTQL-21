package version5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Instrument> instruments;

	public Inventory() {
		instruments = new LinkedList<>();
	}

	public void addInstrument(Instrument instrument) {
		instruments.add(instrument);
	}

	public List<Instrument> search(InstrumentSpec searchInstrument) {
		
		List<Instrument> matchingInstruments = new ArrayList<>();
		
		for (Instrument instrument: instruments) {

			if (instrument.getSpec().matches(searchInstrument)) {
				matchingInstruments.add(instrument);
			}
		}
		return matchingInstruments;
	}
	

}
