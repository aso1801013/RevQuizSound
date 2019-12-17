package ac.jp.asojuku.revquizsound


import android.media.AudioManager
import android.media.SoundPool
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 */
class syutudauFragment : Fragment() {

    private lateinit var soundPool: SoundPool
    private var soundResId = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quest, container, false)


    }

    override fun onResume(){
        super.onResume()
        soundPool = soundPool(2,AudioManager.STREAM_ALARM, 0)
        soundResId = soundPool.load(this, R.raw.bellsound, 1)
    }

    override fun onPause(){
        super.onPause()
        soundPool.release()
    }


}
