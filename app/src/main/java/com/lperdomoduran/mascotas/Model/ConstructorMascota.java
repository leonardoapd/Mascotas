package com.lperdomoduran.mascotas.Model;

import android.content.ContentValues;
import android.content.Context;

import com.lperdomoduran.mascotas.DB.BaseDatos;
import com.lperdomoduran.mascotas.DB.ConstantesBaseDatos;
import com.lperdomoduran.mascotas.R;

import java.util.ArrayList;

/**
 * Created by lperdomoduran on 25/11/16.
 */

public class ConstructorMascota {

    private Context context;
    private static final int LIKE = 1;

    public ConstructorMascota(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> getData(){
        BaseDatos db = new BaseDatos(context);
        insertData(db);
        return db.getAllMacotas();
    }

    public void insertData(BaseDatos db){

        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Joe");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.argentino);
        db.insertMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Barry");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.brasilero);
        db.insertMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Cisco");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.havanese);
        db.insertMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Wally");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.chihuahua);
        db.insertMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Caitlin");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.mucuchies);
        db.insertMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Wells");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.orchid);
        db.insertMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Jay");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.paulinista);
        db.insertMascota(contentValues);

    }

    public void giveLikeMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_ID_MASCOTA, mascota.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_NUMERO_LIKES, LIKE);
        db.insertLikes(contentValues);
    }

    public int getLikesMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.getLikesMascota(mascota);
    }

}
