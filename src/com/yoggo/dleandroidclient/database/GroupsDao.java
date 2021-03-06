package com.yoggo.dleandroidclient.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.yoggo.dleandroidclient.database.Groups;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table GROUPS.
*/
public class GroupsDao extends AbstractDao<Groups, Long> {

    public static final String TABLENAME = "GROUPS";

    /**
     * Properties of entity Groups.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property GroupName = new Property(1, String.class, "GroupName", false, "GROUP_NAME");
        public final static Property AllowAddNews = new Property(2, Boolean.class, "AllowAddNews", false, "ALLOW_ADD_NEWS");
        public final static Property AllowAddCommentary = new Property(3, Boolean.class, "AllowAddCommentary", false, "ALLOW_ADD_COMMENTARY");
        public final static Property AllowEditCommentary = new Property(4, Boolean.class, "AllowEditCommentary", false, "ALLOW_EDIT_COMMENTARY");
        public final static Property AllowDeleteCommentary = new Property(5, Boolean.class, "AllowDeleteCommentary", false, "ALLOW_DELETE_COMMENTARY");
        public final static Property AllowEditAllCommentary = new Property(6, Boolean.class, "AllowEditAllCommentary", false, "ALLOW_EDIT_ALL_COMMENTARY");
        public final static Property AllowDeleteAllCommentary = new Property(7, Boolean.class, "AllowDeleteAllCommentary", false, "ALLOW_DELETE_ALL_COMMENTARY");
        public final static Property AdminCategories = new Property(8, Boolean.class, "AdminCategories", false, "ADMIN_CATEGORIES");
        public final static Property CatAllowAddNews = new Property(9, String.class, "CatAllowAddNews", false, "CAT_ALLOW_ADD_NEWS");
    };


    public GroupsDao(DaoConfig config) {
        super(config);
    }
    
    public GroupsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'GROUPS' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'GROUP_NAME' TEXT," + // 1: GroupName
                "'ALLOW_ADD_NEWS' INTEGER," + // 2: AllowAddNews
                "'ALLOW_ADD_COMMENTARY' INTEGER," + // 3: AllowAddCommentary
                "'ALLOW_EDIT_COMMENTARY' INTEGER," + // 4: AllowEditCommentary
                "'ALLOW_DELETE_COMMENTARY' INTEGER," + // 5: AllowDeleteCommentary
                "'ALLOW_EDIT_ALL_COMMENTARY' INTEGER," + // 6: AllowEditAllCommentary
                "'ALLOW_DELETE_ALL_COMMENTARY' INTEGER," + // 7: AllowDeleteAllCommentary
                "'ADMIN_CATEGORIES' INTEGER," + // 8: AdminCategories
                "'CAT_ALLOW_ADD_NEWS' TEXT);"); // 9: CatAllowAddNews
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'GROUPS'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Groups entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String GroupName = entity.getGroupName();
        if (GroupName != null) {
            stmt.bindString(2, GroupName);
        }
 
        Boolean AllowAddNews = entity.getAllowAddNews();
        if (AllowAddNews != null) {
            stmt.bindLong(3, AllowAddNews ? 1l: 0l);
        }
 
        Boolean AllowAddCommentary = entity.getAllowAddCommentary();
        if (AllowAddCommentary != null) {
            stmt.bindLong(4, AllowAddCommentary ? 1l: 0l);
        }
 
        Boolean AllowEditCommentary = entity.getAllowEditCommentary();
        if (AllowEditCommentary != null) {
            stmt.bindLong(5, AllowEditCommentary ? 1l: 0l);
        }
 
        Boolean AllowDeleteCommentary = entity.getAllowDeleteCommentary();
        if (AllowDeleteCommentary != null) {
            stmt.bindLong(6, AllowDeleteCommentary ? 1l: 0l);
        }
 
        Boolean AllowEditAllCommentary = entity.getAllowEditAllCommentary();
        if (AllowEditAllCommentary != null) {
            stmt.bindLong(7, AllowEditAllCommentary ? 1l: 0l);
        }
 
        Boolean AllowDeleteAllCommentary = entity.getAllowDeleteAllCommentary();
        if (AllowDeleteAllCommentary != null) {
            stmt.bindLong(8, AllowDeleteAllCommentary ? 1l: 0l);
        }
 
        Boolean AdminCategories = entity.getAdminCategories();
        if (AdminCategories != null) {
            stmt.bindLong(9, AdminCategories ? 1l: 0l);
        }
 
        String CatAllowAddNews = entity.getCatAllowAddNews();
        if (CatAllowAddNews != null) {
            stmt.bindString(10, CatAllowAddNews);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Groups readEntity(Cursor cursor, int offset) {
        Groups entity = new Groups( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // GroupName
            cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0, // AllowAddNews
            cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0, // AllowAddCommentary
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0, // AllowEditCommentary
            cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0, // AllowDeleteCommentary
            cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0, // AllowEditAllCommentary
            cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0, // AllowDeleteAllCommentary
            cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0, // AdminCategories
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // CatAllowAddNews
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Groups entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setGroupName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAllowAddNews(cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0);
        entity.setAllowAddCommentary(cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0);
        entity.setAllowEditCommentary(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
        entity.setAllowDeleteCommentary(cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0);
        entity.setAllowEditAllCommentary(cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0);
        entity.setAllowDeleteAllCommentary(cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0);
        entity.setAdminCategories(cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0);
        entity.setCatAllowAddNews(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Groups entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Groups entity) {
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
