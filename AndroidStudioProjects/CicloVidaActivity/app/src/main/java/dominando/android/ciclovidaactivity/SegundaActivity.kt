package dominando.android.ciclovidaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_segunda.*
import kotlinx.android.synthetic.main.activity_segunda.view.*

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)


        val tituloTela2 = intent.getStringExtra("tituloSegundaTela")

        findViewById<TextView>(R.id.titulo).text = tituloTela2

        Log.i("GABI", "Tela2::onCreate")

        button.setOnClickListener {
            val terceiraTela = Intent(this, TerceiraActivity::class.java)
            terceiraTela.putExtra("titulo3Tela", "Ciclo de vida terceira Tela")
            startActivity(terceiraTela)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("GABI", "Tela2::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("GABI", "Tela2::onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("GABI", "Tela2::onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("GABI", "Tela2::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("GABI", "Tela2::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("GABI", "Tela2::onDestroy")
    }
}
