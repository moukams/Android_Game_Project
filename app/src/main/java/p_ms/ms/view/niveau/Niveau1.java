package p_ms.ms.view.niveau;

import android.graphics.Color;

import p_ms.ms.R;

public class Niveau1 extends Niveau {

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
