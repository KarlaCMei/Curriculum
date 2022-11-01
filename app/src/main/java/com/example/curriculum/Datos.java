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
            if(obtenerDatos.containsKey(Constants.USER_NAME)){
                String obtenerNombre= obtenerDatos.getString(Constants.USER_NAME);
                binding.textViewNombre.setText("NOMBRE: " + obtenerNombre);
            }

            if(obtenerDatos.containsKey(Constants.USER_SPECIALTY)){
                String obtenerEspecialidad = obtenerDatos.getString(Constants.USER_SPECIALTY);
                binding.textViewEspecialidad.setText("ESPECIALIDAD: " + obtenerEspecialidad);
            }

            if(obtenerDatos.containsKey(Constants.USER_NATIONALITY)){
                String obtenerNacionalidad = obtenerDatos.getString(Constants.USER_NATIONALITY);
                binding.textViewNacionalidad.setText("NACIONALIDAD: " + obtenerNacionalidad);
            }

            if(obtenerDatos.containsKey(Constants.USER_AGE)){
                String obtenerEdad = obtenerDatos.getString(Constants.USER_AGE);
                binding.textViewEdad.setText("EDAD: " + obtenerEdad);
            }

            if(obtenerDatos.containsKey(Constants.USER_PHONE)){
                String obtenerTelefono = obtenerDatos.getString(Constants.USER_PHONE);
                binding.textViewNumeroTelefono.setText("NUM. TELEFONO" + obtenerTelefono);
            }

            if(obtenerDatos.containsKey(Constants.USER_DIRECCTION)){
                String obtenerDireccion = obtenerDatos.getString(Constants.USER_DIRECCTION);
                binding.textViewDireccion.setText("DIRECCION" + obtenerDireccion);
            }

            if(obtenerDatos.containsKey(Constants.USER_OBJECTIVE)){
                String obtenerObjetivo = obtenerDatos.getString(Constants.USER_OBJECTIVE);
                binding.textViewObjetivoProfecional.setText("OBJETIVO PROFECIONAL" + obtenerObjetivo);
            }

            if(obtenerDatos.containsKey(Constants.USER_HOBBIES)){
                String obtenerHobbies = obtenerDatos.getString(Constants.USER_HOBBIES);
                binding.textViewHobbies.setText("HOBBIES: " + obtenerHobbies);
            }

            if(obtenerDatos.containsKey(Constants.USER_CERTIFICATION)){
                String obtenerCertificacion = obtenerDatos.getString(Constants.USER_CERTIFICATION);
                binding.textViewCertificacion.setText("CERTIFICACION: " + obtenerCertificacion);
            }

            if(obtenerDatos.containsKey(Constants.USER_SCHOOL)){
                String obtenerEscuela = obtenerDatos.getString(Constants.USER_SCHOOL);
                binding.textViewEscuela.setText("DONDE ESTUDIO:" + obtenerEscuela);
            }

            if(obtenerDatos.containsKey(Constants.USER_WORK)){
                String obtnerTrabajo = obtenerDatos.getString(Constants.USER_WORK);
                binding.textViewUltimoTrabajo.setText("ULTIMO TRABAJO" + obtnerTrabajo);
            }

            if(obtenerDatos.containsKey(Constants.USER_EXPERIENCIE)){
                String obtenerExperiencia = obtenerDatos.getString(Constants.USER_EXPERIENCIE);
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