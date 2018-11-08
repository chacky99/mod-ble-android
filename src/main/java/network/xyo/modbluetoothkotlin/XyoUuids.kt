package network.xyo.modbluetoothkotlin

import java.util.*

/**
 * All the XYO Bluetooth UUIDs.
 */
object XyoUuids {
    /**
     * The primary GATT service that will be advertised.
     */
    val XYO_SERVICE = UUID.fromString("0b0fccdb-9862-4b79-9a3d-663506838715")!!

    /**
     * The GATT characteristic to be written to. This will be in the XYO_SERVICE.
     */
    val XYO_WRITE = UUID.fromString("6fc018ff-c50b-4fef-9953-81a6ee2e3203")!!

    /**
     * The GATT characteristic to be read from. This will be in the XYO_SERVICE.
     */
    val XYO_READ = UUID.fromString("b280ba98-54f2-4abc-ab6d-64e0e68c11b9")!!


}