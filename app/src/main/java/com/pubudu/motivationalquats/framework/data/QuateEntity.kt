package com.pubudu.motivationalquats.framework.data

import com.pubudu.lib.data.Quate

data class QuateEntity(
    val quate : String,
    val author : String
){
    companion object{
        fun fromQUate(quate: Quate) = QuateEntity(quate.quate,quate.author)
    }
    fun toQuate(quateEntity: QuateEntity) = Quate(quateEntity.quate,quateEntity.author)
}
