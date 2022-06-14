package p_ms.ms.view.niveau;

import android.graphics.Color;

import p_ms.ms.R;

public class Niveau5 extends Niveau {
    
    @Override
    protected int getNiveau() {
        return 5;
    }

    @Override
    protected int getCy() {
        return 620;
    }

    @Override
    protected int getCa() {
        return R.mipmap.x5;
    }

    @Override
    protected int getCaa() {
        return R.mipmap.oo5;
    }

    @Override
    protected int getBackground() {
        return Color.argb(255,143,188,143);
    }

    @Override
    public Niveau next() {
        return null;
    }

    @Override
    public int getMusic() {
        return R.raw.t5m;
    }
}
