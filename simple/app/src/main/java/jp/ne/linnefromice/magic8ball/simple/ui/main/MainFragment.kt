package jp.ne.linnefromice.magic8ball.simple.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import jp.ne.linnefromice.magic8ball.simple.R
import jp.ne.linnefromice.magic8ball.simple.data.selectRandomAnswer

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.main_fragment, container, false)
        view.findViewById<Button>(R.id.btn_ok).setOnClickListener { outputRandomAnswer(view) }
        view.findViewById<Button>(R.id.btn_reset).setOnClickListener { resetQuestionForm(view) }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    // method for UI
    private fun outputRandomAnswer(view: View) {
        val input = view.findViewById<TextView>(R.id.form_question).text
        val outputText = view.findViewById<TextView>(R.id.form_answer)
        if (TextUtils.isEmpty(input)) {
            outputText.text = "!! NEED YOUR ANSWER !!"
        } else {
            outputText.text = selectRandomAnswer()
        }
    }

    private fun resetQuestionForm(view: View) {
        view.findViewById<TextView>(R.id.form_question).text = ""
        view.findViewById<TextView>(R.id.form_answer).text = ""
    }

}
