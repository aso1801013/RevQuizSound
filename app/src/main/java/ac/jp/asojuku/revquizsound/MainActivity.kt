package ac.jp.asojuku.revquizsound

import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var soundPool: SoundPool
    private var soundResId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume(){
        super.onResume()
        soundPool = SoundPool(2, AudioManager.STREAM_ALARM, 0)
        soundResId = soundPool.load(this, R.raw.bellsound, 1)
    }

    override fun onPause(){
        super.onPause()
        soundPool.release()
    }
}
