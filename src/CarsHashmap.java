import java.util.*;

public class CarsHashmap {
	public static void main(String [] args) {
		System.out.println("Welcome to Carvana!");
		
		HashMap<String, String> cars = new HashMap<>();
		
		cars.put("Prius", "Toyota");
		cars.put("Bolt", "Chevrolet");
		cars.put("Niro", "Kia");
		
		System.out.println(cars);
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Hello there, what model car are you looking for?");
		String model = input.nextLine();
		
		System.out.println(model);
		
		for (Map.Entry<String, String> car : cars.entrySet()) {
//			System.out.println(cars);
			String currentCarModel = car.getKey();
//			System.out.println(currentCarModel);
			if (model.equals(currentCarModel)) {
				System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...", model, car.getValue());
			}
		}
		
		
		
		
//		You are a car dealer. Create a hash map of vehicles.
//		The model is the Key, the make is the Value.
//		Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
//		(e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
	}
}
