package noblur.com.exomindtest.data.source.local.photolocal


import androidx.annotation.VisibleForTesting
import noblur.com.exomindtest.data.entities.Album
import noblur.com.exomindtest.data.entities.Photo
import noblur.com.exomindtest.data.entities.User
import noblur.com.exomindtest.data.repository.AlbumDataSource
import noblur.com.exomindtest.data.repository.PhotoDataSource
import noblur.com.exomindtest.data.repository.UserDataSource
import noblur.com.exomindtest.utils.AppExecutors


class PhotoLocalDataSource(
    val appExecutors: AppExecutors,
    val photoDao: PhotoDao
): PhotoDataSource {

    override fun getPhotosByAlbumId(albumId: Int, callback: PhotoDataSource.GetPhotosCallback) {

    }

    override fun registerPhotos(photos: List<Photo>) {

    }

    override fun deleteAllPhotos() {

    }



    companion object {
  private var INSTANCE: PhotoLocalDataSource? = null

       @JvmStatic
       fun getInstance(appExecutors: AppExecutors,photoDao: PhotoDao): PhotoLocalDataSource {
        if (INSTANCE == null) {
         synchronized(PhotoLocalDataSource::javaClass) {
          INSTANCE =
              PhotoLocalDataSource(appExecutors, photoDao)
         }
        }
        return INSTANCE!!
       }

       @VisibleForTesting
       fun clearInstance() {
        INSTANCE = null
       }
 }



}