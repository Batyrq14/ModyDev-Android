package com.batyrcode.kirispebolim

import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.batyrcode.kirispebolim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         val audioManager = getSystemService(AUDIO_SERVICE) as AudioManager

        binding.buttonDo.setOnClickListener{
            val MediaPlayer = MediaPlayer.create(this, R.raw.do_sound)
        }
        binding.buttonRe.setOnClickListener{
            val MediaPlayer = MediaPlayer.create(this, R.raw.re)
            MediaPlayer.start()
        }
        binding.buttonMi.setOnClickListener{
            val MediaPlayer = MediaPlayer.create(this, R.raw.mi)
            MediaPlayer.start()
        }
        binding.buttonFa.setOnClickListener{
            val MediaPlayer = MediaPlayer.create(this, R.raw.fa)
            MediaPlayer.start()
        }
        binding.buttonSol.setOnClickListener{
            val MediaPlayer = MediaPlayer.create(this, R.raw.sol)
            MediaPlayer.start()
        }
        binding.buttonLa.setOnClickListener{
            val MediaPlayer = MediaPlayer.create(this, R.raw.la)
            MediaPlayer.start()
        }
        binding.buttonTi.setOnClickListener{
            val MediaPlayer = MediaPlayer.create(this, R.raw.ti)
            MediaPlayer.start()
        }

        binding.buttonIncrease.setOnClickListener{
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND)
        }

        binding.buttonDecrease.setOnClickListener{
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND)
        }


    }
}