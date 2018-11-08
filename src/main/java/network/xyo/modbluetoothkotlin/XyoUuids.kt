package network.xyo.modbluetoothkotlin

import java.util.*

/**
 * All the XYO Bluetooth UUIDs.
 */
object XyoUuids {
    /**
     * The primary GATT service that will be advertised.
     */
    val XYO_SERVICE = UUID.fromString("133e4d1d-981d-12d9-9826-e75c724fbf45")!!

    /**
     * The GATT characteristic to be written to. This will be in the XYO_SERVICE.
     */
    val XYO_WRITE = UUID.fromString("abxe4d1d-981d-4439-9816-e75c7b424342")!!

    /**
     * The GATT characteristic to be read from. This will be in the XYO_SERVICE.
     */
    val XYO_READ = UUID.fromString("333e4d1d-924d-15d9-9256-e75c144fbf46")!!


}