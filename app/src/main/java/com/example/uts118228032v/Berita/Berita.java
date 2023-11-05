package com.example.uts118228032v.Berita;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Berita {


        @SerializedName("success")
        @Expose
        private boolean success;
        @SerializedName("message")
        @Expose
        private Object message;
        @SerializedName("data")
        @Expose
        private Data data;

        public boolean isSuccess() {
        return success;
    }

        public void setSuccess(boolean success) {
        this.success = success;
    }

        public Object getMessage() {
        return message;
    }

        public void setMessage(Object message) {
        this.message = message;
    }

        public Data getData() {
        return data;
    }

        public void setData(Data data) {
        this.data = data;
    }

    }
