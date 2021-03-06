package version5;

public abstract class InstrumentSpec {
	
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	
	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public boolean matches(InstrumentSpec searchInstrument) {
		if (searchInstrument.getBuilder() != null 
				&& !searchInstrument.getBuilder().equals(getBuilder()))
			return false;
		if (searchInstrument.getModel() != null 
				&& !searchInstrument.getModel().equals("") 
				&& !searchInstrument.getModel().equalsIgnoreCase(getModel()))
			return false;
		if (searchInstrument.getType() != null 
				&& !searchInstrument.getType().equals(getType()))
			return false;
		if (searchInstrument.getTopWood() != null 
				&& !searchInstrument.getTopWood().equals(getTopWood()))
			return false;
		if (searchInstrument.getBackWood() != null 
				&& !searchInstrument.getBackWood().equals(getBackWood()))
			return false;
		return true;
	}

	
	
	
	
}
