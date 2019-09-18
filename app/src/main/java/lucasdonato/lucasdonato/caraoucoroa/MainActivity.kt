package lucasdonato.lucasdonato.caraoucoroa

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

   open override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_jogar.setOnClickListener{
            val intent = Intent(applicationContext, JogoActivity::class.java)
            startActivity(intent)
       }

    }
}
