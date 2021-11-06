public class FeltTip extends ObjectForWriting {
    private static double STATE_CONSUMPTION_PER_CHAR = 1;
    private int writtenCharCounter;

    @Override
    public void write(StringBuilder builder, char[] symbols) {
        for (char symbol : symbols) {
            writtenCharCounter++;
            int counterTime = 20;
            if (writtenCharCounter > counterTime && writtenCharCounter <= counterTime * 2) {
                STATE_CONSUMPTION_PER_CHAR = 1.09;
            } else if (writtenCharCounter > counterTime * 2) {
                STATE_CONSUMPTION_PER_CHAR = 1.21;
            }
            builder.append(symbol);
            descreaseWritingItem();
        }
    }

    @Override
    public void erase(StringBuilder builder) {
        throw new UnsupportedOperationException("Pen can not be erase");
    }

    @Override
    protected double getConsumptionPerChar() {
        return STATE_CONSUMPTION_PER_CHAR;
    }
}
