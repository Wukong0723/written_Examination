package Others.Test;

class Glyph{


    void draw(){
        System.out.println("Glyph.Draw()");
    }

    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }

}