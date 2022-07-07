package com.gdsc.sogongsogong.ui.board

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.gdsc.sogongsogong.di.dispatcher.DispatcherProvider
import com.gdsc.sogongsogong.data.datasource.PostDataSource
import com.gdsc.sogongsogong.data.entity.Post
import com.gdsc.sogongsogong.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class BoardViewModel @Inject constructor(
    dispatcherProvider: DispatcherProvider,
    private val postDataSource: PostDataSource
) : BaseViewModel(dispatcherProvider) {

    private var _posts: MutableStateFlow<List<Post>> = MutableStateFlow(emptyList())
    val posts: StateFlow<List<Post>> = _posts

    private val _recyclerViewClickEvent = MutableSharedFlow<Unit>()
    val recyclerViewClickEvent: SharedFlow<Unit> = _recyclerViewClickEvent

    init {
        fetchInitAllPosts()
    }

    private fun fetchInitAllPosts() = onIo {
        _posts.emit(postDataSource.fetchInitAllPost())
    }

    fun fetchAllPost(page: Int) = onIo {
        postDataSource.fetchAllPost(page.toLong())
    }

    fun emitRecyclerViewClickEvent() = onMain {
        _recyclerViewClickEvent.emit(Unit)
    }
}
