package p_ms.ms.view.niveau;

import android.graphics.Color;

import p_ms.ms.R;

public class Niveau4 extends Niveau{

    @Override
    protected int getNiveau() {
        return 4;
    }

    @Override
    protected int getCy() {
        return 700;
    }

    @Override
    protected int getCa() {
        return R.mipmap.x4;
    }

    @Override
    protected int getCaa() {
        return R.mipmap.oo4;
    }

    @Override
    protected int getBackground() {
        return R.mipmap.t4;
    }

    @Override
    public Niveau next() {
        return new Niveau5();
    }

    @Override
    public int getMusic() {
        return R.raw.t4m;
    }
}
