package model

import model.CopyImage

data class Photo (
    val id: Int,
    val albumIid: Int,
    val ownerIid: Int,
    val userIid: Int,
    val text: String,
    val date: Long,
    val sizes: Array<CopyImage>,
    val width: Int,
    val height: Int
    )
{

}
