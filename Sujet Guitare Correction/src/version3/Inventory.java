package version3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		guitars.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood));
	}

	/**
	 * Cette méthode recherche dans l'inventaire les guitares corrspodnantes aux préférences du client
	 * @param searchGuitar ce que veut le client (type GuitarSpec) 
	 * @return la liste des guitares correspondantes
	 */
	public List<Guitar> search(GuitarSpec searchGuitar) {
		
		List<Guitar> matchingGuitars = new ArrayList<>();
		
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {

			Guitar guitar = i.next();

			Builder builder = searchGuitar.getBuilder();
			if ((builder != null) && (!builder.equals(guitar.getBuilder())))
				continue;
			
			String model = searchGuitar.getModel();
			if ((model != null) && (!model.equals("")) && (!model.equalsIgnoreCase(guitar.getModel())))
				continue;

			Type type = searchGuitar.getType();
			if ((type != null) && (!type.equals(guitar.getType())))
				continue;

			Wood topWood = searchGuitar.getTopWood();
			if ((topWood != null) && (!topWood.equals(guitar.getTopWood())))
				continue;

			Wood backWood = searchGuitar.getBackWood();
			if ((backWood != null) && (!backWood.equals(guitar.getBackWood())))
				continue;

			matchingGuitars.add(guitar);

		}
		return matchingGuitars;
	}

}
