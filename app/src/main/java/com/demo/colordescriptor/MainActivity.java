package com.demo.colordescriptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerColors; //создание ссылки, называем его по id элемента в activity_main. Обращение к Spinner при помощи обращения к классу
    private TextView textViewDescriptionTemp; // называем его по id элемента в activity_main

    @Override
    protected void onCreate(Bundle savedInstanceState) { // вызывается при создании активности
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // установить макет для данной активности (MainActivity)
        spinnerColors = findViewById(R.id.spinnerColors); // наведение созданной ссылки на конкретный элемент в activity_main
        textViewDescriptionTemp = findViewById(R.id.textViewDescriptionTemp); // // наведение созданной ссылки на конкретный элемент в activity_main
    }

    public void showDescription(View view) {
        int position = spinnerColors.getSelectedItemPosition();// получили позицию одного из элементов, которые указаны в спиннере
        String description = getDescriptionByPosition(position);
        textViewDescriptionTemp.setText(description); // выводим всё в textview
    }

    private String getDescriptionByPosition(int position) { // принимает позицию элемента
        String[] descriptions = getResources().getStringArray(R.array.description_of_temp); // получили массив с описаниями характеров
        return descriptions[position]; // возвращаем строку
    }
}
