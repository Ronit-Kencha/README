import java.util.Scanner;
public class StrictlyIdentical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a1 = new int[1][5]; //assigning 5 numbers into array 1
        int[][] a2 = new int[1][5]; //assigning 5 numbers into array 2

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 elements of list1: "); //prompting the user to enter the 5 elements
        for (int i = 0; i < a1.length; i++)
            for (int j = 0; j < a1[i].length; j++)
                a1[i][j] = input.nextInt();
        System.out.print("Enter 5 elements of list2: "); //prompting the user to enter the other 5 elements
        for (int i = 0; i < a2.length; i++)
            for (int j = 0; j < a2[i].length; j++)
                a2[i][j] = input.nextInt();

        if (equals(a1, a2)) { //if statement that gives out a result if its identical or not depending on a1 = a2
            System.out.println("Two lists are strictly identical.");
        } else {
            System.out.println("Two lists are not strictly identical");
        }
    }

    public static boolean equals(int[][] a1, int[][] a2) {//having a boolean to pass the two arrays. 

        if (a1.length != a2.length || a1[0].length != a2[0].length) return false;

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {

                if (a1[i][j] != a2[i][j]) return false;//returning false means the lists are not identical
            }
        }

        return true;//returning true makes it identical
    }
	}

	