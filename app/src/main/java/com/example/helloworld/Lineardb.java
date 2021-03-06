package com.example.helloworld;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;
@Entity(tableName = "Lineardb")
public class Lineardb implements Serializable{
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int key;

    @ColumnInfo(name = "xvalue")
    private float xval;

    @ColumnInfo(name = "yvalue")
    private float yval;

    @ColumnInfo(name = "zvalue")
    private float zval;

    public int getKey() {
        return key;

    }

    public void setKey(int key) {
        this.key = key;
    }

    public float getXval() {
        return xval;
    }

    public float getYval() {
        return yval;
    }

    public float getZval() {
        return zval;
    }

    public void setXval(float xval) {
        this.xval = xval;
    }

    public void setYval(float yval) {
        this.yval = yval;
    }

    public void setZval(float zval) {
        this.zval = zval;
    }
}


