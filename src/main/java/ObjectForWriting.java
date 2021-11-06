public abstract class ObjectForWriting {
    protected double writingItem=100.0;
    public abstract void write(StringBuilder builder,char[]symbols);
    public abstract void erase(StringBuilder builder);
    protected abstract double getConsumptionPerChar();
    protected void descreaseWritingItem(){
        writingItem-=getConsumptionPerChar();
    }
}
