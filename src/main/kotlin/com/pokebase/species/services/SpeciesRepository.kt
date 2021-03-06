package com.pokebase.species.services

import com.pokebase.database.entities.Move
import com.pokebase.database.entities.Species
import com.pokebase.species.dto.SpeciesAdd
import com.pokebase.species.dto.SpeciesResponse

interface SpeciesRepository {
    fun create(species: SpeciesAdd): Int
    fun read(speciesId: Int): SpeciesResponse?
    fun readAll(): List<Species>
    fun getMoves(speciesId: Int): List<Move>
}