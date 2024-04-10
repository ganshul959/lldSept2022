package casestudies.pen2.pens;

import casestudies.pen2.Ink;
import casestudies.pen2.Nib;
import casestudies.pen2.writeStrategies.WriteStrategy;

public class FountainPen extends Pen{

    private Ink ink;
    public Nib nib;

    public FountainPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }


    @Override
    public void write() {
        super.write();
    }
}
