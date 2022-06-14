package p_ms.ms.view.niveau;

import android.graphics.Color;

import p_ms.ms.R;
import p_ms.ms.view.GreyView;

public class Niveau1 extends Niveau {


    @Override
    protected int getViewColor() {
        return Color.argb(255,255,176,0);
    }

    @Override
    protected int getBtColor() {
        return Color.argb(255,0,0,0);
    }

    @Override
    protected int getNiveauTextColor() {
        return Color.argb(205,255,117,12);
    }

    @Override
    protected int getTextColor() {
        return Color.argb(255,255,176,0);
    }

    @Override
    protected int getNiveau() {
        return 1;
    }

    @Override
    protected int getCy() {
        return 1000;
    }

    @Override
    protected int getCa() {
        return R.mipmap.x1;
    }

    @Override
    protected int getCaa() {
        return R.mipmap.oo1;
    }

    @Override
    protected int getBackground() {
        return R.mipmap.t1;
    }

    @Override
    public Niveau next() {
        return new Niveau2();
    }

    @Override
    public int getMusic() {
        return R.raw.t1m;
    }
}
