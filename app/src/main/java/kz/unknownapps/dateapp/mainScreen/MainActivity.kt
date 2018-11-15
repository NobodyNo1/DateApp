package kz.unknownapps.dateapp.mainScreen

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import kz.unknownapps.dateapp.R
import kz.unknownapps.dateapp.databinding.MainActivityBinding
import kz.unknownapps.dateapp.mainScreen.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.main_activity)
        val binding: MainActivityBinding = DataBindingUtil.setContentView(this,
                R.layout.main_activity)
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                    .replace(R.id.container, MainFragment.newInstance())
//                    .commitNow()
//        }

    }

}
