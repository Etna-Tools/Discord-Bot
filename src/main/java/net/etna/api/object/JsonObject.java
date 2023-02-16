package net.etna.api.object;

import com.google.gson.Gson;

public interface JsonObject {

    public default String toJson() {
        final Gson gson = new Gson();

        return gson.toJson(this);

    }

}
