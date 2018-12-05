package poc.yetisir.com.apilibrary.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FileMetaData {

    @SerializedName("Title")
    @Expose
    public String title;

    @SerializedName("Description")
    @Expose
    public String description;
}
