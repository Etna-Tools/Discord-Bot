package net.etna.api.object;

import com.google.gson.annotations.SerializedName;

public record Login(@SerializedName("login") String user, @SerializedName("password") String password) implements JsonObject {

}
