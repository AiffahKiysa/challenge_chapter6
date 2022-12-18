package com.example.challenge_chapter6_fix.service

import javax.inject.Inject

class ApiHelper (private val apiService: ApiService) {

    suspend fun getAllFilmData() = apiService.getDetailFilm()
}