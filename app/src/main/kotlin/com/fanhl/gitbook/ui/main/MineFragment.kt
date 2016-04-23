package com.fanhl.gitbook.ui.main

import android.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fanhl.gitbook.R
import rx.lang.kotlin.observable

/**
 * Created by fanhl on 16/4/19.
 */
class MineFragment : Fragment() {
    val TAG = MineFragment::class.java.name

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_mine, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}