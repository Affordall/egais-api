package ru.evotor.egais.api.provider.dictionary

import android.net.Uri
import ru.evotor.egais.api.provider.EgaisApi

object OrganizationContract {
    @JvmField
    val URI = Uri.withAppendedPath(EgaisApi.BASE_URI, "Organization")

    /**
     * Код организации. Не может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_REG_ID = "REG_ID"

    /**
     * Тип организации. Может быть null.
     * Возможные значения:
     * - UL - Юридическое лицо
     * - FL - Индивидуальный предприниматель
     * - FO - Иностранец (исключая таможенный союз)
     * - TS - Таможенный союз
     *
     * Тип: STRING
     */
    const val COLUMN_TYPE = "TYPE"

    /**
     * Наименование организации полное. Не может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_FULL_NAME = "FULL_NAME"

    /**
     * Наименование организации краткое. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_SHORT_NAME = "SHORT_NAME"

    /**
     * ИНН. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_INN = "INN"

    /**
     * КПП. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_KPP = "KPP"

    /**
     * УНП для респ.Беларусь. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_UNP = "UNP"

    /**
     * РНН(БИН/ИИН) для респ.Казахстан. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_RNN = "RNN"

    /**
     * Статус: действующая или удалена. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_STATE = "STATE"
}