
public class ProjectWeek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1.
		
	int[] ages = new int[8]; 
	
	ages[0] = 3;
	ages[1] = 9;
	ages[2] = 23;
	ages[3] = 64;
	ages[4] = 2;
	ages[5] = 8;
	ages[6] = 28;
	ages[7] = 93;
			
	//1.a. Programmatically subtract value of 1st element from value of last element in array
	
	ages[ages.length - 1] -= ages[0];
	
	System.out.println(ages[7]);
	
	//1.b. Add  new age to array and repeat steps above
	
	ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 100};
	
	ages[ages.length - 1] -= ages[0];
	
	System.out.println(ages[8]);
	
	//1.c. Use loop to calculate average age of array
	
	double agesSum = 0;
	
	for (int i = 0; i < ages.length; i++) {
		agesSum  += ages[i];
		}
	
	double agesAverage = agesSum / ages.length;
	
	System.out.println(agesAverage);
	
	//2. Create array of String called names
	
	String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	//2.a. Use loop to calculate average number letters per name
	
	double nameLettersCount = 0;
	
	for (int i = 0; i < names.length; i++) {
		nameLettersCount += names[i].length();
		}
	
	double nameLettersAverage = nameLettersCount / names.length;
	
	System.out.println(nameLettersAverage);
	
	//2.b. Use loop to concatenate names separated by space
	
	String namesConcatenated = "";
	
	for (int i = 0; i < names.length; i++) {
		namesConcatenated += names[i] + " ";
		}
	
	System.out.println(namesConcatenated);
	
	//5. Create new int array called nameLengths
	
	int[] nameLengths = new int[6];
	
	for (int i = 0; i < nameLengths.length; i++) {
		nameLengths[i] = names[i].length();
		}
	
	//6. Write loop to calculate sum of all elements in nameLengths array
	
	int sumNameLengths = 0;
			
	for (int i = 0; i < nameLengths.length; i++) {
		sumNameLengths += nameLengths[i];
		}
	
	System.out.println(sumNameLengths);
	
	//7. 
	
	System.out.println(concatenateIterateString("Hello", 3));
	
	//8.
	
	System.out.println(createFullName("John","Smith"));
	
	//9. 
	
	System.out.println(isSumGreater100(ages)); //Will return true (sum greater than 100)
	
	System.out.println(isSumGreater100(nameLengths)); //Will return false (sum not greater than 100)
	
	//10.
	
	double[] doubleArray1 = new double[] {35.8, 85.7, 55.9};
	
	System.out.println(calculateAverageArray(doubleArray1));
	
	//11.
	
	double[] doubleArray2 = new double[] {10.1, 2.5, 7.8};
	
	System.out.println(compareArrayAvg(doubleArray1, doubleArray2));
	
	//12.
	
	boolean isHot = true;
	double wallet = 12.0;
	
	System.out.println(willBuyDrink(isHot, wallet));
	
	//13. Created method decides if you should adopt a cat or not.
	
	boolean catIsNice = true;
	int catsOwned = 2;
	double walletMoney = 50.0;
	double adoptionFees = 20.0;
	
	willAdoptCat(catIsNice, catsOwned, walletMoney, adoptionFees);
	
	}

	public static String concatenateIterateString(String word, int n) {
		String concatenatedWord = "";
		for (int x = 0; x < n; x++) {
			concatenatedWord += word;
		}
		return concatenatedWord;
	}
	
	public static String createFullName (String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public static boolean isSumGreater100 (int[] intArray) {
		int sumArray = 0;
		for (int x = 0; x < intArray.length; x++) {
			sumArray += intArray[x];
		}
		if (sumArray > 100) {
			return true;
		} else return false;	
	}
	
	public static double  calculateAverageArray (double[] doubleArray) {
		double elementsSum = 0;
		for (int x = 0; x < doubleArray.length; x++) {
			elementsSum += doubleArray[x];
		}
		return elementsSum / doubleArray.length;
	}
	
	public static boolean compareArrayAvg (double[] array1, double[] array2) {
		if (calculateAverageArray(array1) > calculateAverageArray(array2)) {
			return true;
		} else return false;
	}
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else return false;
	}
	
	//Created method decides if you should adopt a cat or not.
	
	public static  boolean willAdoptCat (boolean catIsNice, int catsOwned, double wallet, double adoptionFees) {
		if (catIsNice && catsOwned < 5 && wallet > adoptionFees) {
			System.out.println("Adopt this cat!");
			return true;	
		} else {
			System.out.println("Not this time...");
			return false;
		}
	}
	
}


