public class DBSLauncher {

	public static void main(String[] args) {
		
		DatabaseHelper dbHelper=new DatabaseHelper();

		//Specify Inserts:
		Integer Recipe = 1000; 
		Integer Has = 1000;

		//Call Functions of dbHelper
		dbHelper.insertIntoRecipe(Recipe);
		dbHelper.insertIntoIngredient();
		dbHelper.insertIntoHAS(Has);
		dbHelper.insertIntoSeasonality();
	


		System.out.println("\n-\n-\n Done. All values were inserted.");
		
		//Clean Up
		dbHelper.close();
		
	}

}
