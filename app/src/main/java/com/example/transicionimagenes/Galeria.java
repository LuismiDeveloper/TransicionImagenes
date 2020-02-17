package com.example.transicionimagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class Galeria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PapelView papel = new PapelView(this);
        setContentView(papel);
    }

    private class PapelView extends View {

        public PapelView (Context context){
            super(context);
        }

        protected void onDraw (Canvas canvas){
            super.onDraw(canvas);

            //Objeto paint
            Paint paint = new Paint();

            // Color de fondo para el Canvas
            paint.setColor(Color.BLACK);

            // Pintar el canvas en el Activity
            canvas.drawPaint(paint);

            // Texto inicial
            paint.setColor(Color.WHITE);
            paint.setTextSize(60);
            paint.setAntiAlias(true);

            // Posiciones para que salga el texto centrado
            paint.setTextAlign(Paint.Align.CENTER);
            int posX = canvas.getWidth() / 2;
            int posY = (int) ((canvas.getHeight()/2) - ((paint.descent() + paint.ascent()) / 2));

            // Dibujamos el texto
            canvas.drawText("Galería de Arte", posX, posY, paint);

        }
    }


}
