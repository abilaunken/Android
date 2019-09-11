package dominando.android.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import dominando.android.adapter.models.Carrinho
import org.parceler.Parcels

class IntentObjectVeiculo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_intent_object_veiculo)

        val detalheCarrinho = Parcels.unwrap<Carrinho>(intent.getParcelableExtra("carrinho"))


        val carrinhoList = mutableListOf(detalheCarrinho.toString());

        val listView = ListView(this)
        setContentView(listView)


        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            carrinhoList)

        listView.adapter = adapter

        listView.setOnItemClickListener{ _,_,position,_->
            val carrinhoSelecionado = carrinhoList[position]
            Toast.makeText(this, carrinhoSelecionado, Toast.LENGTH_LONG).show()

        }

    }
}
