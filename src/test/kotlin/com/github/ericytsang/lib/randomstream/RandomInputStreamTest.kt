package com.github.ericytsang.lib.randomstream

import org.junit.Test
import java.io.DataInputStream

class RandomInputStreamTest
{
    val randomInputStream = RandomInputStream()

    @Test
    fun generatesAllCombinationsOfBits()
    {
        val allBytes = (Byte.MIN_VALUE..Byte.MAX_VALUE).toMutableSet()
        val ba = byteArrayOf(0)
        while (allBytes.isNotEmpty())
        {
            randomInputStream.read(ba)
            allBytes.remove(ba[0].toInt())
            println(allBytes)
        }
    }

    @Test
    fun canBeUsedWithDataInputStream()
    {
        println(DataInputStream(randomInputStream).readLong())
        println(DataInputStream(randomInputStream).readLong())
        println(DataInputStream(randomInputStream).readLong())
        println(DataInputStream(randomInputStream).readLong())
        println(DataInputStream(randomInputStream).readLong())
        println(DataInputStream(randomInputStream).readLong())
        println(DataInputStream(randomInputStream).readLong())
    }
}
