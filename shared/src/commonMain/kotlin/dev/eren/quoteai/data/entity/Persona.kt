package dev.eren.quoteai.data.entity

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass
import org.mongodb.kbson.BsonObjectId

/**
 * Created by erenalpaslan on 25.05.2023
 */
class Persona: RealmObject {
    @PrimaryKey
    var id: BsonObjectId = BsonObjectId.invoke()
    var name: String = ""
    var prompt: String = ""
    var isActive: Boolean = false
    var createdAt: Long = 0L
}

@Serializable
data class QPersona (
    val id: BsonObjectId,
    val name: String,
    val prompt: String,
    val isActive: Boolean,
    val createdAt: Long
)