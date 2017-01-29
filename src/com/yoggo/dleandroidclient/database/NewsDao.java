package com.yoggo.dleandroidclient.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.yoggo.dleandroidclient.database.News;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table NEWS.
*/
public class NewsDao extends AbstractDao<News, Long> {

    public static final String TABLENAME = "NEWS";

    /**
     * Properties of entity News.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Title = new Property(1, String.class, "Title", false, "TITLE");
        public final static Property ShortStory = new Property(2, String.class, "ShortStory", false, "SHORT_STORY");
        public final static Property FullStory = new Property(3, String.class, "FullStory", false, "FULL_STORY");
        public final static Property Date = new Property(4, String.class, "Date", false, "DATE");
        public final static Property Author = new Property(5, String.class, "Author", false, "AUTHOR");
        public final static Property NewsRead = new Property(6, String.class, "NewsRead", false, "NEWS_READ");
        public final static Property Rating = new Property(7, String.class, "Rating", false, "RATING");
        public final static Property CommNum = new Property(8, String.class, "CommNum", false, "COMM_NUM");
        public final static Property UserId = new Property(9, String.class, "UserId", false, "USER_ID");
        public final static Property Category = new Property(10, String.class, "Category", false, "CATEGORY");
        public final static Property Image = new Property(11, byte[].class, "Image", false, "IMAGE");
    };


    public NewsDao(DaoConfig config) {
        super(config);
    }
    
    public NewsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'NEWS' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'TITLE' TEXT," + // 1: Title
                "'SHORT_STORY' TEXT," + // 2: ShortStory
                "'FULL_STORY' TEXT," + // 3: FullStory
                "'DATE' TEXT," + // 4: Date
                "'AUTHOR' TEXT," + // 5: Author
                "'NEWS_READ' TEXT," + // 6: NewsRead
                "'RATING' TEXT," + // 7: Rating
                "'COMM_NUM' TEXT," + // 8: CommNum
                "'USER_ID' TEXT," + // 9: UserId
                "'CATEGORY' TEXT," + // 10: Category
                "'IMAGE' BLOB);"); // 11: Image
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'NEWS'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, News entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String Title = entity.getTitle();
        if (Title != null) {
            stmt.bindString(2, Title);
        }
 
        String ShortStory = entity.getShortStory();
        if (ShortStory != null) {
            stmt.bindString(3, ShortStory);
        }
 
        String FullStory = entity.getFullStory();
        if (FullStory != null) {
            stmt.bindString(4, FullStory);
        }
 
        String Date = entity.getDate();
        if (Date != null) {
            stmt.bindString(5, Date);
        }
 
        String Author = entity.getAuthor();
        if (Author != null) {
            stmt.bindString(6, Author);
        }
 
        String NewsRead = entity.getNewsRead();
        if (NewsRead != null) {
            stmt.bindString(7, NewsRead);
        }
 
        String Rating = entity.getRating();
        if (Rating != null) {
            stmt.bindString(8, Rating);
        }
 
        String CommNum = entity.getCommNum();
        if (CommNum != null) {
            stmt.bindString(9, CommNum);
        }
 
        String UserId = entity.getUserId();
        if (UserId != null) {
            stmt.bindString(10, UserId);
        }
 
        String Category = entity.getCategory();
        if (Category != null) {
            stmt.bindString(11, Category);
        }
 
        byte[] Image = entity.getImage();
        if (Image != null) {
            stmt.bindBlob(12, Image);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public News readEntity(Cursor cursor, int offset) {
        News entity = new News( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // Title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // ShortStory
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // FullStory
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // Date
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // Author
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // NewsRead
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // Rating
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // CommNum
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // UserId
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // Category
            cursor.isNull(offset + 11) ? null : cursor.getBlob(offset + 11) // Image
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, News entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setShortStory(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setFullStory(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDate(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAuthor(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setNewsRead(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setRating(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCommNum(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setUserId(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setCategory(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setImage(cursor.isNull(offset + 11) ? null : cursor.getBlob(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(News entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(News entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}