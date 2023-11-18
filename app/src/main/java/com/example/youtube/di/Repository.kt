package com.example.youtube.di

import com.example.youtube.data.repo.YouTubeRepository
import org.koin.dsl.module

val  repository  = module {
    single { YouTubeRepository(get()) }
}