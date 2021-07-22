package com.room.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.an.room.model.Note;
import com.room.dao.DaoAccess;


@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class NoteDatabase extends RoomDatabase {

    public abstract DaoAccess daoAccess();
}
