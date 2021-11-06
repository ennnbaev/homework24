public class Pen extends ObjectForWriting {
    private static final double STATE_CONSUMPTION_PER_CHAR = 1.15;

    @Override
    public void write(StringBuilder builder, char[] symbols) {
        for (char symbol : symbols) {
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
