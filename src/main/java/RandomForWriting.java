public class RandomForWriting {
    public char[] randomSymbol() {
        int maxSymbol = 100;
        int randomSizeMass = 3 + (int) (Math.random() * 3);
        char[] randomSymbol = new char[randomSizeMass];
        char random = 'a';
        for (int i = 0; i < randomSizeMass; i++) {
            random += (int) (Math.random() * maxSymbol);
            randomSymbol[i] = random;
        }
        return randomSymbol;
    }

    public ObjectForWriting randomObjectForWriting() {
        int maxValueOfObjects = 3;
        if ((int) (Math.random() * maxValueOfObjects) == 0) {
            return new Pen();
        } else if ((int) (Math.random() * maxValueOfObjects) == 1) {
            return new Pencil();
        } else {
            return new FeltTip();
        }
    }

}
