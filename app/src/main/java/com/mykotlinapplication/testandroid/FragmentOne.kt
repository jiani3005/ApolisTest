package com.mykotlinapplication.testandroid

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*

class FragmentOne: Fragment() {

    var datapass: DataPass? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        datapass = activity as MainActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_one, container, false)

        view.button.setOnClickListener(View.OnClickListener {
            datapass?.dataPassMethod(editText_name.text.toString())
        })

        return view
    }
}