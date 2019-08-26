package dominando.android.basico.models

import org.parceler.Parcel
import org.parceler.ParcelConstructor


@Parcel
class Cliente3(var codigo: Int, var nome: String){
    @ParcelConstructor constructor() : this(0,"")
}