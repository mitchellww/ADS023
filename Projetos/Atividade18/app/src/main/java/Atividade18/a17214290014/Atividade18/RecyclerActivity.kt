package Atividade18.a17214290001.Atividade18

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class RecyclerAdapter(private val itens: List<String, private val contexto: Context): RecyclerView.Adapter<RecyclerActivity.RecyclerAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerActivity.RecyclerAdapter.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: RecyclerActivity.RecyclerAdapter.ViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setTitle("Recycler")
        setContentView(R.layout.activity_recycler)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        val lista: List<String> = listOf<String>(
            "Asa Sul",
            "Asa Norte",
            "Sudoeste",
            "Noroeste",
            "Lago Sul",
            "Lago Norte",
            "Aguas Claras",
            "Candangolandia",
            "Nucleo Bandeirantes",
            "Vicentes Pires",
            "Taguatinga",
            "Ceilandia",
            "Samambaia"
        )
    }
}
