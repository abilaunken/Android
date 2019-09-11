package dominando.android.adapter.models

import org.parceler.Parcel

@Parcel
class Carrinho (public var modelo : String = "", public var ano: Int  = 0) {
    override fun toString(): String {
        return "Modelo='$modelo', Ano=$ano"
    }
}