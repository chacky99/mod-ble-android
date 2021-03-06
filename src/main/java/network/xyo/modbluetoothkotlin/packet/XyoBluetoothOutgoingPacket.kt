package network.xyo.modbluetoothkotlin.packet

import network.xyo.sdkobjectmodelkotlin.objects.toHexString
import java.nio.ByteBuffer

/**
 * A class to chunk bluetooth data when writing to a GATT.
 *
 * @param chunkSize The number of bytes per chunk.
 * @param bytes The bytes to chunk.
 */
class XyoBluetoothOutgoingPacket (private val chunkSize : Int, bytes : ByteArray) {
    private var currentIndex = 0
    private val sizeWithBytes = getSizeWithBytes(bytes)

    private fun getSizeWithBytes (bytes : ByteArray) : ByteArray {
        val buff = ByteBuffer.allocate(bytes.size + 4)
        buff.putInt(bytes.size + 4)
        buff.put(bytes)
        return buff.array()
    }

    /**
     * If there are more packets to send.
     */
    val canSendNext : Boolean
        get() {
            return sizeWithBytes.size != currentIndex
        }


    /**
     * Gets the next packet to send.
     */
    fun getNext() : ByteArray {
        val packet = ByteArray(Math.min(chunkSize, (sizeWithBytes.size - currentIndex)))


        for (i in 0 until packet.size) {
            packet[i] = sizeWithBytes[currentIndex]
            currentIndex++
        }

        return packet
    }
}