package dev.eren.quoteai.data.repository

import dev.eren.quoteai.data.database.dao.PersonaDao
import dev.eren.quoteai.data.entity.Persona
import io.realm.kotlin.Realm
import io.realm.kotlin.ext.query
import org.mongodb.kbson.BsonObjectId

/**
 * Created by erenalpaslan on 27.05.2023
 */
class PersonaRepositoryImpl(
    private val realm: Realm
): PersonaDao {
    override suspend fun getPersonaList(): List<Persona> {
        return realm.query<Persona>().find().toList()
    }

    override suspend fun selectPersona(persona: Persona): Persona {
        //TODO("Not yet implemented")
        return persona
    }

    override suspend fun getPersona(id: BsonObjectId): Persona? {
        return realm.query<Persona>("id == $0", id).first().find()
    }
}