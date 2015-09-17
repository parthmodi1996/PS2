package TestPackage;
import java.util.Random;

public class RandomInt {
	public static int randInt(int min, int max) {
		Random someRandomNum = new Random();
		int myNum = someRandomNum.nextInt((max-min)+ 1)+ min;
		return myNum;
	}
}
