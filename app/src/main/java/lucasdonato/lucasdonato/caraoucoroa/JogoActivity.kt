package lucasdonato.lucasdonato.caraoucoroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.ImageViewCompat
import kotlinx.android.synthetic.main.activity_jogo.*
import kotlin.random.Random

class JogoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo)

        val numero = Random.nextInt(2)

        if ( numero == 0 ) {
            imagem_resultado.setImageResource(R.drawable.moeda_cara)
        } else {
            imagem_resultado.setImageResource(R.drawable.moeda_coroa)
        }

        button_voltar.setOnClickListener{

            finish()

        }

    }
}
