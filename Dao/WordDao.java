package com.example.ritwikjain.architecturecomponent.Dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.ritwikjain.architecturecomponent.Entities.Word;

import java.util.List;

@Dao
public interface WordDao {
    @Insert
    public void insertWord(Word word);

    @Query("DELETE FROM word_table")
    void deleteAll();

    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();
}
