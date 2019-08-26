package dominando.android.ciclovidaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_terceira.*

class TerceiraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira)

        val titulo = intent.getStringExtra("titulo3Tela")
        findViewById<TextView>(R.id.textView2).text = titulo

        Log.i("GABI", "Tela3::onCreate")
    }


    override fun onStart() {
        super.onStart()
        Log.i("GABI", "Tela3::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("GABI", "Tela3::onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("GABI", "Tela3::onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("GABI", "Tela3::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("GABI", "Tela3::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("GABI", "Tela3::onDestroy")
    }
}
