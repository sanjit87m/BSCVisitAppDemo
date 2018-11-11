package org.bsc.com.bsc;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Model {
    @SerializedName("Categories")
    private ArrayList<Categories> categoriesArrayList;
    public void setCategories(ArrayList<Categories> categoriesArrayList)
    {
        this.categoriesArrayList = categoriesArrayList;
    }

    public ArrayList<Categories> getCategories()
    {
        return categoriesArrayList;
    }
    public class Categories implements Serializable {
        @SerializedName("title")
        private String title;
        @SerializedName("index")
        private String index;
        @SerializedName("fileType")
        private String fileType;
        @SerializedName("fileName")
        private String fileName;
        @SerializedName("location")
        private String location;
        @SerializedName("url")
        private String url;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public String getFileType() {
            return fileType;
        }

        public void setFileType(String fileType) {
            this.fileType = fileType;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

}


