package com.tashuseyin.case_3gram.presentation.albums

import com.tashuseyin.case_3gram.domain.model.AlbumItem
import com.tashuseyin.case_3gram.domain.model.PhotoItem

data class AlbumState(
    val isLoading: Boolean = false,
    val albumList: List<Pair<AlbumItem, List<PhotoItem>>> = emptyList(),
    val errorText: String = "",
)
