package p_ms.ms.view.niveau;

import android.graphics.Color;

import p_ms.ms.R;

public class Niveau2 extends Niveau{

    @Override
    protected int getNiveau() {
        return 2;
    }

    @Override
    protected int getCy() {
        return 900;
    }

    @Override
    protected int getCa() {
        return R.mipmap.oo2;
    }

    @Override
    protected int getCaa() {
        return R.mipmap.x2;
    }

    @Override
    protected int getBackground() {
        return R.mipmap.t2;
    }

    @Override
    public Niveau next() {
        return new Niveau3();
    }

    @Override
    public int getMusic() {
        return R.raw.t2m;
    }

}
