package com.example.youtube.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.youtube.data.model.Item
import com.example.youtube.data.model.PlayListItem
import com.example.youtube.data.model.Playlists
import com.example.youtube.data.repo.YouTubeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

class MainViewModel (private val repository: YouTubeRepository) : ViewModel() {

  //  private val _playlists = MutableLiveData<Playlists>()
    ////val playlists: LiveData<Playlists> = _playlists

    fun getPlaylists():LiveData<Playlists>  {
       return repository.getPlaylists()
    }
}