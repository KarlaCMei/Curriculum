package com.example.curriculum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.curriculum.databinding.ActivityDatosBinding;

public class Datos extends AppCompatActivity {
    private ActivityDatosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_datos);
        recibirDatos();

    }

    public void recibirDatos(){
        Bundle obtenerDatos = getIntent().getExtras();
        if(obtenerDatos!=null){
            //if(obtenerDatos.containsKey(Constants.Datos.USER_NAME)){
            if(obtenerDatos.containsKey("nombre")){
                String obtenerNombre= obtenerDatos.getString("nombre");
                binding.textViewNombre.setText("NOMBRE: " + obtenerNombre);
            }

            if(obtenerDatos.containsKey("especialidad")){
                String obtenerEspecialidad = obtenerDatos.getString("especialidad");
                binding.textViewEspecialidad.setText("ESPECIALIDAD: " + obtenerEspecialidad);
            }

            if(obtenerDatos.containsKey("nacionalidad")){
                String obtenerNacionalidad = obtenerDatos.getString("nacionalidad");
                binding.textViewNacionalidad.setText("NACIONALIDAD: " + obtenerNacionalidad);
            }

            if(obtenerDatos.containsKey("edad")){
                String obtenerEdad = obtenerDatos.getString("edad");
                binding.textViewEdad.setText("EDAD: " + obtenerEdad);
            }

            if(obtenerDatos.containsKey("telefono")){
                String obtenerTelefono = obtenerDatos.getString("telefono");
                binding.textViewNumeroTelefono.setText("NUM. TELEFONO" + obtenerTelefono);
            }

            if(obtenerDatos.containsKey("direccion")){
                String obtenerDireccion = obtenerDatos.getString("direccion");
                binding.textViewDireccion.setText("DIRECCION" + obtenerDireccion);
            }

            if(obtenerDatos.containsKey("objetivo")){
                String obtenerObjetivo = obtenerDatos.getString("objetivo");
                binding.textViewObjetivoProfecional.setText("OBJETIVO PROFECIONAL" + obtenerObjetivo);
            }

            if(obtenerDatos.containsKey("hobbies")){
                String obtenerHobbies = obtenerDatos.getString("hobbies");
                binding.textViewHobbies.setText("HOBBIES: " + obtenerHobbies);
            }

            if(obtenerDatos.containsKey("certificacion")){
                String obtenerCertificacion = obtenerDatos.getString("certificacion");
                binding.textViewCertificacion.setText("CERTIFICACION: " + obtenerCertificacion);
            }

            if(obtenerDatos.containsKey("escuela")){
                String obtenerEscuela = obtenerDatos.getString("escuela");
                binding.textViewEscuela.setText("DONDE ESTUDIO:" + obtenerEscuela);
            }

            if(obtenerDatos.containsKey("trabajo")){
                String obtnerTrabajo = obtenerDatos.getString("trabajo");
                binding.textViewUltimoTrabajo.setText("ULTIMO TRABAJO" + obtnerTrabajo);
            }

            if(obtenerDatos.containsKey("experiencia")){
                String obtenerExperiencia = obtenerDatos.getString("experiencia");
                binding.textViewExperiencia.setText("EXPERIENCIA LABORAL:" + obtenerExperiencia);
            }

            //Otras validaciones

            if(obtenerDatos.containsKey("word")){
                boolean obtenerExperiencia = obtenerDatos.getBoolean("word");
                if(obtenerExperiencia){
                    binding.radioBtnWord.setVisibility(View.VISIBLE);
                }
            }
            if(obtenerDatos.containsKey("excel")){
                boolean obtenerExperiencia = obtenerDatos.getBoolean("excel");
                if(obtenerExperiencia){
                    binding.radioBtnExcel.setVisibility(View.VISIBLE);
                }
            }
            if(obtenerDatos.containsKey("powerPoint")){
                boolean obtenerExperiencia = obtenerDatos.getBoolean("powerPoint");
                if(obtenerExperiencia){
                    binding.radioBtnPowerPoint.setVisibility(View.VISIBLE);
                }
            }
            if(obtenerDatos.containsKey("programacion")){
                boolean obtenerExperiencia = obtenerDatos.getBoolean("programacion");
                if(obtenerExperiencia){
                    binding.radioBtnProgramacion.setVisibility(View.VISIBLE);
                }
            }
            if(obtenerDatos.containsKey("basesDeDatos")){
                boolean obtenerExperiencia = obtenerDatos.getBoolean("basesDeDatos");
                if(obtenerExperiencia){
                    binding.radioBtnBasesDeDatos.setVisibility(View.VISIBLE);
                }
            }
            if(obtenerDatos.containsKey("trabajoEnEquipo")){
                boolean obtenerExperiencia = obtenerDatos.getBoolean("trabajoEnEquipo");
                if(obtenerExperiencia){
                    binding.radioBtnTrabajoEquipo.setVisibility(View.VISIBLE);
                }
            }
            if(obtenerDatos.containsKey("trabajoBajoPresion")){
                boolean obtenerExperiencia = obtenerDatos.getBoolean("trabajoBajoPresion");
                if(obtenerExperiencia){
                    binding.radioBtnTrabajoPresion.setVisibility(View.VISIBLE);
                }
            }
            if(obtenerDatos.containsKey("actitudPositiva")){
                boolean obtenerExperiencia = obtenerDatos.getBoolean("actitudPositiva");
                if(obtenerExperiencia){
                    binding.radioBtnActitud.setVisibility(View.VISIBLE);
                }
            }
            if(obtenerDatos.containsKey("comañerismo")){
                boolean obtenerExperiencia = obtenerDatos.getBoolean("comañerismo");
                if(obtenerExperiencia){
                    binding.radioBtnCompaErismo.setVisibility(View.VISIBLE);
                }
            }
            if(obtenerDatos.containsKey("capacidadAnalitica")){
                boolean obtenerExperiencia = obtenerDatos.getBoolean("capacidadAnalitica");
                if(obtenerExperiencia){
                    binding.radioBtnAnalizar.setVisibility(View.VISIBLE);
                }
            }

        }
    }
}