package casestudies.pen2.pens;

import casestudies.pen2.Refil;
import casestudies.pen2.writeStrategies.WriteStrategy;

public class GelPen extends Pen{

    private Refil refil;

    public GelPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    public Refil getRefil() {
        return refil;
    }

    public void setRefil(Refil refil) {
        this.refil = refil;
    }

    @Override
    public void write() {
        super.write();
    }
}
