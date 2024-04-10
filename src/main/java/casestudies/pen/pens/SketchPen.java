package casestudies.pen.pens;

import casestudies.pen.Refil;
import casestudies.pen.writestrategies.WriteStrategy;

import java.sql.Ref;

public class SketchPen extends Pen {
    public SketchPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    private Refil refil;

    public Refil getRefil() {
        return refil;
    }

    public void setRefil(Refil refil) {
        this.refil = refil;
    }

    @Override
    public void write() {

    }
}
