package Waves;
/*
import processing.core.PApplet;
import processing.core.PImage;

import static processing.core.PApplet.cos;


public class Waves {
    int SCREENWIDTH = 220;
    int SCREENHEIGHT = 120;
    int GRADIENTLEN = 150;// magnifair
    int SPEEDUP = 1; // changes speed
    int SWINGLEN = GRADIENTLEN;  // magnitude moving blocks (color diversity)
    int SWINGMAX = GRADIENTLEN * 3 - 1; // this param affect to color sheme (then his more then colors more)
    int[] colorGrad = new int[GRADIENTLEN];
    int minX = 0;
    int maxX = 0;
    int minY = 0;
    int maxY = 0;

    void setup () {
        background(200);
        size( SCREENWIDTH, SCREENHEIGHT);
        makeGradient();
        setMaxMinX();
        setMaxMinY();
    }

    void draw () {
        loadPixels();
        int i = 0;
        int t = frameCount * SPEEDUP;
        for (int y = minY; y < maxY; y++) {
            for (int x = minX; x < maxX; x++) {
                set(x, y, gradient(int(x*x/4) + int(y*y/4) + t));
                i = i + 1;
            }
        }
        updatePixels();
    }

    void makeGradient() {
        int arrlen = GRADIENTLEN;
        int rf = 4;
        int gf = 2;
        int bf = 1;
        int rd = arrlen;
        int gd = arrlen / gf;
        int bd = arrlen / bf / 2;
        for (int i = 0; i < arrlen; i++) {
            int r = cos256(arrlen / rf, i + rd );
            int g = cos256(arrlen / gf, i + gd) / 2;
            int b = cos256(arrlen / bf, i + bd) / 2;
            colorGrad[i] = color(r, g, b);
        }
    }

    int cos256(int amplitude, int x) {
        return int(cos(x * TWO_PI / amplitude) * 127) + 127;
    }

    int gradient(int i) {
        return colorGrad[i % GRADIENTLEN];
    }

    void setMaxMinX() {
        minX = 0;
        maxX = 220;
    }

    void setMaxMinY() {
        mixY = 0;
        maxY = 120;
    }
}
*/