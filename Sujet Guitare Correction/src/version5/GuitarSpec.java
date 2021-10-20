package version5;

public class GuitarSpec extends InstrumentSpec {

	public static final int NO_PREF_NUM_STRINGS = -1;
	
	private int numStrings;

	public GuitarSpec(Builder builder, String model, int numStrings, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public boolean matches(InstrumentSpec searchInstrument) {
		
		if (!(searchInstrument instanceof GuitarSpec)) {
			return false;
		}
		
		GuitarSpec guitarSpec = (GuitarSpec) searchInstrument;
		if (guitarSpec.getNumStrings() != NO_PREF_NUM_STRINGS 
				&& guitarSpec.getNumStrings() != getNumStrings())
			return false;
		
		return super.matches(searchInstrument);
	}
	
}
