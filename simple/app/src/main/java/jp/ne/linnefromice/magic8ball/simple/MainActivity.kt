package jp.ne.linnefromice.magic8ball.simple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.ne.linnefromice.magic8ball.simple.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}
