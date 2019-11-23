package Atividade17.a17214290001.Atividade17

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View

class ContatoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contato)
    }

    fun salvar(view: View){
        val builder = AlertDialog.Builder(this)

        with(builder)
        {
            setTitle("Enviado com sucesso")
            show()
        }

    }
}
