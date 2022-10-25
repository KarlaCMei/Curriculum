package com.example.curriculum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

import com.example.curriculum.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private boolean radiobtnword;
    private boolean checkBoxExcel;
    private boolean checkBoxPowerPoint;
    private boolean checkBoxProgramacion;
    private boolean checkBoxBasesDeDatos;
    private boolean checkBoxTrabajoEnEquipo;
    private boolean checkBoxTrabajoBajoPresion;
    private boolean checkBoxActitudPositiva;
    private boolean checkBoxCompeñerismo;
    private boolean checkBoxCapacidadAnalitica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);


        binding.btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Datos.class);


                String nombre = binding.editTextNombre.getText().toString();
                //intent.putExtra(Constants.ConectionRetrofit.URL, nombre);
                intent.putExtra("nombre", nombre);


                String especialidad = binding.editTextEspecialidad.getText().toString();
                intent.putExtra("especialidad", especialidad);

                String nacionalidad = binding.editTextNacionalidad.getText().toString();
                intent.putExtra("nacionalidad", nacionalidad);

                String edad = binding.editTextEdad.getText().toString();
                intent.putExtra("edad", edad);

                String numeroDeTelefono = binding.editTextNumeroTelefono.getText().toString();
                intent.putExtra("telefono", numeroDeTelefono);

                String direccion = binding.editTextDireccion.getText().toString();
                intent.putExtra("direccion", direccion);

                String objetivo = binding.editTextObjetivoProfecional.getText().toString();
                intent.putExtra("objetivo", objetivo);

                String hobbies = binding.editTextHobbies.getText().toString();
                intent.putExtra("hobbies", hobbies);

                String certificacion = binding.editTextCertificacion.getText().toString();
                intent.putExtra("certificacion", certificacion);

                String escuela = binding.editTextEscuela.getText().toString();
                intent.putExtra("escuela", escuela);

                String ultimoTrabajo = binding.editTextUltimoTrabajo.getText().toString();
                intent.putExtra("trabajo", ultimoTrabajo);

                String experienciaLaboral = binding.editTextExperiencia.getText().toString();
                intent.putExtra("experiencia", experienciaLaboral);


                intent.putExtra("word", radiobtnword);
                intent.putExtra("excel", checkBoxExcel);
                intent.putExtra("powerPoint", checkBoxPowerPoint);
                intent.putExtra("programacion", checkBoxProgramacion);
                intent.putExtra("basesDeDatos", checkBoxBasesDeDatos);
                intent.putExtra("trabajoEnEquipo", checkBoxTrabajoEnEquipo);
                intent.putExtra("trabajoBajoPresion", checkBoxTrabajoBajoPresion);
                intent.putExtra("actitudPositiva", checkBoxActitudPositiva);
                intent.putExtra("comañerismo", checkBoxCompeñerismo);
                intent.putExtra("capacidadAnalitica", checkBoxCapacidadAnalitica);


                startActivity(intent);

            }
        });

        binding.checkWord.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                radiobtnword = isChecked;
                Log.e("Checkbox","Listener Switch is checked: "+isChecked);
                /*Intent intent = new Intent(MainActivity.this, Datos.class);
                startActivity(intent);*/
            }
        });


        binding.radioBtnExcel.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBoxExcel = isChecked;
                Log.e("Checkbox","Listener Switch is checked: "+isChecked);
            }
        });


        binding.radioBtnPowerPoint.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBoxPowerPoint = isChecked;
                Log.e("Checkbox","Listener Switch is checked: "+isChecked);
            }
        });


        binding.radioBtnProgramacion.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBoxProgramacion = isChecked;
                Log.e("Checkbox","Listener Switch is checked: "+isChecked);
            }
        });

        binding.radioBtnBasesDeDatos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBoxBasesDeDatos = isChecked;
                Log.e("Checkbox","Listener Switch is checked: "+isChecked);
            }
        });

        binding.radioBtnTrabajoEquipo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBoxTrabajoEnEquipo = isChecked;
                Log.e("Checkbox","Listener Switch is checked: "+isChecked);
            }
        });

        binding.radioBtnTrabajoPresion.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBoxTrabajoBajoPresion = isChecked;
                Log.e("Checkbox","Listener Switch is checked: "+isChecked);
            }
        });

        binding.radioBtnActitud.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBoxActitudPositiva = isChecked;
                Log.e("Checkbox","Listener Switch is checked: "+isChecked);
            }
        });

        binding.radioBtnCompaErismo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBoxCompeñerismo = isChecked;
                Log.e("Checkbox","Listener Switch is checked: "+isChecked);
            }
        });

        binding.radioBtnAnalizar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBoxCapacidadAnalitica = isChecked;
                Log.e("Checkbox","Listener Switch is checked: "+isChecked);
            }
        });
    }
}