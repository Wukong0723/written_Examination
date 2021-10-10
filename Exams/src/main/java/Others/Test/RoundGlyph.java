package Others.Test;

class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int i){
        radius = i;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}