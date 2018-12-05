package poc.yetisir.com.apilibrary.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class News {

    @SerializedName("Id")
    @Expose
    public String id;

    @SerializedName("ContentType")
    @Expose
    public String contentType;

    @SerializedName("CreatedDate")
    @Expose
    public String createdDate;

    @SerializedName("Description")
    @Expose
    public String description;

    @SerializedName("Files")
    @Expose
    public List<File> files;

    @SerializedName("ModifiedDate")
    @Expose
    public String modifiedDate;


    @SerializedName("Path")
    @Expose
    public String path;


    @SerializedName("StartDate")
    @Expose
    public String startDate;

    @SerializedName("Tags")
    @Expose
    public List<String> tags;

    @SerializedName("Title")
    @Expose
    public String title;


    @SerializedName("Url")
    @Expose
    public String url;
}
