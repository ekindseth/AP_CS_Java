package dataset;


public class Dataset {

		static int numOne;
		static int numTwo;
		static int numThree;
		static int numFour; 
		static int tinyNum = Integer.MAX_VALUE;
		static int hugeNum = Integer.MIN_VALUE;
		
		Dataset(int numOne, int numTwo, int numThree, int numFour) {
			this.numOne = numOne;
			this.numTwo = numTwo;
			this.numThree = numThree;
			this.numFour = numFour;
			
		}

		public static void addValue(int x){
			tinyNum = Math.min(x, tinyNum);
			hugeNum = Math.max(x, hugeNum);
			
		}

		public static int getSmallest() {
			return tinyNum;
			
		}

		public static int getLargest() {
			return hugeNum;
			
		}
		
}

