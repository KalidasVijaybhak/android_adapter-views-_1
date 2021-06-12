package fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.completeadapterview.FragmentStudyMain
import com.example.completeadapterview.MainActivity
import com.example.completeadapterview.R
import kotlinx.android.synthetic.main.fragment_one.*

class  FragmentOne : Fragment( ) {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val thiscontext = container?.context;          //to get context
     val root:ViewGroup = inflater.inflate(R.layout.fragment_one, container, false) as ViewGroup
          val buttonTest:Button = root.findViewById(R.id.buttonTest)
        buttonTest.setOnClickListener{

                startActivity(Intent(thiscontext,MainActivity::class.java))
             
        }
        return root
    }


}