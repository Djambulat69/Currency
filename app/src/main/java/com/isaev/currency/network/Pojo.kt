package com.isaev.currency.network

import com.google.gson.annotations.SerializedName


data class Currency(
    var date: String,
    var previousDate: String,
    var previousURL: String,
    var timestamp: String,
    var valute: List<VLT>
)

data class ValuteData(

    @SerializedName("Date") var Date: String,
    @SerializedName("PreviousDate") var PreviousDate: String,
    @SerializedName("PreviousURL") var PreviousURL: String,
    @SerializedName("Timestamp") var Timestamp: String,
    @SerializedName("Valute") var Valute: Valute

)

data class Valute(

    @SerializedName("AUD") var AUD: AUD,
    @SerializedName("AZN") var AZN: AZN,
    @SerializedName("GBP") var GBP: GBP,
    @SerializedName("AMD") var AMD: AMD,
    @SerializedName("BYN") var BYN: BYN,
    @SerializedName("BGN") var BGN: BGN,
    @SerializedName("BRL") var BRL: BRL,
    @SerializedName("HUF") var HUF: HUF,
    @SerializedName("VND") var VND: VND,
    @SerializedName("HKD") var HKD: HKD,
    @SerializedName("GEL") var GEL: GEL,
    @SerializedName("DKK") var DKK: DKK,
    @SerializedName("AED") var AED: AED,
    @SerializedName("USD") var USD: USD,
    @SerializedName("EUR") var EUR: EUR,
    @SerializedName("EGP") var EGP: EGP,
    @SerializedName("INR") var INR: INR,
    @SerializedName("IDR") var IDR: IDR,
    @SerializedName("KZT") var KZT: KZT,
    @SerializedName("CAD") var CAD: CAD,
    @SerializedName("QAR") var QAR: QAR,
    @SerializedName("KGS") var KGS: KGS,
    @SerializedName("CNY") var CNY: CNY,
    @SerializedName("MDL") var MDL: MDL,
    @SerializedName("NZD") var NZD: NZD,
    @SerializedName("NOK") var NOK: NOK,
    @SerializedName("PLN") var PLN: PLN,
    @SerializedName("RON") var RON: RON,
    @SerializedName("XDR") var XDR: XDR,
    @SerializedName("SGD") var SGD: SGD,
    @SerializedName("TJS") var TJS: TJS,
    @SerializedName("THB") var THB: THB,
    @SerializedName("TRY") var TRY: TRY,
    @SerializedName("TMT") var TMT: TMT,
    @SerializedName("UZS") var UZS: UZS,
    @SerializedName("UAH") var UAH: UAH,
    @SerializedName("CZK") var CZK: CZK,
    @SerializedName("SEK") var SEK: SEK,
    @SerializedName("CHF") var CHF: CHF,
    @SerializedName("RSD") var RSD: RSD,
    @SerializedName("ZAR") var ZAR: ZAR,
    @SerializedName("KRW") var KRW: KRW,
    @SerializedName("JPY") var JPY: JPY
)

data class VLT(
    var id: String,
    var numCode: String,
    var charCode: String,
    var nominal: Int,
    var name: String,
    var value: String,
    var prevValue: String
)

data class AUD(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class AZN(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class GBP(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class AMD(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class BYN(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class BGN(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class BRL(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class HUF(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class VND(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class HKD(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class GEL(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class DKK(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class AED(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class USD(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class EUR(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class EGP(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class INR(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class IDR(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class KZT(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class CAD(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class QAR(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class KGS(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class CNY(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class MDL(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class NZD(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class NOK(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class PLN(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class RON(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class XDR(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class SGD(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class TJS(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class THB(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class TRY(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class TMT(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class UZS(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class UAH(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class CZK(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class SEK(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class CHF(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class RSD(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class ZAR(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class KRW(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)

data class JPY(

    @SerializedName("ID") var ID: String,
    @SerializedName("NumCode") var NumCode: String,
    @SerializedName("CharCode") var CharCode: String,
    @SerializedName("Nominal") var Nominal: Int,
    @SerializedName("Name") var Name: String,
    @SerializedName("Value") var Value: String,
    @SerializedName("Previous") var Previous: String

)
