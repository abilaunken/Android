package dominando.android.ciclovidaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("GABI", "Tela1::onCreate")

        buttonProximo.setOnClickListener {
            val proximaTela = Intent(this,SegundaActivity::class.java)
            proximaTela.putExtra("tituloSegundaTela","Tela de teste do ciclo de vida")
            startActivity(proximaTela)


        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("GABI", "Tela1::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("GABI", "Tela1::onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("GABI", "Tela1::onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("GABI", "Tela1::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("GABI", "Tela1::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("GABI", "Tela1::onDestroy")
    }
}
