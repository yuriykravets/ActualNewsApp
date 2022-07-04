package com.yuriycode.actualnewsapp.ui.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.yuriycode.actualnewsapp.R
import com.yuriycode.actualnewsapp.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {

    private var _binding:FragmentDetailsBinding? = null
    private val mBinding get() = _binding!!
    private val bundleArgs: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater:LayoutInflater, container:ViewGroup?,
        savedInstanceState:Bundle?
    ):View? {
        _binding = FragmentDetailsBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view:View, savedInstanceState:Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val articleArg = bundleArgs.article



        articleArg.let { article ->
            article.urlToImage.let {
                Glide.with(this).load(article.urlToImage).into(mBinding.headerImage)
            }
            mBinding.headerImage.clipToOutline = true
            mBinding.articleDetailsTitle.text = article.title
            mBinding.articleDetailsDescriptionText.text = article.description

            mBinding.articleDetailsButton.setOnClickListener {
                try {

                } catch ( ex)
            }

        }
    }
}