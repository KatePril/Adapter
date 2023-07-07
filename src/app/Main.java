package app;

import app.adapters.SquarePegAdapter;
import app.holes.RoundHole;
import app.pegs.RoundPeg;
import app.pegs.SquarePeg;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println(hole.fits(roundPeg));

        SquarePeg small_sqpeg = new SquarePeg(5);
        SquarePeg large_sqpeg = new SquarePeg(10);
//        System.out.println(hole.fits(small_sqpeg));

        SquarePegAdapter small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg);
        SquarePegAdapter large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg);
        System.out.println(hole.fits(small_sqpeg_adapter));
        System.out.println(hole.fits(large_sqpeg_adapter));
    }
}
