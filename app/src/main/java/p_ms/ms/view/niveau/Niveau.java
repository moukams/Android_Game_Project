package p_ms.ms.view.niveau;

import p_ms.ms.view.GreyView;

public interface Niveau {

    void theme(GreyView greyView);
    Niveau next();
    int getMusic();

}
