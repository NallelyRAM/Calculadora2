package mx.itson.edu.calculadora2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var numero: Double= 0.0
    lateinit var tx_pone: TextView
    lateinit var tx_Resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tx_pone= findViewById(R.id.pone)
        tx_Resultado= findViewById(R.id.resultado)
    }


    fun presionarDigito(view: View){
       // val tx_pone: TextView = findViewById(R.id.pone)
        var num2: String = tx_pone.text.toString()

        when(view.id){
            R.id.btn0 -> tx_pone.setText(num2 + "0")
            R.id.btn1 -> tx_pone.setText(num2 + "1")
            R.id.btn2 -> tx_pone.setText(num2 + "2")
            R.id.btn3 -> tx_pone.setText(num2 + "3")
            R.id.btn4 -> tx_pone.setText(num2 + "4")
            R.id.btn5 -> tx_pone.setText(num2 + "5")
            R.id.btn6 -> tx_pone.setText(num2 + "6")
            R.id.btn7 -> tx_pone.setText(num2 + "7")
            R.id.btn8 -> tx_pone.setText(num2 + "8")
            R.id.btn9 -> tx_pone.setText(num2 + "9")
            R.id.btnPunto -> tx_pone.setText(num2 + ".")
        }


    }

    fun clickOperación(view: View){
    
    }
}