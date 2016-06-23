
public class Convertisseur {

	public static void main(String[] args) {

		// ---------------------------------
		// Conversion d'un string en entier
		// ---------------------------------

		String strMaVariable = "22";
		int iMaVariable;

		// Convertir strMaVariable en iMaVariable

		iMaVariable = Integer.parseInt(strMaVariable);
		System.out.println("iMaVariable: " + iMaVariable);

		// ---------------------------------
		// Conversion d'un entier en String
		// ---------------------------------

		int iMaVariable2 = 10;
		String strMaVariable2;

		// Convertir iMaVariable2 en strMaVariable2

		// strMaVariable2= Integer.toString(iMaVariable2);
		strMaVariable2 = String.valueOf(iMaVariable2);
		System.out.println("strMaVariable2: " + strMaVariable2);

	}
}
