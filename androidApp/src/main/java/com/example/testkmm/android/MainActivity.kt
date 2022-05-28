package com.example.testkmm.android

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.testkmm.Greeting
import com.example.testkmm.android.logger.Logger
import com.example.testkmm.di.CommonInjector
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    //    override val viewModel: MainViewModel by viewModels { TariffBottomViewModelFactory().create(MainViewModel::class) }
    val vm by lazy {
        ViewModelProvider(
            this,
            TariffBottomViewModelFactory()
        ).get(MainViewModel::class.java)
    }

    private val scope = MainScope()


    val p = CommonInjector.useCaseSome()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.initialize()
        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
        scope.launch {
            runCatching {
                p.someExecute()
            }.onSuccess{
                tv.text = it + "asfasfasf"
            }.onFailure {
                tv.text = it.localizedMessage
            }
        }
    }

    override fun startActivity(intent: Intent?) {

    }


}
