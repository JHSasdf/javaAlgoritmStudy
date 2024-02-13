package Inheritance;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Get the raw materials");
		System.out.println("Switch the Microwave on");
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("do the dish");

	}

	@Override
	void cleanup() {

		System.out.println("Switch the Microwave off");

	}

}
