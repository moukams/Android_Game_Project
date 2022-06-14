package p_ms.ms.view.niveau;

import android.graphics.Color;

import p_ms.ms.R;
import p_ms.ms.view.GreyView;

public abstract class Niveau {

    public void theme(GreyView greyView){
        greyView.getBack().setBackgroundResource(getBackground());
        greyView.setCaa(getCaa());
        greyView.setCa(getCa());
        greyView.setCy(getCy());
        greyView.getNi().setText("Niveau= "+ getNiveau());
        greyView.getS().setTextColor(Color.argb(255,255,176,0));
        greyView.getT().setTextColor(Color.argb(255,255,176,0));
        greyView.getNi().setTextColor(Color.argb(205,255,117,12));
        greyView.getBt().setTextColor(Color.argb(255,255,255,250));
        greyView.getbView().setBackgroundColor(Color.argb(100,0,0,0));
        greyView.music();
    }

    protected abstract int getNiveau();

    protected abstract int getCy();

    protected abstract int getCa();

    protected abstract int getCaa();

    protected abstract int getBackground();

    public abstract Niveau next();

    public abstract int getMusic();

}
