import java.util.Arrays;

public class Main {

    public static <T> T getSortPosition(T[] arry, int position) {
        Arrays.sort(arry);
        return arry[position];
    }

    public static <T> int arryLength(T[] arry) {
        return (arry.length);
    }

    public static void main() {
        String[] clueOne = {"carrots", "blueberries", "oranges", "tomatoes", "zucchini", "squash"};
        int clueOneAnswer = arryLength(clueOne);

        Integer[] clueTwo = {3, 7, 85, 9, 1, 63, 15, 4, 94, 53};
        int clueTwoAnswer = getSortPosition(clueTwo, 5);

        String[] clueThree = {"bananas", "apples", "zucchini", "peppers", "peaches", "corn"};
        String[] fruits = {clueThree[0], clueThree[1], clueThree[4]}; // new String[] isn't needed
        String[] vegetables = {clueThree[2], clueThree[3], clueThree[5]}; // new String[] isn't needed

        String secondFruit = getSortPosition(fruits, 1);
        String secondVegetable = getSortPosition(vegetables, 1);

        String[][] clueFour = {
                {"pineapples", "peaches", "limes"}, // Array 1
                {"peaches", "pears", "limes"}, // Array 2
                {"peaches", "limes", "pineapples"} // Array 3
        };

        /*
        for (int i = 0; i < clueFour.length; i++) {
            Arrays.sort(clueFour[i]);
        }
        */

        for (String[] row : clueFour) { // String[] is the type of object, 'row' is just a name, and clueFour is the source
            Arrays.sort(row); // Action that is being preformed
        }

        boolean clueFourAnswerOne = Arrays.equals(clueFour[0], clueFour[1]);
        boolean clueFourAnswerTwo = Arrays.equals(clueFour[0], clueFour[2]);
        boolean clueFourAnswerThree = Arrays.equals(clueFour[1], clueFour[2]);

        String[] clueFive = {"iLikeTomatoes", "66345826", "9999H0pScoTCH", "b0BtHEBUILDER43", "thAtF4rMER2678"};
        Arrays.sort(clueFive);

        String[] firstThree = {clueFive[0], clueFive[1], clueFive[2]};

        String firstAndThird = firstThree[0] + firstThree[2];

        System.out.print("---------- Clue #1 ----------\n");
        System.out.print("My garden haul gave me " + clueOneAnswer + " batches of produce!\n\n");

        System.out.print("---------- Clue #2 ----------\n");
        System.out.print(clueTwoAnswer + "\n\n");

        System.out.print("---------- Clue #3 ----------\n");
        System.out.print("Second fruit: " + secondFruit + "\nSecond vegetable: " + secondVegetable + "\n\n");

        System.out.print("---------- Clue #4 ----------\n");
        System.out.print("Array One and Two: " + clueFourAnswerOne + "\nArray One and Three: " + clueFourAnswerTwo + "\nArray Two and Three: " + clueFourAnswerThree + "\n\n");

        System.out.print("---------- Clue #5 ----------\n");
        System.out.print(firstAndThird);
    }
}