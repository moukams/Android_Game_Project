package p_ms.ms;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Adapter extends BaseAdapter {

    int[] image;
    Context C ;
   public Adapter (Context C,int image[]){
       this.image=image;
       this.C=C;
   }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int i) {
        return image[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView im=new ImageView(C);
im.setImageResource(image[i]);
im.setLayoutParams(new GridView.LayoutParams(200,200));

        return im;
    }
}
