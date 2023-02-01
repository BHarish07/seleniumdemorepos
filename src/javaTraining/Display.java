package javaTraining;

public class Display {

	public static void main(String args[]) {
		/*
		 * String city="Chennai,india"; if(city.endsWith("india")) {
		 * 
		 * if(city.contains("meerut")) { System.out.println("Your city is Meerut"); }
		 * else if(city.contains("Hyderabad")) {
		 * System.out.println("Your city is Hyderabad"); } else {
		 * System.out.println("Your city is "+city.split(",")[0]);//[0] will return the
		 * value at index 0 } } else {
		 * System.out.println("your city is not inside of india"); }
		 */

		// Arrays
		// one dimensional array
		/*
		 * int[] a=new int[5];//int [] a={4, 34,22,56,78);
		 * 
		 * a[0]=4; a[1]=34; a[2]=22; a[3]=56; a[4]=78;
		 */
		/*
		 * for(int i=0; i<a.length; i++) { System.out.println(a[i]); }
		 */

		/*
		 * for(int i:a) {
		 * 
		 * System.out.println(i); }
		 * 
		 */
		/*
		 * int[][] a=new int[3][2];//int[][] a={{5,7},{8,58},{21,19}}; a[0][0]=51;
		 * a[0][1]=72; a[1][0]=86; a[1][1]=58; a[2][0]=21; a[2][1]=19;
		 */

		/*
		 * for(int r=0;r<a.length;r++) { for(int c=0;c<a[r].length;c++) {
		 * System.out.print(a[r][c]+" "); } System.out.println("");
		 * 
		 * }
		 */

		/*
		 * for(int[] r:a) { for(int c:r) { System.out.print(c+" "); }
		 * System.out.println(); }
		 */
		// System.out.println(a.length);

		Object[] a = { 1, 5.6, "Harish", 'A', true };
		for (Object i : a) {
			System.out.println(i);
		}

	}
}
