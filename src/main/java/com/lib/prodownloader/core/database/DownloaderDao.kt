package com.lib.prodownloader.core.database

import com.lib.prodownloader.core.model.DownloaderData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    21/6/2019
 * Email:   alirezat775@gmail.com
 */
@Dao
internal interface DownloaderDao {

    @Query("SELECT * FROM DownloaderData WHERE url IS :url")
    fun getDownloadByUrl(url: String): DownloaderData

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNewDownload(vararg item: DownloaderData)

    @Query("UPDATE DownloaderData SET status= :success, progress=:progress, size=:downloadedBytes, totalBytes=:totalBytes WHERE url IS :url")
    fun updateDownload(url: String, success: Int, percent: Int, downloadedSize: Int, totalSize: Int)
}