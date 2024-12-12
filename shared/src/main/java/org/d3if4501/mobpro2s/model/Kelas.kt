package org.d3if4501.mobpro2s.model

data class Kelas(
    val dosenId: String,
    val nama: String
) {
    constructor() : this("", "")

    companion object{
        const val COLLECTION = "kelas"
    }
}
