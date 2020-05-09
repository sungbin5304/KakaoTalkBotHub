package com.sungbin.autoreply.bot.three.utils.bot

import com.sungbin.sungbintool.StorageUtils
import java.io.File

object SimpleBotUtils {

    private fun getPath(name: String, type: String): String{
        return "Android/data/com.sungbin.autoreply.bot.three/KakaoTalkBotHub/Bots/simple/$name/$type.data"
    }

    fun save(name: String, sender: String, room: String, type: String, message: String, reply: String){
        var path = getPath(name, "sender")
        StorageUtils.save(path, sender)

        path = getPath(name, "room")
        StorageUtils.save(path, room)

        path = getPath(name, "type")
        StorageUtils.save(path, type)

        path = getPath(name, "message")
        StorageUtils.save(path, message)

        path = getPath(name, "reply")
        StorageUtils.save(path, reply)
    }

    fun get(name: String, type: String): String{
        return StorageUtils.read(
            getPath(name, type), ""
        )
    }

    fun remove(name: String, type: String){
        StorageUtils.delete(getPath(name, type))
    }
}