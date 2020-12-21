package model

data class Attachment (
    val photo: Photo?,
    val postedPhoto: PostedPhoto?,
    val video: Video?,
    val audio: Audio?,
    val doc: Doc?,
    val graffiti: Graffiti?,
    val link: Link?,
    val note: Note?,
    val app: App?,
    val poll: Poll?,
    val page: Page?,
    val album: Album?,
    val photosList: List<Int>?,
    val market: Market?,
    val marketAlbum: MarketAlbum?,
    val sticker: Stiker?,
    val prettyCards: PrettyCard?,
    val event: Event?
    ) {

}
