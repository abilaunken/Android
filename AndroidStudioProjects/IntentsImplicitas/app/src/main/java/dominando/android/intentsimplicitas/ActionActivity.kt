package dominando.android.intentsimplicitas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import kotlinx.android.synthetic.main.content_action.*

class ActionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action)

        if (intent.action == Intent.ACTION_VIEW) {
            val uri = intent.data
            txtAction.text = getString(R.string.custom_action2, uri.toString(), uri?.path, uri?.host)
        } else if (intent.action == "dominando.android.CUSTOM_ACTION") {
            txtAction.text = getString(R.string.custom_action1)
        }

    }

}
