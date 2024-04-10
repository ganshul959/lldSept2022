package casestudies.pen2;

import casestudies.pen2.pens.BallPen;
import casestudies.pen2.pens.FountainPen;
import casestudies.pen2.pens.GelPen;
import casestudies.pen2.pens.Pen;
import casestudies.pen2.writeStrategies.BoldWriteStrategy;
import casestudies.pen2.writeStrategies.SmoothWriteStrategy;

public class ClientApplication {
    public static void main(String[] args) {
        Pen uniball = new GelPen(new BoldWriteStrategy());
        uniball.write();

        Pen fountainPen = new FountainPen(new SmoothWriteStrategy());
        fountainPen.write();

        Pen celloBall = new BallPen(new SmoothWriteStrategy());
        celloBall.write();

        Pen writeMax = new BallPen(new SmoothWriteStrategy());
        celloBall.write();
    }
}
