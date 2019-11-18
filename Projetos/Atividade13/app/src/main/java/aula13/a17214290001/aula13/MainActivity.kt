package aula13.a17214290001.aula13

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            R.id.notas -> {
                val intencao = Intent(this@MainActivity, NotaActivity::class.java)
                startActivity(intencao)
                return true
            }
            R.id.faltas -> {
                val intencao = Intent(this@MainActivity, FaltaActivity::class.java)
                startActivity(intencao)
                return true
            }
            R.id.requerimentos -> {
                val intencao = Intent(this@MainActivity, RequerimentoActivity::class.java)
                startActivity(intencao)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
