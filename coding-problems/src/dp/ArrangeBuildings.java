//Arrange Buildings
//The road is to be so planned that there should not be consecutive buildings on either side of the road.
//You are required to find and print the number of ways in which the buildings can be built on both side of roads.
package dp;

public class ArrangeBuildings {

	public static void main(String[] args) {
		int n = 6;
		System.out.println(countBuildings(n));

	}

	private static long countBuildings(int n) {
		long space = 1, house = 1;
		for (int i = 2; i <= n; i++) {
			long oz = house;
			long oo = space + house;

			house = oo;
			space = oz;
		}
		long r = house + space;
		return r * r;
	}

}
