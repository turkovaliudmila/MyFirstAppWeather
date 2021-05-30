package ru.geekbrains.myfirstappweather.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.geekbrains.myfirstappweather.R
import ru.geekbrains.myfirstappweather.databinding.MainActivityBinding
import ru.geekbrains.myfirstappweather.view.main.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(getLayoutInflater())
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }
}