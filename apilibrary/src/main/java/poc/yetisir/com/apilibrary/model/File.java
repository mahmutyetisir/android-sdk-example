package poc.yetisir.com.apilibrary.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class File {

    @SerializedName("FileUrl")
    @Expose
    public String fileUrl;

    @SerializedName("MetaData")
    @Expose
    public FileMetaData metaData;


}
