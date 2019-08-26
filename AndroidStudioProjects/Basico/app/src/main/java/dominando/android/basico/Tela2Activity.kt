package dominando.android.basico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dominando.android.basico.models.Cliente
import dominando.android.basico.models.Cliente3
import dominando.android.basico.models.PessoaSerialize
import kotlinx.android.synthetic.main.activity_tela2.*
import org.parceler.Parcels

class Tela2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val nome = intent.getStringExtra("nome")
        val idade = intent.getIntExtra("idade", -1)
        val cliente = intent.getParcelableExtra<Cliente>("cliente")
        val pessoa = intent.getSerializableExtra("pessoa") as PessoaSerialize?

        val cliente3 = Parcels.unwrap<Cliente3?>(intent.getParcelableExtra("cliente3"))

        textMensagem.text = if(cliente != null){
            getString(R.string.tela2_texto1, cliente.nome, cliente.codigo)
        }else if(pessoa != null) {
            getString(R.string.tela2_texto2, pessoa.nome, pessoa.idade)
        }else{
            getString(R.string.tela2_texto2, nome, idade)
        }




        //textMensagem.text = "Nome: $nome / Idade: $idade"
 /*       if(null != cliente){
            Toast.makeText(this,  cliente.nome + cliente.codigo, Toast.LENGTH_LONG).show()
        }else{
            textMensagem.text = intent.getStringExtra("valorDigitado")
        }

        if(pessoa != null){
            textMensagem.text = "Meu Nome: ${pessoa.nome} / Idade: ${pessoa.idade}"
        }
*/

    }
}
