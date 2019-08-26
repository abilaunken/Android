package dominando.android.basico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dominando.android.basico.models.Cliente
import dominando.android.basico.models.Cliente3
import dominando.android.basico.models.PessoaSerialize
import kotlinx.android.synthetic.main.activity_main.*
import org.parceler.Parcels

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val edtTexto = findViewById<EditText>(R.id.editTexto)
        //val button = findViewById<Button>(R.id.buttonToast)
        val intent = Intent(this, Tela2Activity::class.java)
        val cliente3 = Cliente3(0, "Gabiz")
        intent.putExtra("cliente3", Parcels.wrap(cliente3))


        buttonToast.setOnClickListener {
            val texto = editTexto.text.toString()
            Toast.makeText(this, texto, Toast.LENGTH_LONG).show()
        }

        buttonTela2.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            val texto = editTexto.text.toString()
            intent.putExtra("valorDigitado", texto)
            intent.putExtra("nome", "Gabriela")
            intent.putExtra("idade", 29)
            startActivity(intent)
        }

        buttonParcel.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            val cliente = Cliente(1, "Gabriela")
            intent.putExtra("cliente", cliente)
            startActivity(intent)
        }

        buttonSerializable.setOnClickListener {
            val texto = editTexto.text.toString()
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("pessoa", PessoaSerialize(texto, 30))
            startActivity(intent)
        }


    }
}
