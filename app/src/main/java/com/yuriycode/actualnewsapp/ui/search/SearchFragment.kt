package com.yuriycode.actualnewsapp.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yuriycode.actualnewsapp.R
import com.yuriycode.actualnewsapp.databinding.FragmentDetailsBinding
import com.yuriycode.actualnewsapp.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private var _binding:FragmentSearchBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater:LayoutInflater, container:ViewGroup?,
        savedInstanceState:Bundle?
    ):View? {
        _binding = FragmentSearchBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}