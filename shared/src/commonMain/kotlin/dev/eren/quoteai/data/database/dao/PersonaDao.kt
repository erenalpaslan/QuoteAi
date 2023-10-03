package dev.eren.quoteai.data.database.dao

import dev.eren.quoteai.data.entity.Persona
import org.mongodb.kbson.BsonObjectId

/**
 * Created by erenalpaslan on 27.05.2023
 */
interface PersonaDao {

    suspend fun getPersonaList(): List<Persona>

    suspend fun selectPersona(persona: Persona): Persona

    suspend fun getPersona(id: BsonObjectId): Persona?

}