package com.magicapp.android_mvp.presenter

import com.magicapp.android_mvp.model.Post

interface MainPresenterImpl {
    fun apiPostList()
    fun apiPostDelete(post: Post)
}