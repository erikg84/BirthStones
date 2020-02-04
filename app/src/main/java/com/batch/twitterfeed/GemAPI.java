package com.batch.twitterfeed;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

public class GemAPI {

    public ArrayList<GemModel> getList(Context context) {
        ArrayList<GemModel> models = new ArrayList<>();
        GemModel model = new GemModel();

        model.setName("GARNET");
        model.setDescription(context.getString(R.string.garnet));
        model.setImageId(R.mipmap.ic_garnet_foreground);
        models.add(model);

        model = new GemModel();
        model.setName("AMETHYST");
        model.setDescription(context.getString(R.string.amethyst));
        model.setImageId(R.mipmap.ic_amethyst_foreground);
        models.add(model);

        model = new GemModel();
        model.setName("BLOOD STONE");
        model.setDescription(context.getString(R.string.bloodstone));
        model.setImageId(R.mipmap.ic_bloodstone_foreground);
        models.add(model);

        model = new GemModel();
        model.setName("DIAMOND");
        model.setDescription(context.getString(R.string.diamond));
        model.setImageId(R.mipmap.ic_carnelian_foreground);
        models.add(model);

        model = new GemModel();
        model.setName("AGATE");
        model.setDescription(context.getString(R.string.agate));
        model.setImageId(R.mipmap.ic_agate_foreground);
        models.add(model);

        model = new GemModel();
        model.setName("EMERALD");
        model.setDescription(context.getString(R.string.emerald));
        model.setImageId(R.mipmap.ic_emerald_foreground);
        models.add(model);

        model = new GemModel();
        model.setName("ONYX");
        model.setDescription(context.getString(R.string.onyx));
        model.setImageId(R.mipmap.ic_onyx_foreground);
        models.add(model);

        model = new GemModel();
        model.setName("CARNELIAN");
        model.setDescription(context.getString(R.string.carnelian));
        model.setImageId(R.mipmap.ic_carnelian_foreground);
        models.add(model);

        model = new GemModel();
        model.setName("CHRYSOLITE");
        model.setDescription(context.getString(R.string.chrysolite));
        model.setImageId(R.mipmap.ic_chrysolite_foreground);
        models.add(model);

        model = new GemModel();
        model.setName("BERYL");
        model.setDescription(context.getString(R.string.beryl));
        model.setImageId(R.mipmap.ic_beryl_foreground);
        models.add(model);

        model = new GemModel();
        model.setName("TOPAZ");
        model.setDescription(context.getString(R.string.topaz));
        model.setImageId(R.mipmap.ic_topaz_foreground);
        models.add(model);

        model = new GemModel();
        model.setName("RUBY");
        model.setDescription(context.getString(R.string.ruby));
        model.setImageId(R.mipmap.ic_ruby_foreground);
        models.add(model);


        return models;
    }

}
