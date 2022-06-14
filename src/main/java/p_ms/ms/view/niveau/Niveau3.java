package p_ms.ms.view.niveau;

import android.graphics.Color;

import p_ms.ms.R;

public class Niveau3 extends Niveau{

    @Override
    protected int getNiveauTextColor() {
        return Color.argb(255,126,7,174);
    }

    @Override
    protected int getTextColor() {
        return Color.argb(255,0,12,0);
    }

    @Override
    protected int getNiveau() {
        return 3;
    }

    @Override
    protected int getCy() {
        return 800;
    }

    @Override
    protected int getCa() {
        return R.mipmap.x3;
    }

    @Override
    protected int getCaa() {
        return R.mipmap.oo3;
    }

    @Override
    protected int getBackground() {
        return R.mipmap.t3;
    }

    @Override
    public Niveau next() {
        return new Niveau4();
    }

    @Override
    public int getMusic() {
        return R.raw.t3m;
    }

}
