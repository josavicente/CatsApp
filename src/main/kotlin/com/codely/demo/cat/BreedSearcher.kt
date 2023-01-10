package com.codely.demo.cat

class BreedSearcher(private val repository: BreedRepository) {
    fun search(): List<Cat.Breed> {
        return repository.findAll().map {
            Cat.Breed(it)
        }
    }
}