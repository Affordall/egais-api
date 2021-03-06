package ru.evotor.egais.api.provider.waybill

import android.net.Uri
import ru.evotor.egais.api.provider.EgaisApi

object WayBillContract {
    @JvmField
    val URI = Uri.withAppendedPath(EgaisApi.BASE_URI, "WayBill")

    /**
     * UUID накладной. Не может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_UUID = "UUID"

    /**
     * Идентификатор накладной (клиентский, к заполнению необязательный). Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_IDENTITY = "IDENTITY"

    /**
     * Отправитель накладной. Не может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_OWNER_REG_ID = "OWNER_REG_ID"

    /**
     * Тип накладной. Не может быть null.
     *
     * Возможные значения:
     * - INVOICE_FROM_ME - расход
     * - RETURN_TO_ME - возврат мне
     * - INVOICE_TO_ME - приход
     * - RETURN_FROM_ME - возврат от меня
     *
     * Тип: STRING
     */
    const val COLUMN_TYPE = "TYPE"

    /**
     * тип упаковки. Не может быть null.
     *
     * Возможные значения:
     * - PACKED - упакованная
     * - UNPACKED - неупакованная
     *
     * Тип: STRING
     */
    const val COLUMN_UNIT_TYPE = "UNIT_TYPE"

    /**
     * Номер документа. Не может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_NUMBER = "NUMBER"

    /**
     * Дата составления. Не может быть null.
     *
     * Тип: LONG
     */
    const val COLUMN_DATE = "DATE"

    /**
     * Дата отгрузки продукции. Не может быть null.
     *
     * Тип: LONG
     */
    const val COLUMN_SHIPPING_DATE = "SHIPPING_DATE"

    /**
     * Грузоотправитель. Не может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_SHIPPER_CLIENT_REG_ID = "SHIPPER_CLIENT_REG_ID"

    /**
     * Грузополучатель. Не может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_CONSIGNEE_CLIENT_REG_ID = "CONSIGNEE_CLIENT_REG_ID"

    /**
     * Поставщик. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_SUPPLIER_CLIENT_REG_ID = "SUPPLIER_CLIENT_REG_ID"

    /**
     * Основание. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_BASE = "BASE"

    /**
     * Заметки. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_NOTE = "NOTE"

    /**
     * Текущий статус накладной. Не может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_STATE = "STATE"

    /**
     * Транспорт. Тип перевозки. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_TRANSPORT_TYPE = "TRANSPORT_TYPE"
    /**
     * Транспорт. Название компании перевозчика. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_TRANSPORT_COMPANY = "TRANSPORT_COMPANY"
    /**
     * Транспорт. Автомобиль. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_TRANSPORT_CAR = "TRANSPORT_CAR"
    /**
     * Транспорт. Прицеп. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_TRANSPORT_TRAILER = "TRANSPORT_TRAILER"
    /**
     * Транспорт. Заказчики. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_TRANSPORT_CUSTOMER = "TRANSPORT_CUSTOMER"
    /**
     * Транспорт. Водитель. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_TRANSPORT_DRIVER = "TRANSPORT_DRIVER"
    /**
     * Транспорт. Место погрузки. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_TRANSPORT_LOADPOINT = "TRANSPORT_LOADPOINT"
    /**
     * Транспорт. Место разгрузки. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_TRANSPORT_UNLOADPOINT = "TRANSPORT_UNLOADPOINT"
    /**
     * Транспорт. Перенаправление. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_TRANSPORT_REDIRECT = "TRANSPORT_REDIRECT"
    /**
     * Транспорт. Экспедитор. Может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_TRANSPORT_FORWARDER = "TRANSPORT_FORWARDER"

    /**
     * ИД накладной в системе ЕГАИС. Не может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_INFORM_F2_WB_REG_ID = "INFORM_F2_WB_REG_ID"

    /**
     * Номер фиксации накладной(отгрузки) в ЕГАИС. Не может быть null.
     *
     * Тип: STRING
     */
    const val COLUMN_INFORM_F2_EGAIS_FIX_NUMBER = "INFORM_F2_EGAIS_FIX_NUMBER"

    /**
     * Дата фиксации накладной(отгрузки) в ЕГАИС. Не может быть null.
     *
     * Тип: LONG
     */
    const val COLUMN_INFORM_F2_EGAIS_FIX_DATE = "INFORM_F2_EGAIS_FIX_DATE"
}