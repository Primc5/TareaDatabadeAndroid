package com.u_tad.db;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {


    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    private int mId;
    @ColumnInfo(name = "word")
    private String mWord;
    @ColumnInfo(name = "number")
    private int mNumber;

    public Word(@NonNull int id, String word, int number) {
        this.mWord = word;
        this.mId = id;
        this.mNumber = number;
    }

    public String getWord(){return this.mWord;}
    public int getId(){return this.mId;}
    public int getNumber(){return this.mNumber;}
}


