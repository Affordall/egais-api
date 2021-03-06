package ru.evotor.egais.api.provider.waybillact

import android.net.Uri
import ru.evotor.egais.api.provider.EgaisApi

object WayBillActPositionContract {
    @JvmField
    val URI = Uri.withAppendedPath(EgaisApi.BASE_URI, "WayBillActPosition")

    /**
     * UUID акта. Не может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_UUID = "UUID"

    /**
     * Идентификатор позиции внутри накладной. Не может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_IDENTITY = "IDENTITY"

    /**
     * Количество. Не может быть null.
     *
     * Тип: LONG
     */
    const val COLUMN_QUANTITY = "QUANTITY"

    /**
     * Регистрационный номер раздела справки 2. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_INFORM_F2_REG_ID = "INFORM_F2_REG_ID"
}