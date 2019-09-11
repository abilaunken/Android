package dominando.android.adapter


import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dominando.android.adapter.models.Carrinho
import kotlinx.android.synthetic.main.activity_main.*
import org.parceler.Parcels


class MainActivity : AppCompatActivity() {
    // 0=VW;1=GM;2=Fiat;3=Ford
    private val vehicles = mutableListOf(
        Vehicle("Onix", 2018, 1, true, true),
        Vehicle("Uno", 2007, 2, true, false),
        Vehicle("Del Rey", 1988, 3, false, true),
        Vehicle("Gol", 2014, 0, true, true),
        Vehicle("Onix", 2018, 1, true, true),
        Vehicle("Uno", 2007, 2, true, false),
        Vehicle("Del Rey", 1988, 3, false, true),
        Vehicle("Gol", 2014, 0, true, true),
        Vehicle("Onix", 2018, 1, true, true),
        Vehicle("Uno", 2007, 2, true, false)

    )

    private lateinit var txtFooter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView.emptyView = findViewById(android.R.id.empty)

        //val listView = ListView(this)
        //setContentView(listView)

        val adapter = VehicleAdapter(this, vehicles)
        listView.adapter = adapter

        initHeaderAndFooter(listView, adapter)

        listView.setOnItemClickListener { parent, _, position, _ ->
            val vehicle = parent.getItemAtPosition(position) as? Vehicle
            if(vehicle != null){
                val(model, year) = vehicle
                Toast.makeText(this, "$model $year", Toast.LENGTH_SHORT).show()
            /*    val intent = Intent(this, IntentObjectVeiculo::class.java)
                val detalhesCarrinho = Carrinho(model,year)
                intent.putExtra("carrinho", Parcels.wrap(detalhesCarrinho))
*/
                vehicles.remove(vehicle)
                adapter.notifyDataSetChanged()
                txtFooter.text = resources.getQuantityString(
                    R.plurals.footer_text, adapter.count,adapter.count)
                //startActivity(intent)
            }

        }


       /* listView.setOnItemClickListener{parent,_,position,_->
            val vehicle = parent.getItemAtPosition(position) as? Vehicle
            if(vehicle != null){
                val(model, year) = vehicle
                //Toast.makeText(this, "$model $year", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, IntentObjectVeiculo::class.java)
                val detalhesCarrinho = Carrinho(model,year)
                intent.putExtra("carrinho", Parcels.wrap(detalhesCarrinho))
                startActivity(intent)
            }
        }*/

       /* listView.setOnItemClickListener { listView , view, position, id ->
            val (model, year) = vehicles[position]
            //Toast.makeText(this, "$model $year", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, IntentObjectVeiculo::class.java)
            val detalhesCarrinho = Carrinho(model,year)
            intent.putExtra("carrinho", Parcels.wrap(detalhesCarrinho))
            startActivity(intent)
        }*/
    }



    private fun initHeaderAndFooter(listView : ListView, adapter: VehicleAdapter) {
        val padding = 8
        val txtHeader = TextView(this)
        txtHeader.setBackgroundColor(Color.GRAY)
        txtHeader.setTextColor(Color.WHITE)
        txtHeader.setText(R.string.header_text)
        txtHeader.setPadding(padding, padding, 0, padding)
        listView.addHeaderView(txtHeader)

        txtFooter = TextView(this)
        txtFooter.text = resources.getQuantityString(
            R.plurals.footer_text, adapter.count, adapter.count)
        txtFooter.setBackgroundColor(Color.LTGRAY)
        txtFooter.gravity = Gravity.END
        txtFooter.setPadding(0, padding, padding, padding)
        listView.addFooterView(txtFooter)
    }

}