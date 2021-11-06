public class Pencil extends ObjectForWriting {
    private static final double STATE_CONSUMPTION_PER_CHAR = 0.95;
    private static final int TIME_SELF_SHARPENING = 20;
    private int writtenCharCounter;

    @Override
    public void write(StringBuilder builder, char[] symbols) {
        for (char symbol : symbols) {
            builder.append(symbol);
            descreaseWritingItem();
            writtenCharCounter++;
            if (writtenCharCounter % TIME_SELF_SHARPENING == 0) {
                zatochit();
            }
        }
    }

    @Override
    public void erase(StringBuilder builder) {
        builder.deleteCharAt(builder.length() - 1);
    }

    @Override
    protected double getConsumptionPerChar() {
        return STATE_CONSUMPTION_PER_CHAR;
    }

    private void zatochit() {
        writingItem -= 3.0;
    }
}
