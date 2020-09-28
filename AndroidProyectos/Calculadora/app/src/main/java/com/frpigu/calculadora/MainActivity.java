package com.frpigu.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity    {
    TextView textviewVentana;
    String num1, num2;
    String operacion, operacionPasada;
    boolean repetitivo=false;
String Recurrente;
String NumeroMS;

    public void OperacionMetodo (String operacionPasada){
        operacion=operacionPasada;
        this.repetitivo=false;
        num1= String.valueOf(this.textviewVentana.getText());
        this.setTextViewText("");

    }


    public void setTextViewText(String text)
        {
             TextView textview = (TextView) findViewById(R.id.resultadoVentana);
        
                 textview.setText(text);
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







Button boton1, boton2, boton3, boton4,boton5,boton6,boton7,boton8,boton9,boton0;

            setContentView(R.layout.activity_main);
            boton1 = (Button) findViewById(R.id.Boton1);
            boton2 = (Button) findViewById(R.id.Boton2);
            boton3 = (Button) findViewById(R.id.Boton3);
            boton4 = (Button) findViewById(R.id.Boton4);
            boton5 = (Button) findViewById(R.id.Boton5);
            boton6 = (Button) findViewById(R.id.Boton6);
            boton7 = (Button) findViewById(R.id.Boton7);
            boton8 = (Button) findViewById(R.id.Boton8);
            boton9 = (Button) findViewById(R.id.Boton9);
            boton1 = (Button) findViewById(R.id.Boton0);


        textviewVentana  = (TextView) findViewById(R.id.resultadoVentana);





    }

    public void BotonClick(View view) {

        switch(view.getId()) {

            case R.id.BotonMMas:
                NumeroMS= String.valueOf(Float.parseFloat(String.valueOf(this.textviewVentana.getText())) + Float.parseFloat(NumeroMS));
                break; // break es opcional


            case R.id.BotonM:
                if(NumeroMS!=null){
                    this.textviewVentana.setText(NumeroMS);
                }



                break; // break es opcional



            case R.id.BotonMMenos:
                NumeroMS= String.valueOf(Float.parseFloat(String.valueOf(this.textviewVentana.getText())) - Float.parseFloat(NumeroMS));
                break; // break es opcional


            case R.id.BotonMS:
                NumeroMS=String.valueOf(this.textviewVentana.getText());
                break; // break es opcional

            case R.id.BotonRaiz:
                double resultado = Math.sqrt(Double.parseDouble(String.valueOf(this.textviewVentana.getText())));
                this.textviewVentana.setText(String.valueOf(resultado));
break;

            case R.id.BotonPorcentaje:
                try {
                    this.textviewVentana.setText((String.valueOf( Float.parseFloat(num1) %  Float.parseFloat(num2) )));
                    this.num1=String.valueOf(this.textviewVentana.getText());

                } catch (ArithmeticException e) { //
                    System.out.println("Division by zero.");
                    num1="0";
                    num2="0";
                }
                break;

            case R.id.BotonCreditos:

                Toast.makeText(this,getResources().getString(R.string.MensajeBoton1), Toast.LENGTH_SHORT).show();



                break;



            // declaración case
            // los valores deben ser del mismo tipo de la expresión
            case R.id.Boton1:

                this.setTextViewText(this.textviewVentana.getText() + "1");


                break; // break es opcional


            case R.id.Boton2:
                this.setTextViewText(this.textviewVentana.getText() + "2");

                break; // break es opcional


            case R.id.Boton3:
                this.setTextViewText(this.textviewVentana.getText() + "3");

                break; // break es opcional


            case R.id.Boton4:
                this.setTextViewText(this.textviewVentana.getText() + "4");

                break; // break es opcional


            case R.id.Boton5:
                this.setTextViewText(this.textviewVentana.getText() + "5");

                break; // break es opcional


            case R.id.Boton6:
                this.setTextViewText(this.textviewVentana.getText() + "6");

                break; // break es opcional


            case R.id.Boton7:
                this.setTextViewText(this.textviewVentana.getText() + "7");

                break; // break es opcional


            case R.id.Boton8:
                this.setTextViewText(this.textviewVentana.getText() + "8");

                break; // break es opcional


            case R.id.Boton9:
                this.setTextViewText(this.textviewVentana.getText() + "9");

                break; // break es opcional


            case R.id.Boton0:
                this.setTextViewText(this.textviewVentana.getText() + "0");

                break; // break es opcional

            case R.id.BotonIgual:



                if(!this.repetitivo){
                    num2=String.valueOf(this.textviewVentana.getText());
                    this.setTextViewText("");
                }


                switch(operacion)
                {
                    // declaración case
                    // los valores deben ser del mismo tipo de la expresión
                    case "Sumar" :


                        this.Recurrente=num1;
                        this.setTextViewText((String.valueOf( Float.parseFloat(num1) +  Float.parseFloat(num2) )));
                        this.num1=String.valueOf(this.textviewVentana.getText());



                        break; // break es opcional

                    case "Restar" :
                        this.Recurrente=num1;
                        this.setTextViewText((String.valueOf( Float.parseFloat(num1) -  Float.parseFloat(num2) )));
                        this.num1=String.valueOf(this.textviewVentana.getText());


                        break; // break es opcional

                    case "Multiplicar" :
                        this.Recurrente=num1;
                        this.setTextViewText((String.valueOf( Float.parseFloat(num1) *  Float.parseFloat(num2) )));
                        this.num1=String.valueOf(this.textviewVentana.getText());


                        break; // break es opcional

                    case "Dividir" :
                        this.Recurrente=num1;

                        try {

                            this.setTextViewText((String.valueOf( Float.parseFloat(num1) /  Float.parseFloat(num2) )));
                            this.num1=String.valueOf(this.textviewVentana.getText());


                        } catch (ArithmeticException e) { //
                            System.out.println("Division by zero.");
                            num1="0";
                            num2="0";

                        }







                        break;

                    // Podemos tener cualquier número de declaraciones de casos o case
                    // debajo se encuentra la declaración predeterminada, que se usa cuando ninguno de los casos es verdadero.
                    // No se necesita descanso en el case default
                    default :
                        // Declaraciones
                }

                this.repetitivo=true;

                break; // break es opcional


            case R.id.BotonComa:
String texto = String.valueOf(this.textviewVentana.getText());
if(!texto.contains(".")){
    this.setTextViewText(this.textviewVentana.getText() + ".");

}



                break; // break es opcional


            case R.id.BotonDividir:
                this.OperacionMetodo("Dividir");
                break; // break es opcional

            case R.id.BotonSumar:

                this.OperacionMetodo("Sumar");

                break; // break es opcional

            case R.id.BotonRestar:

                this.OperacionMetodo("Restar");

                break; // break es opcional

            case R.id.BotonMultiplicar:

                this.OperacionMetodo("Multiplicar");

                break; // break es opcional


            case R.id.BotonSupr:

                String str = this.textviewVentana.getText().toString();





                if (!str.equals(""))
                    str = str.substring(0, str.length() - 1);


              if(str.length()-1!=-1){
                  if(  str.substring(str.length() - 1).equals(".") ){
                      str = str.substring(0, str.length() - 1);

                  }

              }



                this.setTextViewText(str);





                break; // break es opcional

            case R.id.Boton1entrex :
                float number = 0;
                number = Float.valueOf(this.textviewVentana.getText().toString());

                this.setTextViewText( String.valueOf(  1 / number ));


                break; // break es opcional

            case R.id.BotonC :

                this.setTextViewText("");


                break; // break es opcional

            case R.id.BotonCE :

                this.num1=null;
                this.num2=null;
                this.setTextViewText("");


                break; // break es opcional



            // Podemos tener cualquier número de declaraciones de casos o case
            // debajo se encuentra la declaración predeterminada, que se usa cuando ninguno de los casos es verdadero.
            // No se necesita descanso en el case default
            default :
                // Declaraciones
        }








    }
}