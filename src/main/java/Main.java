import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RandomForWriting generateRandom = new RandomForWriting();
        SortArray sortArray = new SortArray();
        int countOfAllObjects = 10;
        ObjectForWriting[] arrayOfWritingObject = new ObjectForWriting[countOfAllObjects];
        double[] massWithWritingItem = new double[countOfAllObjects];
        StringBuilder textForWriting = new StringBuilder();
        for (int i = 0; i < countOfAllObjects; i++) {
            arrayOfWritingObject[i] = generateRandom.randomObjectForWriting();
        }
        for (int i = 0; i < countOfAllObjects; i++) {
            for (ObjectForWriting objectForWriting : arrayOfWritingObject) {
                objectForWriting.write(textForWriting, generateRandom.randomSymbol());
                try {
                    objectForWriting.erase(textForWriting);
                } catch (UnsupportedOperationException ignored) {

                }
            }
        }
        for (int i = 0; i < countOfAllObjects; i++) {
            massWithWritingItem[i] = arrayOfWritingObject[i].writingItem;
        }
        System.out.println(Arrays.toString(sortArray.bubbleSorter(massWithWritingItem)));
    }
}
